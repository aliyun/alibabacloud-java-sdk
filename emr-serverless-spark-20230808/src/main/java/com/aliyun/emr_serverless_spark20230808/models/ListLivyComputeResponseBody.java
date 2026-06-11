// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLivyComputeResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 1000000 indicates that the request is successful. For other values, see the message parameter for error details.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListLivyComputeResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListLivyComputeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLivyComputeResponseBody self = new ListLivyComputeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLivyComputeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLivyComputeResponseBody setData(ListLivyComputeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLivyComputeResponseBodyData getData() {
        return this.data;
    }

    public ListLivyComputeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLivyComputeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLivyComputeResponseBodyDataLivyComputes extends TeaModel {
        /**
         * <p>The ID of the Livy Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-xxxxxxxxxxxx</p>
         */
        @NameInMap("computeId")
        public String computeId;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-livy-gateway-cn-hangzhou.data.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-livy-gateway-cn-hangzhou-internal.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
         */
        @NameInMap("endpointInner")
        public String endpointInner;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The time when the resource was started.</p>
         * 
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The running status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static ListLivyComputeResponseBodyDataLivyComputes build(java.util.Map<String, ?> map) throws Exception {
            ListLivyComputeResponseBodyDataLivyComputes self = new ListLivyComputeResponseBodyDataLivyComputes();
            return TeaModel.build(map, self);
        }

        public ListLivyComputeResponseBodyDataLivyComputes setComputeId(String computeId) {
            this.computeId = computeId;
            return this;
        }
        public String getComputeId() {
            return this.computeId;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setEndpointInner(String endpointInner) {
            this.endpointInner = endpointInner;
            return this;
        }
        public String getEndpointInner() {
            return this.endpointInner;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListLivyComputeResponseBodyDataLivyComputes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLivyComputeResponseBodyData extends TeaModel {
        /**
         * <p>A list of Livy Gateways.</p>
         */
        @NameInMap("livyComputes")
        public java.util.List<ListLivyComputeResponseBodyDataLivyComputes> livyComputes;

        public static ListLivyComputeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLivyComputeResponseBodyData self = new ListLivyComputeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLivyComputeResponseBodyData setLivyComputes(java.util.List<ListLivyComputeResponseBodyDataLivyComputes> livyComputes) {
            this.livyComputes = livyComputes;
            return this;
        }
        public java.util.List<ListLivyComputeResponseBodyDataLivyComputes> getLivyComputes() {
            return this.livyComputes;
        }

    }

}
