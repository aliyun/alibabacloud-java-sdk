// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageAsyncModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageAsyncModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>4A926AE2-4C96-573F-824F-0532960799F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImageAsyncModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncModerationResponseBody self = new ImageAsyncModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageAsyncModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageAsyncModerationResponseBody setData(ImageAsyncModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageAsyncModerationResponseBodyData getData() {
        return this.data;
    }

    public ImageAsyncModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ImageAsyncModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageAsyncModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fb5ffab1-993b-449f-b8d6-b97d5e3331f2</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>A07B3DB9-D762-5C56-95B1-8EC55CF176D2</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        public static ImageAsyncModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageAsyncModerationResponseBodyData self = new ImageAsyncModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageAsyncModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImageAsyncModerationResponseBodyData setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

    }

}
