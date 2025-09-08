// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultimodalAsyncModerationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public MultimodalAsyncModerationResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

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
        @NameInMap("DataId")
        public String dataId;

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
