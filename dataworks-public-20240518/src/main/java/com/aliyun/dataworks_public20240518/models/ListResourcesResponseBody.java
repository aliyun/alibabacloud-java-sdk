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
         * <p>The command used to distinguish file resource types.</p>
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
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123348864897630XXXX</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The script path.</p>
         * 
         * <strong>example:</strong>
         * <p>root/demo</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The runtime.</p>
         */
        @NameInMap("Runtime")
        public ListResourcesResponseBodyPagingInfoResourcesScriptRuntime runtime;

        public static ListResourcesResponseBodyPagingInfoResourcesScript build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyPagingInfoResourcesScript self = new ListResourcesResponseBodyPagingInfoResourcesScript();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyPagingInfoResourcesScript setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
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
         * <p>The information about the data source.</p>
         */
        @NameInMap("DataSource")
        public ListResourcesResponseBodyPagingInfoResourcesDataSource dataSource;

        /**
         * <p>The ID of the file resource.</p>
         * 
         * <strong>example:</strong>
         * <p>631478864897630XXXX</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The times when the file resource was last modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the file resource.</p>
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
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
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
         * <p>The path of the source of the file resource. If the SourecType parameter is set to Local, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
         */
        @NameInMap("SourcePath")
        public String sourcePath;

        /**
         * <p>The storage type of the source of the file resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Local</li>
         * <li>Oss</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The storage path of the destination of the file resource.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The storage type of the destination of the file resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Gateway</li>
         * <li>Oss</li>
         * <li>Hdfs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The type of the file resource.</p>
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

        public ListResourcesResponseBodyPagingInfoResources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
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
         * <p>The queried file resources.</p>
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
