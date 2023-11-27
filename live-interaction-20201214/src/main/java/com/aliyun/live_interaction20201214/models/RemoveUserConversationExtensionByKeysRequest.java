// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveUserConversationExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public RemoveUserConversationExtensionByKeysRequestRequestParams requestParams;

    public static RemoveUserConversationExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserConversationExtensionByKeysRequest self = new RemoveUserConversationExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserConversationExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveUserConversationExtensionByKeysRequest setRequestParams(RemoveUserConversationExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveUserConversationExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveUserConversationExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Keys")
        public java.util.List<String> keys;

        public static RemoveUserConversationExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveUserConversationExtensionByKeysRequestRequestParams self = new RemoveUserConversationExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveUserConversationExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveUserConversationExtensionByKeysRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public RemoveUserConversationExtensionByKeysRequestRequestParams setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

    }

}
