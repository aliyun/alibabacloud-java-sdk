// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListResourcesResponseBodyPagingInfo pagingInfo;

    /**
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
         * <p>脚本所属类型</p>
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
         * <p>工作流脚本的id</p>
         * 
         * <strong>example:</strong>
         * <p>123348864897630XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>工作流的脚本路径</p>
         * 
         * <strong>example:</strong>
         * <p>root/demo</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>脚本的运行时信息</p>
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
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>函数注册到的数据源信息</p>
         */
        @NameInMap("DataSource")
        public ListResourcesResponseBodyPagingInfoResourcesDataSource dataSource;

        /**
         * <p>代表资源组的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>631478864897630XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>资源文件的最近修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>math.py</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>资源文件的责任人</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>资源文件的项目id</p>
         * 
         * <strong>example:</strong>
         * <p>344247</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>工作流的脚本信息</p>
         */
        @NameInMap("Script")
        public ListResourcesResponseBodyPagingInfoResourcesScript script;

        /**
         * <p>文件目标存储路径</p>
         * 
         * <strong>example:</strong>
         * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
         */
        @NameInMap("SourcePath")
        public String sourcePath;

        /**
         * <p>文件资源来源存储类型</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>文件来源路径</p>
         * 
         * <strong>example:</strong>
         * <p>XXX/unknown/ide/1/XXX/20240820200851_963a9da676de44ef8d06a6576a8c4d6a.py</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>文件目标存储类型</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>资源类型</p>
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

        public ListResourcesResponseBodyPagingInfoResources setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
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

        @NameInMap("Resources")
        public java.util.List<ListResourcesResponseBodyPagingInfoResources> resources;

        /**
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
