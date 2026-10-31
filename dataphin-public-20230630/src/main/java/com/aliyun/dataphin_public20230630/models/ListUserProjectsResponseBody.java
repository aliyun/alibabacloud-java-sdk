// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUserProjectsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListUserProjectsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListUserProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProjectsResponseBody self = new ListUserProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserProjectsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUserProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserProjectsResponseBody setPageResult(ListUserProjectsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListUserProjectsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListUserProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserProjectsResponseBodyPageResultProjectList extends TeaModel {
        /**
         * <p>The ID of the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>162112</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The ID of the compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The name of the compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds1</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The environment identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The creation time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>1030111021</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The project mode.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>30012112</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The owner of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The ID of the real-time compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("RealtimeDataSourceId")
        public Long realtimeDataSourceId;

        /**
         * <p>The name of the real-time compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds2</p>
         */
        @NameInMap("RealtimeDataSourceName")
        public String realtimeDataSourceName;

        /**
         * <p>The project type.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListUserProjectsResponseBodyPageResultProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListUserProjectsResponseBodyPageResultProjectList self = new ListUserProjectsResponseBodyPageResultProjectList();
            return TeaModel.build(map, self);
        }

        public ListUserProjectsResponseBodyPageResultProjectList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setRealtimeDataSourceId(Long realtimeDataSourceId) {
            this.realtimeDataSourceId = realtimeDataSourceId;
            return this;
        }
        public Long getRealtimeDataSourceId() {
            return this.realtimeDataSourceId;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setRealtimeDataSourceName(String realtimeDataSourceName) {
            this.realtimeDataSourceName = realtimeDataSourceName;
            return this;
        }
        public String getRealtimeDataSourceName() {
            return this.realtimeDataSourceName;
        }

        public ListUserProjectsResponseBodyPageResultProjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListUserProjectsResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of projects that the user participates in.</p>
         */
        @NameInMap("ProjectList")
        public java.util.List<ListUserProjectsResponseBodyPageResultProjectList> projectList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUserProjectsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserProjectsResponseBodyPageResult self = new ListUserProjectsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListUserProjectsResponseBodyPageResult setProjectList(java.util.List<ListUserProjectsResponseBodyPageResultProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }
        public java.util.List<ListUserProjectsResponseBodyPageResultProjectList> getProjectList() {
            return this.projectList;
        }

        public ListUserProjectsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
