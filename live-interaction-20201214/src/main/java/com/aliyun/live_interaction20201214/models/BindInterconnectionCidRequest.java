// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class BindInterconnectionCidRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 绑定会话ID请求体
    @NameInMap("RequestParams")
    public BindInterconnectionCidRequestRequestParams requestParams;

    public static BindInterconnectionCidRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInterconnectionCidRequest self = new BindInterconnectionCidRequest();
        return TeaModel.build(map, self);
    }

    public BindInterconnectionCidRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindInterconnectionCidRequest setRequestParams(BindInterconnectionCidRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public BindInterconnectionCidRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class BindInterconnectionCidRequestRequestParams extends TeaModel {
        // AIM 群会话ID
        @NameInMap("AimAppCid")
        public String aimAppCid;

        // 钉钉 群会话ID
        @NameInMap("DingTalkCid")
        public String dingTalkCid;

        public static BindInterconnectionCidRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            BindInterconnectionCidRequestRequestParams self = new BindInterconnectionCidRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public BindInterconnectionCidRequestRequestParams setAimAppCid(String aimAppCid) {
            this.aimAppCid = aimAppCid;
            return this;
        }
        public String getAimAppCid() {
            return this.aimAppCid;
        }

        public BindInterconnectionCidRequestRequestParams setDingTalkCid(String dingTalkCid) {
            this.dingTalkCid = dingTalkCid;
            return this;
        }
        public String getDingTalkCid() {
            return this.dingTalkCid;
        }

    }

}
