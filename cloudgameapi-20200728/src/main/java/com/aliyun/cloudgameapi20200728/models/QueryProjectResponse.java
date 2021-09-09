// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryProjectResponse extends TeaModel {
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
    public java.util.List<QueryProjectResponseData> data;

    public static QueryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectResponse self = new QueryProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryProjectResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryProjectResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryProjectResponse setData(java.util.List<QueryProjectResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryProjectResponseData> getData() {
        return this.data;
    }

    public static class QueryProjectResponseData extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        public static QueryProjectResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectResponseData self = new QueryProjectResponseData();
            return TeaModel.build(map, self);
        }

        public QueryProjectResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryProjectResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProjectResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
