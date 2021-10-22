// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class BindInterconnectionUidRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 绑定用户请求体
    @NameInMap("RequestParams")
    public BindInterconnectionUidRequestRequestParams requestParams;

    public static BindInterconnectionUidRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInterconnectionUidRequest self = new BindInterconnectionUidRequest();
        return TeaModel.build(map, self);
    }

    public BindInterconnectionUidRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindInterconnectionUidRequest setRequestParams(BindInterconnectionUidRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public BindInterconnectionUidRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class BindInterconnectionUidRequestRequestParams extends TeaModel {
        // AIM用户ID
        @NameInMap("AppUid")
        public String appUid;

        // 钉钉用户ID
        @NameInMap("DingTalkUid")
        public String dingTalkUid;

        public static BindInterconnectionUidRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            BindInterconnectionUidRequestRequestParams self = new BindInterconnectionUidRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public BindInterconnectionUidRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public BindInterconnectionUidRequestRequestParams setDingTalkUid(String dingTalkUid) {
            this.dingTalkUid = dingTalkUid;
            return this;
        }
        public String getDingTalkUid() {
            return this.dingTalkUid;
        }

    }

}
