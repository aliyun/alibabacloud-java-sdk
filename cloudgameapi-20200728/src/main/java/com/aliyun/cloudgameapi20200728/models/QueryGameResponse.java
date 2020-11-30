// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryGameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryGameResponseData> data;

    public static QueryGameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGameResponse self = new QueryGameResponse();
        return TeaModel.build(map, self);
    }

    public QueryGameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGameResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryGameResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryGameResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryGameResponse setData(java.util.List<QueryGameResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryGameResponseData> getData() {
        return this.data;
    }

    public static class QueryGameResponseData extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("GameId")
        @Validation(required = true)
        public Long gameId;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        public static QueryGameResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryGameResponseData self = new QueryGameResponseData();
            return TeaModel.build(map, self);
        }

        public QueryGameResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryGameResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryGameResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryGameResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public QueryGameResponseData setGameId(Long gameId) {
            this.gameId = gameId;
            return this;
        }
        public Long getGameId() {
            return this.gameId;
        }

        public QueryGameResponseData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
