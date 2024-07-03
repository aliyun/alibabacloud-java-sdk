// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class UrlAsyncModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public UrlAsyncModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6CF2815C-<strong><strong>-</strong></strong>-B52E-FF6E2****492</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UrlAsyncModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UrlAsyncModerationResponseBody self = new UrlAsyncModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public UrlAsyncModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UrlAsyncModerationResponseBody setData(UrlAsyncModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UrlAsyncModerationResponseBodyData getData() {
        return this.data;
    }

    public UrlAsyncModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UrlAsyncModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UrlAsyncModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>A07B3DB9-D762-5C56-95B1-8EC55CF176D2</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        public static UrlAsyncModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UrlAsyncModerationResponseBodyData self = new UrlAsyncModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UrlAsyncModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public UrlAsyncModerationResponseBodyData setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

    }

}
