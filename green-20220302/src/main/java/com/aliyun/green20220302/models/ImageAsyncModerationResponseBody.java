// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageAsyncModerationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageAsyncModerationResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

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
        @NameInMap("DataId")
        public String dataId;

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
