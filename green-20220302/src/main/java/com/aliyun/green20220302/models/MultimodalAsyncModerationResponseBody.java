// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultimodalAsyncModerationResponseBody extends TeaModel {
    /**
     * <p>Return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public MultimodalAsyncModerationResponseBodyData data;

    /**
     * <p>The response message for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MultimodalAsyncModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultimodalAsyncModerationResponseBody self = new MultimodalAsyncModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public MultimodalAsyncModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MultimodalAsyncModerationResponseBody setData(MultimodalAsyncModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultimodalAsyncModerationResponseBodyData getData() {
        return this.data;
    }

    public MultimodalAsyncModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public MultimodalAsyncModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MultimodalAsyncModerationResponseBodyData extends TeaModel {
        /**
         * <p>The value of dataId passed in the API request. This field is absent if dataId was not included in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The ReqId field returned by the URL asynchronous enhanced moderation API. Use this field to query moderation results.</p>
         * 
         * <strong>example:</strong>
         * <p>A07B3DB9-D762-5C56-95B1-8EC55CF176D2</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        public static MultimodalAsyncModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultimodalAsyncModerationResponseBodyData self = new MultimodalAsyncModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultimodalAsyncModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public MultimodalAsyncModerationResponseBodyData setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

    }

}
