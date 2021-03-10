// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductTopicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryProductTopicResponseBodyData data;

    public static QueryProductTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductTopicResponseBody self = new QueryProductTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductTopicResponseBody setData(QueryProductTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductTopicResponseBodyData getData() {
        return this.data;
    }

    public static class QueryProductTopicResponseBodyDataProductTopicInfo extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("TopicShortName")
        public String topicShortName;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public String id;

        public static QueryProductTopicResponseBodyDataProductTopicInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductTopicResponseBodyDataProductTopicInfo self = new QueryProductTopicResponseBodyDataProductTopicInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setTopicShortName(String topicShortName) {
            this.topicShortName = topicShortName;
            return this;
        }
        public String getTopicShortName() {
            return this.topicShortName;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryProductTopicResponseBodyData extends TeaModel {
        @NameInMap("ProductTopicInfo")
        public java.util.List<QueryProductTopicResponseBodyDataProductTopicInfo> productTopicInfo;

        public static QueryProductTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductTopicResponseBodyData self = new QueryProductTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProductTopicResponseBodyData setProductTopicInfo(java.util.List<QueryProductTopicResponseBodyDataProductTopicInfo> productTopicInfo) {
            this.productTopicInfo = productTopicInfo;
            return this;
        }
        public java.util.List<QueryProductTopicResponseBodyDataProductTopicInfo> getProductTopicInfo() {
            return this.productTopicInfo;
        }

    }

}
