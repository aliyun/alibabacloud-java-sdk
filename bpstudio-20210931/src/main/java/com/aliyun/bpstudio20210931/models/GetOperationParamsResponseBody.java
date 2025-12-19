// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetOperationParamsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOperationParamsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>getBpmOperationParams errors</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F439A659-3B3D-50FB-A4BC-69FBF16413C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOperationParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOperationParamsResponseBody self = new GetOperationParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOperationParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOperationParamsResponseBody setData(GetOperationParamsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOperationParamsResponseBodyData getData() {
        return this.data;
    }

    public GetOperationParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOperationParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOperationParamsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;tags&quot;: {
         *         &quot;controlType&quot;: &quot;KeyValue&quot;,
         *         &quot;display&quot;: &quot;Label&quot;,
         *         &quot;orderBy&quot;: 0,
         *         &quot;associatedLabel&quot;: true,
         *         &quot;required&quot;: true
         *       }
         *     }</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        /**
         * <strong>example:</strong>
         * <p>rename</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;instance_id&quot;: {
         *         &quot;display&quot;: &quot;ECS instance ID&quot;,
         *         &quot;dataType&quot;: &quot;String&quot;,
         *         &quot;orderBy&quot;: 0,
         *         &quot;attributeName&quot;: &quot;instance_id&quot;,
         *         &quot;enableVariable&quot;: &quot;String&quot;,
         *         &quot;required&quot;: true
         *       },
         *       &quot;instance_name&quot;: {
         *         &quot;display&quot;: &quot;ECS name&quot;,
         *         &quot;dataType&quot;: &quot;String&quot;,
         *         &quot;orderBy&quot;: 0,
         *         &quot;attributeName&quot;: &quot;instance_name&quot;,
         *         &quot;required&quot;: true
         *       },
         *       &quot;private_ip&quot;: {
         *         &quot;display&quot;: &quot;Intranet IP&quot;,
         *         &quot;dataType&quot;: &quot;String&quot;,
         *         &quot;orderBy&quot;: 0,
         *         &quot;value&quot;: &quot;private_ip&quot;,
         *         &quot;required&quot;: true
         *       }
         *     }</p>
         */
        @NameInMap("Outputs")
        public java.util.Map<String, ?> outputs;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;instanceId&quot;: &quot;ResourceId&quot;,
         *       &quot;regionId&quot;: &quot;region&quot;,
         *       &quot;appId&quot;: &quot;appId&quot;
         *     }</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        public static GetOperationParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOperationParamsResponseBodyData self = new GetOperationParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOperationParamsResponseBodyData setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        public GetOperationParamsResponseBodyData setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetOperationParamsResponseBodyData setOutputs(java.util.Map<String, ?> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.Map<String, ?> getOutputs() {
            return this.outputs;
        }

        public GetOperationParamsResponseBodyData setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public GetOperationParamsResponseBodyData setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
