// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListProjectsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectsResponseBody setPageResult(ListProjectsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListProjectsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectsResponseBodyPageResultProjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>162112</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>ds1</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1030111021</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30012112</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("RealtimeDataSourceId")
        public Long realtimeDataSourceId;

        /**
         * <strong>example:</strong>
         * <p>ds2</p>
         */
        @NameInMap("RealtimeDataSourceName")
        public String realtimeDataSourceName;

        /**
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectsResponseBodyPageResultProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPageResultProjectList self = new ListProjectsResponseBodyPageResultProjectList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPageResultProjectList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListProjectsResponseBodyPageResultProjectList setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ListProjectsResponseBodyPageResultProjectList setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListProjectsResponseBodyPageResultProjectList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyPageResultProjectList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListProjectsResponseBodyPageResultProjectList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListProjectsResponseBodyPageResultProjectList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectsResponseBodyPageResultProjectList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectsResponseBodyPageResultProjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectsResponseBodyPageResultProjectList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListProjectsResponseBodyPageResultProjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyPageResultProjectList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectsResponseBodyPageResultProjectList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListProjectsResponseBodyPageResultProjectList setRealtimeDataSourceId(Long realtimeDataSourceId) {
            this.realtimeDataSourceId = realtimeDataSourceId;
            return this;
        }
        public Long getRealtimeDataSourceId() {
            return this.realtimeDataSourceId;
        }

        public ListProjectsResponseBodyPageResultProjectList setRealtimeDataSourceName(String realtimeDataSourceName) {
            this.realtimeDataSourceName = realtimeDataSourceName;
            return this;
        }
        public String getRealtimeDataSourceName() {
            return this.realtimeDataSourceName;
        }

        public ListProjectsResponseBodyPageResultProjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectsResponseBodyPageResult extends TeaModel {
        @NameInMap("ProjectList")
        public java.util.List<ListProjectsResponseBodyPageResultProjectList> projectList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPageResult self = new ListProjectsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPageResult setProjectList(java.util.List<ListProjectsResponseBodyPageResultProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyPageResultProjectList> getProjectList() {
            return this.projectList;
        }

        public ListProjectsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
