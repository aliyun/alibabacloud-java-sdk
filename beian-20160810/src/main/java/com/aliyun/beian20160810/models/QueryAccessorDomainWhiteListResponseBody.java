// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainWhiteListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryAccessorDomainWhiteListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccessorDomainWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainWhiteListResponseBody self = new QueryAccessorDomainWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainWhiteListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAccessorDomainWhiteListResponseBody setData(QueryAccessorDomainWhiteListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccessorDomainWhiteListResponseBodyData getData() {
        return this.data;
    }

    public QueryAccessorDomainWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccessorDomainWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAccessorDomainWhiteListResponseBodyDataItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("Valid")
        public Boolean valid;

        public static QueryAccessorDomainWhiteListResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryAccessorDomainWhiteListResponseBodyDataItems self = new QueryAccessorDomainWhiteListResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryAccessorDomainWhiteListResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAccessorDomainWhiteListResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAccessorDomainWhiteListResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryAccessorDomainWhiteListResponseBodyDataItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAccessorDomainWhiteListResponseBodyDataItems setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

    public static class QueryAccessorDomainWhiteListResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QueryAccessorDomainWhiteListResponseBodyDataItems> items;

        @NameInMap("White")
        public Boolean white;

        public static QueryAccessorDomainWhiteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccessorDomainWhiteListResponseBodyData self = new QueryAccessorDomainWhiteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccessorDomainWhiteListResponseBodyData setItems(java.util.List<QueryAccessorDomainWhiteListResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryAccessorDomainWhiteListResponseBodyDataItems> getItems() {
            return this.items;
        }

        public QueryAccessorDomainWhiteListResponseBodyData setWhite(Boolean white) {
            this.white = white;
            return this;
        }
        public Boolean getWhite() {
            return this.white;
        }

    }

}
