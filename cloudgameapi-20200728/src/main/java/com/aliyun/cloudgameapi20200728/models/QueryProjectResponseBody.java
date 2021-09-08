// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Data")
    public java.util.List<QueryProjectResponseBodyData> data;

    public static QueryProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectResponseBody self = new QueryProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryProjectResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryProjectResponseBody setData(java.util.List<QueryProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryProjectResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryProjectResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TenantId")
        public Long tenantId;

        public static QueryProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectResponseBodyData self = new QueryProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProjectResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryProjectResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
