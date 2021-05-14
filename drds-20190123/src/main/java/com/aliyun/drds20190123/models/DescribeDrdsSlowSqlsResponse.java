// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSlowSqlsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDrdsSlowSqlsResponseItems items;

    public static DescribeDrdsSlowSqlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSlowSqlsResponse self = new DescribeDrdsSlowSqlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSlowSqlsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsSlowSqlsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsSlowSqlsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDrdsSlowSqlsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsSlowSqlsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsSlowSqlsResponse setItems(DescribeDrdsSlowSqlsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDrdsSlowSqlsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDrdsSlowSqlsResponseItemsItem extends TeaModel {
        @NameInMap("Schema")
        @Validation(required = true)
        public String schema;

        @NameInMap("Sql")
        @Validation(required = true)
        public String sql;

        @NameInMap("SendTime")
        @Validation(required = true)
        public Long sendTime;

        @NameInMap("ResponseTime")
        @Validation(required = true)
        public Long responseTime;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        public static DescribeDrdsSlowSqlsResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSlowSqlsResponseItemsItem self = new DescribeDrdsSlowSqlsResponseItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSlowSqlsResponseItemsItem setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeDrdsSlowSqlsResponseItemsItem setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeDrdsSlowSqlsResponseItemsItem setSendTime(Long sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Long getSendTime() {
            return this.sendTime;
        }

        public DescribeDrdsSlowSqlsResponseItemsItem setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

        public DescribeDrdsSlowSqlsResponseItemsItem setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class DescribeDrdsSlowSqlsResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeDrdsSlowSqlsResponseItemsItem> item;

        public static DescribeDrdsSlowSqlsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSlowSqlsResponseItems self = new DescribeDrdsSlowSqlsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSlowSqlsResponseItems setItem(java.util.List<DescribeDrdsSlowSqlsResponseItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeDrdsSlowSqlsResponseItemsItem> getItem() {
            return this.item;
        }

    }

}
