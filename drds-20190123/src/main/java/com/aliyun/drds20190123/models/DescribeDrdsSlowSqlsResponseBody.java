// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSlowSqlsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Items")
    public DescribeDrdsSlowSqlsResponseBodyItems items;

    public static DescribeDrdsSlowSqlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSlowSqlsResponseBody self = new DescribeDrdsSlowSqlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSlowSqlsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsSlowSqlsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsSlowSqlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsSlowSqlsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDrdsSlowSqlsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsSlowSqlsResponseBody setItems(DescribeDrdsSlowSqlsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDrdsSlowSqlsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDrdsSlowSqlsResponseBodyItemsItem extends TeaModel {
        @NameInMap("SendTime")
        public Long sendTime;

        @NameInMap("Host")
        public String host;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("ResponseTime")
        public Long responseTime;

        @NameInMap("Schema")
        public String schema;

        public static DescribeDrdsSlowSqlsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSlowSqlsResponseBodyItemsItem self = new DescribeDrdsSlowSqlsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSlowSqlsResponseBodyItemsItem setSendTime(Long sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Long getSendTime() {
            return this.sendTime;
        }

        public DescribeDrdsSlowSqlsResponseBodyItemsItem setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeDrdsSlowSqlsResponseBodyItemsItem setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeDrdsSlowSqlsResponseBodyItemsItem setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

        public DescribeDrdsSlowSqlsResponseBodyItemsItem setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DescribeDrdsSlowSqlsResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeDrdsSlowSqlsResponseBodyItemsItem> item;

        public static DescribeDrdsSlowSqlsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsSlowSqlsResponseBodyItems self = new DescribeDrdsSlowSqlsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsSlowSqlsResponseBodyItems setItem(java.util.List<DescribeDrdsSlowSqlsResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeDrdsSlowSqlsResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
