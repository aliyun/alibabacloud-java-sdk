// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFunctionsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListFunctionsResponseBodyPagingInfo pagingInfo;

    /**
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
         * <p>数据源名称</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>数据源类型</p>
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
         * <p>运行时资源组Id</p>
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
         * <p>脚本所属类型</p>
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
         * <p>脚本的id</p>
         * 
         * <strong>example:</strong>
         * <p>652567824470354XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>脚本路径</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>脚本的运行时信息</p>
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
         * <p>ARM集群资源文件列表</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.jar,yyy.jar</p>
         */
        @NameInMap("ArmResource")
        public String armResource;

        /**
         * <p>函数实现类名</p>
         * 
         * <strong>example:</strong>
         * <p>com.demo.Main</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>命令描述</p>
         * 
         * <strong>example:</strong>
         * <p>testUdf(xx,yy)</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>1655953028000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>函数注册到的数据源信息</p>
         */
        @NameInMap("DataSource")
        public ListFunctionsResponseBodyPagingInfoFunctionsDataSource dataSource;

        /**
         * <p>数据库名，可选</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>对funciotn的描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>嵌套函数代码内容</p>
         * 
         * <strong>example:</strong>
         * <p>print(\&quot;hello,world!\&quot;)</p>
         */
        @NameInMap("EmbeddedCode")
        public String embeddedCode;

        /**
         * <p>嵌套代码类型</p>
         * 
         * <strong>example:</strong>
         * <p>Python2</p>
         */
        @NameInMap("EmbeddedCodeType")
        public String embeddedCodeType;

        /**
         * <p>嵌套资源类型</p>
         * 
         * <strong>example:</strong>
         * <p>File</p>
         */
        @NameInMap("EmbeddedResourceType")
        public String embeddedResourceType;

        /**
         * <p>示例说明</p>
         */
        @NameInMap("ExampleDescription")
        public String exampleDescription;

        /**
         * <p>函数的实现代码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.jar,yyy.jar</p>
         */
        @NameInMap("FileResource")
        public String fileResource;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>580667964888595XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1655953028000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>函数责任人</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>命令描述</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>项目Id</p>
         * 
         * <strong>example:</strong>
         * <p>307XXX</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>返回值说明</p>
         */
        @NameInMap("ReturnValueDescription")
        public String returnValueDescription;

        /**
         * <p>运行时资源组信息</p>
         */
        @NameInMap("RuntimeResource")
        public ListFunctionsResponseBodyPagingInfoFunctionsRuntimeResource runtimeResource;

        /**
         * <p>工作流的脚本信息</p>
         */
        @NameInMap("Script")
        public ListFunctionsResponseBodyPagingInfoFunctionsScript script;

        /**
         * <p>函数类型</p>
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
        @NameInMap("Functions")
        public java.util.List<ListFunctionsResponseBodyPagingInfoFunctions> functions;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
