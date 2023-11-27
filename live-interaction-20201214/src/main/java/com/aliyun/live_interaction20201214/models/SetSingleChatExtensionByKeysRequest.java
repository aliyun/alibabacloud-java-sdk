// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetSingleChatExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public SetSingleChatExtensionByKeysRequestRequestParams requestParams;

    public static SetSingleChatExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSingleChatExtensionByKeysRequest self = new SetSingleChatExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public SetSingleChatExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetSingleChatExtensionByKeysRequest setRequestParams(SetSingleChatExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SetSingleChatExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SetSingleChatExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static SetSingleChatExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SetSingleChatExtensionByKeysRequestRequestParams self = new SetSingleChatExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SetSingleChatExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SetSingleChatExtensionByKeysRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public SetSingleChatExtensionByKeysRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

}
