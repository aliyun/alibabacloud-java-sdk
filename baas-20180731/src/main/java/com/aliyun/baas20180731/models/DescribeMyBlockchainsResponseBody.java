// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMyBlockchainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeMyBlockchainsResponseBodyResult> result;

    public static DescribeMyBlockchainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBlockchainsResponseBody self = new DescribeMyBlockchainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMyBlockchainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMyBlockchainsResponseBody setResult(java.util.List<DescribeMyBlockchainsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeMyBlockchainsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeMyBlockchainsResponseBodyResult extends TeaModel {
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

        public static DescribeMyBlockchainsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBlockchainsResponseBodyResult self = new DescribeMyBlockchainsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeMyBlockchainsResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeMyBlockchainsResponseBodyResult setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public DescribeMyBlockchainsResponseBodyResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeMyBlockchainsResponseBodyResult setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public DescribeMyBlockchainsResponseBodyResult setReqAddr(String reqAddr) {
            this.reqAddr = reqAddr;
            return this;
        }
        public String getReqAddr() {
            return this.reqAddr;
        }

        public DescribeMyBlockchainsResponseBodyResult setSignedAddr(String signedAddr) {
            this.signedAddr = signedAddr;
            return this;
        }
        public String getSignedAddr() {
            return this.signedAddr;
        }

        public DescribeMyBlockchainsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeMyBlockchainsResponseBodyResult setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public DescribeMyBlockchainsResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
