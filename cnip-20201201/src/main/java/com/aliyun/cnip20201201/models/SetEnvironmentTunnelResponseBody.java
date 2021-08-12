// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class SetEnvironmentTunnelResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errCode")
    public String errCode;

    // 错误信息
    @NameInMap("errMsg")
    public String errMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 数据
    @NameInMap("date")
    public SetEnvironmentTunnelResponseBodyDate date;

    public static SetEnvironmentTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetEnvironmentTunnelResponseBody self = new SetEnvironmentTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public SetEnvironmentTunnelResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SetEnvironmentTunnelResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public SetEnvironmentTunnelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetEnvironmentTunnelResponseBody setDate(SetEnvironmentTunnelResponseBodyDate date) {
        this.date = date;
        return this;
    }
    public SetEnvironmentTunnelResponseBodyDate getDate() {
        return this.date;
    }

    public static class SetEnvironmentTunnelResponseBodyDate extends TeaModel {
        // 通道id，可空
        @NameInMap("uid")
        public String uid;

        public static SetEnvironmentTunnelResponseBodyDate build(java.util.Map<String, ?> map) throws Exception {
            SetEnvironmentTunnelResponseBodyDate self = new SetEnvironmentTunnelResponseBodyDate();
            return TeaModel.build(map, self);
        }

        public SetEnvironmentTunnelResponseBodyDate setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
