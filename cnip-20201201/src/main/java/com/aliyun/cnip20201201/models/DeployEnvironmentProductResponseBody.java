// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeployEnvironmentProductResponseBody extends TeaModel {
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
    @NameInMap("data")
    public DeployEnvironmentProductResponseBodyData data;

    public static DeployEnvironmentProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployEnvironmentProductResponseBody self = new DeployEnvironmentProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployEnvironmentProductResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeployEnvironmentProductResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeployEnvironmentProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeployEnvironmentProductResponseBody setData(DeployEnvironmentProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployEnvironmentProductResponseBodyData getData() {
        return this.data;
    }

    public static class DeployEnvironmentProductResponseBodyData extends TeaModel {
        // 部署uid
        @NameInMap("uid")
        public String uid;

        public static DeployEnvironmentProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployEnvironmentProductResponseBodyData self = new DeployEnvironmentProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployEnvironmentProductResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
