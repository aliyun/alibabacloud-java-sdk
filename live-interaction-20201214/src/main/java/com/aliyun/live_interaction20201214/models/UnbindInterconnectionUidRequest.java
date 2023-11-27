// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UnbindInterconnectionUidRequest extends TeaModel {
    /**
     * <p>AppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UnbindInterconnectionUidRequestRequestParams requestParams;

    public static UnbindInterconnectionUidRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInterconnectionUidRequest self = new UnbindInterconnectionUidRequest();
        return TeaModel.build(map, self);
    }

    public UnbindInterconnectionUidRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindInterconnectionUidRequest setRequestParams(UnbindInterconnectionUidRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UnbindInterconnectionUidRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UnbindInterconnectionUidRequestRequestParams extends TeaModel {
        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("DingTalkUid")
        public String dingTalkUid;

        public static UnbindInterconnectionUidRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UnbindInterconnectionUidRequestRequestParams self = new UnbindInterconnectionUidRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UnbindInterconnectionUidRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public UnbindInterconnectionUidRequestRequestParams setDingTalkUid(String dingTalkUid) {
            this.dingTalkUid = dingTalkUid;
            return this;
        }
        public String getDingTalkUid() {
            return this.dingTalkUid;
        }

    }

}
