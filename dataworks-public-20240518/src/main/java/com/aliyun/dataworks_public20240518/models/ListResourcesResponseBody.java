// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListResourcesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>99EBE7CF-69C0-5089-BE3E-79563C31XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setPagingInfo(ListResourcesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListResourcesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourcesResponseBodyPagingInfoResourcesDataSource extends TeaModel {
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

        public static ListResourcesResponseBodyPagingInfoResourcesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyPagingInfoResourcesDataSource self = new ListResourcesResponseBodyPagingInfoResourcesDataSource();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyPagingInfoResourcesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcesResponseBodyPagingInfoResourcesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcesResponseBodyPagingInfoResourcesScriptRuntime extends TeaModel {
        /**
         * <p>Command. This parameter indicates the file type.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_PYTHON</p>
         */
        @NameInMap("Command")
        public String command;

        public static ListResourcesResponseBodyPagingInfoResourcesScriptRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyPagingInfoResourcesScriptRuntime self = new ListResourcesResponseBodyPagingInfoResourcesScriptRuntime();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyPagingInfoResourcesScriptRuntime setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListResourcesResponseBodyPagingInfoResourcesScript extends TeaModel {
        /**
         * <p>The ID of the script.</p>
         * <blockquote>
         * <p> This field is of type Long in SDK versions prior to 8.0.0, and of type String in SDK version 8.0.0 and later. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123348864897630XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The script path.</p>
         * 
         * <strong>example:</strong>
         * <p>root/demo</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Runtime</p>
         */
        @NameInMap("Runtime")
        public ListResourcesResponseBodyPagingInfoResourcesScriptRuntime runtime;

        public static ListResourcesResponseBodyPagingInfoResourcesScript build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyPagingInfoResourcesScript self = new ListResourcesResponseBodyPagingInfoResourcesScript();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyPagingInfoResourcesScript setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcesResponseBodyPagingInfoResourcesScript setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListResourcesResponseBodyPagingInfoResourcesScript setRuntime(ListResourcesResponseBodyPagingInfoResourcesScriptRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListResourcesResponseBodyPagingInfoResourcesScriptRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListResourcesResponseBodyPagingInfoResources extends TeaModel {
        /**
         * <p>The time when the file resource was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data source.</p>
         */
        @NameInMap("DataSource")
        public ListResourcesResponseBodyPagingInfoResourcesDataSource dataSource;

        /**
         * <p>The unique identifier of the file resource.</p>
         * <blockquote>
         * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>631478864897630XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The timestamp when the file resource was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>math.py</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the file resource.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the DataWorks workspace. To obtain the workspace ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
         * 
         * <strong>example:</strong>
         * <p>344247</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The script information.</p>
         */
        @NameInMap("Script")
        public ListResourcesResponseBodyPagingInfoResourcesScript script;

        /**
         * <p>Source path of the file resource. This parameter is empty if the type is Local.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
         */
        @NameInMap("SourcePath")
        public String sourcePath;

        /**
         * <p>The source storage type of the file resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Local</li>
         * <li>OSS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The destination storage path.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The destination storage type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Gateway</li>
         * <li>OSS</li>
         * <li>HDFS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The resource type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Python</li>
         * <li>Jar</li>
         * <li>Archive</li>
         * <li>File</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>jar</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcesResponseBodyPagingInfoResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyPagingInfoResources self = new ListResourcesResponseBodyPagingInfoResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyPagingInfoResources setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListResourcesResponseBodyPagingInfoResources setDataSource(ListResourcesResponseBodyPagingInfoResourcesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListResourcesResponseBodyPagingInfoResourcesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListResourcesResponseBodyPagingInfoResources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcesResponseBodyPagingInfoResources setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListResourcesResponseBodyPagingInfoResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcesResponseBodyPagingInfoResources setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListResourcesResponseBodyPagingInfoResources setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListResourcesResponseBodyPagingInfoResources setScript(ListResourcesResponseBodyPagingInfoResourcesScript script) {
            this.script = script;
            return this;
        }
        public ListResourcesResponseBodyPagingInfoResourcesScript getScript() {
            return this.script;
        }

        public ListResourcesResponseBodyPagingInfoResources setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public ListResourcesResponseBodyPagingInfoResources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListResourcesResponseBodyPagingInfoResources setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListResourcesResponseBodyPagingInfoResources setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListResourcesResponseBodyPagingInfoResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcesResponseBodyPagingInfo extends TeaModel {
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
         * <p>The returned resource list.</p>
         */
        @NameInMap("Resources")
        public java.util.List<ListResourcesResponseBodyPagingInfoResources> resources;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListResourcesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyPagingInfo self = new ListResourcesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListResourcesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListResourcesResponseBodyPagingInfo setResources(java.util.List<ListResourcesResponseBodyPagingInfoResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyPagingInfoResources> getResources() {
            return this.resources;
        }

        public ListResourcesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
