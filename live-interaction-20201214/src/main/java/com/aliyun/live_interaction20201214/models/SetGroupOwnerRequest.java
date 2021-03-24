// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupOwnerRequest extends TeaModel {
    // App ID，IMPaaS租户的ID
    @NameInMap("AppId")
    public String appId;

    // 群主转让的请求体
    @NameInMap("RequestParams")
    public SetGroupOwnerRequestRequestParams requestParams;

    public static SetGroupOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGroupOwnerRequest self = new SetGroupOwnerRequest();
        return TeaModel.build(map, self);
    }

    public SetGroupOwnerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetGroupOwnerRequest setRequestParams(SetGroupOwnerRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SetGroupOwnerRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SetGroupOwnerRequestRequestParams extends TeaModel {
        // 会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 新群主
        @NameInMap("NewOwnerAppUid")
        public String newOwnerAppUid;

        public static SetGroupOwnerRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SetGroupOwnerRequestRequestParams self = new SetGroupOwnerRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SetGroupOwnerRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SetGroupOwnerRequestRequestParams setNewOwnerAppUid(String newOwnerAppUid) {
            this.newOwnerAppUid = newOwnerAppUid;
            return this;
        }
        public String getNewOwnerAppUid() {
            return this.newOwnerAppUid;
        }

    }

}
