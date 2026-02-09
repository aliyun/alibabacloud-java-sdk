// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListAivppResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAivppResourcesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>37cc36b4344b182d36b45d95ae4ef03952ee5c24733ba461</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>68738E75-43C1-5AE5-9F3A-AFEF576D7B5F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAivppResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAivppResourcesResponseBody self = new ListAivppResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAivppResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAivppResourcesResponseBody setData(java.util.List<ListAivppResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAivppResourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListAivppResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAivppResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAivppResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAivppResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAivppResourcesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListAivppResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAivppResourcesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ConnectNum")
        public Integer connectNum;

        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>2034-03-09T17:47:11Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>i-bp154xh3gt3adb4xu1ue</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LeftQuantity")
        public String leftQuantity;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MessageTps")
        public Integer messageTps;

        /**
         * <strong>example:</strong>
         * <p>231287932080007</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        /**
         * <strong>example:</strong>
         * <p>LoadForecasting</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <strong>example:</strong>
         * <p>2024-09-08T01:16Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListAivppResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAivppResourcesResponseBodyData self = new ListAivppResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAivppResourcesResponseBodyData setConnectNum(Integer connectNum) {
            this.connectNum = connectNum;
            return this;
        }
        public Integer getConnectNum() {
            return this.connectNum;
        }

        public ListAivppResourcesResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListAivppResourcesResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListAivppResourcesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAivppResourcesResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListAivppResourcesResponseBodyData setLeftQuantity(String leftQuantity) {
            this.leftQuantity = leftQuantity;
            return this;
        }
        public String getLeftQuantity() {
            return this.leftQuantity;
        }

        public ListAivppResourcesResponseBodyData setMessageTps(Integer messageTps) {
            this.messageTps = messageTps;
            return this;
        }
        public Integer getMessageTps() {
            return this.messageTps;
        }

        public ListAivppResourcesResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListAivppResourcesResponseBodyData setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public ListAivppResourcesResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public ListAivppResourcesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAivppResourcesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAivppResourcesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
