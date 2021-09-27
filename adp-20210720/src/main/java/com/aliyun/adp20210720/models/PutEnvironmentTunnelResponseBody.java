// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class PutEnvironmentTunnelResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息
    @NameInMap("msg")
    public String msg;

    // 数据
    @NameInMap("data")
    public PutEnvironmentTunnelResponseBodyData data;

    public static PutEnvironmentTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEnvironmentTunnelResponseBody self = new PutEnvironmentTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEnvironmentTunnelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutEnvironmentTunnelResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public PutEnvironmentTunnelResponseBody setData(PutEnvironmentTunnelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PutEnvironmentTunnelResponseBodyData getData() {
        return this.data;
    }

    public static class PutEnvironmentTunnelResponseBodyData extends TeaModel {
        // 通道id，可空
        @NameInMap("uid")
        public String uid;

        public static PutEnvironmentTunnelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PutEnvironmentTunnelResponseBodyData self = new PutEnvironmentTunnelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PutEnvironmentTunnelResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
