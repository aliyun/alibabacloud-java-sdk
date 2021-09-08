// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductTopicResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryProductTopicResponseData data;

    public static QueryProductTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductTopicResponse self = new QueryProductTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductTopicResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductTopicResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductTopicResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductTopicResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductTopicResponse setData(QueryProductTopicResponseData data) {
        this.data = data;
        return this;
    }
    public QueryProductTopicResponseData getData() {
        return this.data;
    }

    public static class QueryProductTopicResponseDataProductTopicInfo extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("TopicShortName")
        @Validation(required = true)
        public String topicShortName;

        @NameInMap("Operation")
        @Validation(required = true)
        public String operation;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static QueryProductTopicResponseDataProductTopicInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductTopicResponseDataProductTopicInfo self = new QueryProductTopicResponseDataProductTopicInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductTopicResponseDataProductTopicInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductTopicResponseDataProductTopicInfo setTopicShortName(String topicShortName) {
            this.topicShortName = topicShortName;
            return this;
        }
        public String getTopicShortName() {
            return this.topicShortName;
        }

        public QueryProductTopicResponseDataProductTopicInfo setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryProductTopicResponseDataProductTopicInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryProductTopicResponseDataProductTopicInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryProductTopicResponseData extends TeaModel {
        @NameInMap("ProductTopicInfo")
        @Validation(required = true)
        public java.util.List<QueryProductTopicResponseDataProductTopicInfo> productTopicInfo;

        public static QueryProductTopicResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductTopicResponseData self = new QueryProductTopicResponseData();
            return TeaModel.build(map, self);
        }

        public QueryProductTopicResponseData setProductTopicInfo(java.util.List<QueryProductTopicResponseDataProductTopicInfo> productTopicInfo) {
            this.productTopicInfo = productTopicInfo;
            return this;
        }
        public java.util.List<QueryProductTopicResponseDataProductTopicInfo> getProductTopicInfo() {
            return this.productTopicInfo;
        }

    }

}
