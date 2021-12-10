// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryTenantResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryTenantResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantResponseBody self = new QueryTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTenantResponseBody setData(java.util.List<QueryTenantResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTenantResponseBodyData> getData() {
        return this.data;
    }

    public QueryTenantResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTenantResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTenantResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryTenantResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public Long tenantId;

        public static QueryTenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTenantResponseBodyData self = new QueryTenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTenantResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTenantResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTenantResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
