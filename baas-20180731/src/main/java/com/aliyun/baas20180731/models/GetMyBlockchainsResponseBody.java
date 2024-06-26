// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetMyBlockchainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetMyBlockchainsResponseBodyResult> result;

    public static GetMyBlockchainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMyBlockchainsResponseBody self = new GetMyBlockchainsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMyBlockchainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMyBlockchainsResponseBody setResult(java.util.List<GetMyBlockchainsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetMyBlockchainsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetMyBlockchainsResponseBodyResult extends TeaModel {
        @NameInMap("Bizid")
        public String bizid;

        @NameInMap("Createtime")
        public Long createtime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("RejectReason")
        public String rejectReason;

        @NameInMap("ReqAddr")
        public String reqAddr;

        @NameInMap("SignedAddr")
        public String signedAddr;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Updatetime")
        public Long updatetime;

        @NameInMap("Username")
        public String username;

        public static GetMyBlockchainsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMyBlockchainsResponseBodyResult self = new GetMyBlockchainsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMyBlockchainsResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public GetMyBlockchainsResponseBodyResult setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public GetMyBlockchainsResponseBodyResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetMyBlockchainsResponseBodyResult setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public GetMyBlockchainsResponseBodyResult setReqAddr(String reqAddr) {
            this.reqAddr = reqAddr;
            return this;
        }
        public String getReqAddr() {
            return this.reqAddr;
        }

        public GetMyBlockchainsResponseBodyResult setSignedAddr(String signedAddr) {
            this.signedAddr = signedAddr;
            return this;
        }
        public String getSignedAddr() {
            return this.signedAddr;
        }

        public GetMyBlockchainsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetMyBlockchainsResponseBodyResult setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public GetMyBlockchainsResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
