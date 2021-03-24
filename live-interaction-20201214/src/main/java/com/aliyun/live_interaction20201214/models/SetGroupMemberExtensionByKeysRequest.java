// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupMemberExtensionByKeysRequest extends TeaModel {
    // App ID, IMPaaS租户的ID
    @NameInMap("AppId")
    public String appId;

    // 设置群成员扩展信息的请求体
    @NameInMap("RequestParams")
    public SetGroupMemberExtensionByKeysRequestRequestParams requestParams;

    public static SetGroupMemberExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGroupMemberExtensionByKeysRequest self = new SetGroupMemberExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public SetGroupMemberExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetGroupMemberExtensionByKeysRequest setRequestParams(SetGroupMemberExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SetGroupMemberExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SetGroupMemberExtensionByKeysRequestRequestParams extends TeaModel {
        // 会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 用户ID
        @NameInMap("AppUid")
        public String appUid;

        // 扩展信息
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static SetGroupMemberExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SetGroupMemberExtensionByKeysRequestRequestParams self = new SetGroupMemberExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SetGroupMemberExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SetGroupMemberExtensionByKeysRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public SetGroupMemberExtensionByKeysRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

}
