// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetUserConversationExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public SetUserConversationExtensionByKeysRequestRequestParams requestParams;

    public static SetUserConversationExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserConversationExtensionByKeysRequest self = new SetUserConversationExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public SetUserConversationExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetUserConversationExtensionByKeysRequest setRequestParams(SetUserConversationExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SetUserConversationExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SetUserConversationExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static SetUserConversationExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SetUserConversationExtensionByKeysRequestRequestParams self = new SetUserConversationExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SetUserConversationExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SetUserConversationExtensionByKeysRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public SetUserConversationExtensionByKeysRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

}
