// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryGameResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryGameResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryGameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGameResponseBody self = new QueryGameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGameResponseBody setData(java.util.List<QueryGameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryGameResponseBodyData> getData() {
        return this.data;
    }

    public QueryGameResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryGameResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryGameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGameResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryGameResponseBodyData extends TeaModel {
        @NameInMap("GameId")
        public Long gameId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Version")
        public String version;

        public static QueryGameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGameResponseBodyData self = new QueryGameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGameResponseBodyData setGameId(Long gameId) {
            this.gameId = gameId;
            return this;
        }
        public Long getGameId() {
            return this.gameId;
        }

        public QueryGameResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryGameResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryGameResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public QueryGameResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryGameResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
