// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetMessageExtensionByKeysRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public SetMessageExtensionByKeysRequestRequestParams requestParams;

    public static SetMessageExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMessageExtensionByKeysRequest self = new SetMessageExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public SetMessageExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetMessageExtensionByKeysRequest setRequestParams(SetMessageExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SetMessageExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SetMessageExtensionByKeysRequestRequestParams extends TeaModel {
        // 会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 消息ID
        @NameInMap("MsgId")
        public String msgId;

        // 需设置的K-V对
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static SetMessageExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SetMessageExtensionByKeysRequestRequestParams self = new SetMessageExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SetMessageExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SetMessageExtensionByKeysRequestRequestParams setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public SetMessageExtensionByKeysRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

}
