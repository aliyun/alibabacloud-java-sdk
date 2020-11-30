// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryTenantResponse extends TeaModel {
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
    public java.util.List<QueryTenantResponseData> data;

    public static QueryTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantResponse self = new QueryTenantResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTenantResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTenantResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTenantResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTenantResponse setData(java.util.List<QueryTenantResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTenantResponseData> getData() {
        return this.data;
    }

    public static class QueryTenantResponseData extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        public static QueryTenantResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryTenantResponseData self = new QueryTenantResponseData();
            return TeaModel.build(map, self);
        }

        public QueryTenantResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryTenantResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTenantResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

    }

}
