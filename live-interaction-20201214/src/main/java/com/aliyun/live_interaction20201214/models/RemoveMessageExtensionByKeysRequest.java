// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveMessageExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public RemoveMessageExtensionByKeysRequestRequestParams requestParams;

    public static RemoveMessageExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessageExtensionByKeysRequest self = new RemoveMessageExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMessageExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveMessageExtensionByKeysRequest setRequestParams(RemoveMessageExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveMessageExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveMessageExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("Keys")
        public java.util.List<String> keys;

        @NameInMap("MsgId")
        public String msgId;

        public static RemoveMessageExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveMessageExtensionByKeysRequestRequestParams self = new RemoveMessageExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveMessageExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveMessageExtensionByKeysRequestRequestParams setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public RemoveMessageExtensionByKeysRequestRequestParams setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
