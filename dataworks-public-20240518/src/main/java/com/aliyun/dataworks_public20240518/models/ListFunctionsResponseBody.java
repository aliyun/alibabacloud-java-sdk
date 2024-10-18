// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFunctionsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListFunctionsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89FB2BF0-EB00-5D03-9C34-05931001XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsResponseBody self = new ListFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionsResponseBody setPagingInfo(ListFunctionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListFunctionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListFunctionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFunctionsResponseBodyPagingInfoFunctionsDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListFunctionsResponseBodyPagingInfoFunctionsDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyPagingInfoFunctionsDataSource self = new ListFunctionsResponseBodyPagingInfoFunctionsDataSource();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyPagingInfoFunctionsDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionsResponseBodyPagingInfoFunctionsDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource extends TeaModel {
        /**
         * <p>The ID of the resource group used when you run the UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>S_resgrop_xxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource self = new ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime extends TeaModel {
        /**
         * <p>The command.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_FUNCTION</p>
         */
        @NameInMap("Command")
        public String command;

        public static ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime self = new ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListFunctionsResponseBodyPagingInfoFunctionsScript extends TeaModel {
        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>652567824470354XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The script path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The runtime.</p>
         */
        @NameInMap("Runtime")
        public ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime runtime;

        public static ListFunctionsResponseBodyPagingInfoFunctionsScript build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyPagingInfoFunctionsScript self = new ListFunctionsResponseBodyPagingInfoFunctionsScript();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyPagingInfoFunctionsScript setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFunctionsResponseBodyPagingInfoFunctionsScript setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListFunctionsResponseBodyPagingInfoFunctionsScript setRuntime(ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListFunctionsResponseBodyPagingInfoFunctionsScriptRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListFunctionsResponseBodyPagingInfoFunctions extends TeaModel {
        /**
         * <p>The file resources in an Advanced RISC Machines (ARM) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.jar,yyy.jar</p>
         */
        @NameInMap("ArmResource")
        public String armResource;

        /**
         * <p>The fully qualified class name of the UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>com.demo.Main</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The description of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>testUdf(xx,yy)</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>The time when the UDF was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1655953028000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data source information about the UDF.</p>
         */
        @NameInMap("DataSource")
        public ListFunctionsResponseBodyPagingInfoFunctionsDataSource dataSource;

        /**
         * <p>The name of the database. This parameter is returned for E-MapReduce (EMR) functions.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The overall description of the UDF.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The code of the embedded UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>print(\&quot;hello,world!\&quot;)</p>
         */
        @NameInMap("EmbeddedCode")
        public String embeddedCode;

        /**
         * <p>The type of the nested code.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Python2</li>
         * <li>Python3</li>
         * <li>Java8</li>
         * <li>Java11</li>
         * <li>Java17</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Python2</p>
         */
        @NameInMap("EmbeddedCodeType")
        public String embeddedCodeType;

        /**
         * <p>The type of the nested resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>File: general resources</li>
         * <li>Embedded: embedded resources</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>File</p>
         */
        @NameInMap("EmbeddedResourceType")
        public String embeddedResourceType;

        /**
         * <p>The description of the example.</p>
         */
        @NameInMap("ExampleDescription")
        public String exampleDescription;

        /**
         * <p>The files resources.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.jar,yyy.jar</p>
         */
        @NameInMap("FileResource")
        public String fileResource;

        /**
         * <p>The ID of the UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>580667964888595XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the UDF was last modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1655953028000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the UDF.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the UDF.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The ID of the workspace to which the UDF belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>307XXX</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The description of the return value.</p>
         */
        @NameInMap("ReturnValueDescription")
        public String returnValueDescription;

        /**
         * <p>The information about the resource group used when you run the UDF.</p>
         */
        @NameInMap("RuntimeResource")
        public ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource runtimeResource;

        /**
         * <p>The script information about the UDF.</p>
         */
        @NameInMap("Script")
        public ListFunctionsResponseBodyPagingInfoFunctionsScript script;

        /**
         * <p>The UDF type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>MATH: mathematical operation function</li>
         * <li>AGGREGATE: aggregate function</li>
         * <li>STRING: string processing function</li>
         * <li>DATE: date function</li>
         * <li>ANALYTIC: window function</li>
         * <li>OTHER: others</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MATH</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListFunctionsResponseBodyPagingInfoFunctions build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyPagingInfoFunctions self = new ListFunctionsResponseBodyPagingInfoFunctions();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setArmResource(String armResource) {
            this.armResource = armResource;
            return this;
        }
        public String getArmResource() {
            return this.armResource;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setCommandDescription(String commandDescription) {
            this.commandDescription = commandDescription;
            return this;
        }
        public String getCommandDescription() {
            return this.commandDescription;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setDataSource(ListFunctionsResponseBodyPagingInfoFunctionsDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListFunctionsResponseBodyPagingInfoFunctionsDataSource getDataSource() {
            return this.dataSource;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setEmbeddedCode(String embeddedCode) {
            this.embeddedCode = embeddedCode;
            return this;
        }
        public String getEmbeddedCode() {
            return this.embeddedCode;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setEmbeddedCodeType(String embeddedCodeType) {
            this.embeddedCodeType = embeddedCodeType;
            return this;
        }
        public String getEmbeddedCodeType() {
            return this.embeddedCodeType;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setEmbeddedResourceType(String embeddedResourceType) {
            this.embeddedResourceType = embeddedResourceType;
            return this;
        }
        public String getEmbeddedResourceType() {
            return this.embeddedResourceType;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setExampleDescription(String exampleDescription) {
            this.exampleDescription = exampleDescription;
            return this;
        }
        public String getExampleDescription() {
            return this.exampleDescription;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setFileResource(String fileResource) {
            this.fileResource = fileResource;
            return this;
        }
        public String getFileResource() {
            return this.fileResource;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setReturnValueDescription(String returnValueDescription) {
            this.returnValueDescription = returnValueDescription;
            return this;
        }
        public String getReturnValueDescription() {
            return this.returnValueDescription;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setRuntimeResource(ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setScript(ListFunctionsResponseBodyPagingInfoFunctionsScript script) {
            this.script = script;
            return this;
        }
        public ListFunctionsResponseBodyPagingInfoFunctionsScript getScript() {
            return this.script;
        }

        public ListFunctionsResponseBodyPagingInfoFunctions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFunctionsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The UDFs.</p>
         */
        @NameInMap("Functions")
        public java.util.List<ListFunctionsResponseBodyPagingInfoFunctions> functions;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>294</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFunctionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyPagingInfo self = new ListFunctionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyPagingInfo setFunctions(java.util.List<ListFunctionsResponseBodyPagingInfoFunctions> functions) {
            this.functions = functions;
            return this;
        }
        public java.util.List<ListFunctionsResponseBodyPagingInfoFunctions> getFunctions() {
            return this.functions;
        }

        public ListFunctionsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFunctionsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFunctionsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
