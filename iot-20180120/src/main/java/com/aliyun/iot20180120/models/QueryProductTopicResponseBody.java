// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductTopicResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of topic categories returned if the call is successful. For more information, see **ProductTopicInfo**.</p>
     */
    @NameInMap("Data")
    public QueryProductTopicResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryProductTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductTopicResponseBody self = new QueryProductTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductTopicResponseBody setData(QueryProductTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductTopicResponseBodyData getData() {
        return this.data;
    }

    public QueryProductTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryProductTopicResponseBodyDataProductTopicInfo extends TeaModel {
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The description of the topic category.</p>
         */
        @NameInMap("Desc")
        public String desc;

        @NameInMap("EnableProxySubscribe")
        public Boolean enableProxySubscribe;

        /**
         * <p>The ID of the topic category.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The operation that devices can perform on the topic category. Valid values:</p>
         * <br>
         * <p>*   **0**: Publish.</p>
         * <p>*   **1**: Subscribe.</p>
         * <p>*   **2**: Publish and Subscribe.</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The ProductKey of the product.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The topic category that does not include the \_productKey\_ and \_deviceName\_ levels.</p>
         */
        @NameInMap("TopicShortName")
        public String topicShortName;

        public static QueryProductTopicResponseBodyDataProductTopicInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductTopicResponseBodyDataProductTopicInfo self = new QueryProductTopicResponseBodyDataProductTopicInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setEnableProxySubscribe(Boolean enableProxySubscribe) {
            this.enableProxySubscribe = enableProxySubscribe;
            return this;
        }
        public Boolean getEnableProxySubscribe() {
            return this.enableProxySubscribe;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProductTopicResponseBodyDataProductTopicInfo setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
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
