// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveSingleChatExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public RemoveSingleChatExtensionByKeysRequestRequestParams requestParams;

    public static RemoveSingleChatExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSingleChatExtensionByKeysRequest self = new RemoveSingleChatExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSingleChatExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveSingleChatExtensionByKeysRequest setRequestParams(RemoveSingleChatExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveSingleChatExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveSingleChatExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Keys")
        public java.util.List<String> keys;

        public static RemoveSingleChatExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveSingleChatExtensionByKeysRequestRequestParams self = new RemoveSingleChatExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveSingleChatExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveSingleChatExtensionByKeysRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public RemoveSingleChatExtensionByKeysRequestRequestParams setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

    }

}
