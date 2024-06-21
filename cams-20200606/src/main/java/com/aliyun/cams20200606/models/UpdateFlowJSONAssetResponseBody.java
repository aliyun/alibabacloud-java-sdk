// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateFlowJSONAssetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateFlowJSONAssetResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFlowJSONAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowJSONAssetResponseBody self = new UpdateFlowJSONAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFlowJSONAssetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateFlowJSONAssetResponseBody setData(UpdateFlowJSONAssetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateFlowJSONAssetResponseBodyData getData() {
        return this.data;
    }

    public UpdateFlowJSONAssetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateFlowJSONAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateFlowJSONAssetResponseBodyData extends TeaModel {
        /**
         * <p>Flow ID。</p>
         * 
         * <strong>example:</strong>
         * <p>84848847****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        public static UpdateFlowJSONAssetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowJSONAssetResponseBodyData self = new UpdateFlowJSONAssetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateFlowJSONAssetResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

}
