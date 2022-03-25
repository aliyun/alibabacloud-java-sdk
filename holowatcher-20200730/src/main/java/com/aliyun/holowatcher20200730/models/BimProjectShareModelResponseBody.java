// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProjectShareModelResponseBody extends TeaModel {
    @NameInMap("Datas")
    public BimProjectShareModelResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BimProjectShareModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BimProjectShareModelResponseBody self = new BimProjectShareModelResponseBody();
        return TeaModel.build(map, self);
    }

    public BimProjectShareModelResponseBody setDatas(BimProjectShareModelResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public BimProjectShareModelResponseBodyDatas getDatas() {
        return this.datas;
    }

    public BimProjectShareModelResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public BimProjectShareModelResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BimProjectShareModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BimProjectShareModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BimProjectShareModelResponseBodyDatas extends TeaModel {
        // 失效时间
        @NameInMap("ExpireTime")
        public Long expireTime;

        // 分享id
        @NameInMap("ShareId")
        public String shareId;

        public static BimProjectShareModelResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            BimProjectShareModelResponseBodyDatas self = new BimProjectShareModelResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public BimProjectShareModelResponseBodyDatas setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public BimProjectShareModelResponseBodyDatas setShareId(String shareId) {
            this.shareId = shareId;
            return this;
        }
        public String getShareId() {
            return this.shareId;
        }

    }

}
