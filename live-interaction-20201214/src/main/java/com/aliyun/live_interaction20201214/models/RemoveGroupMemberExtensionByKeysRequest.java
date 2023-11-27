// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupMemberExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public RemoveGroupMemberExtensionByKeysRequestRequestParams requestParams;

    public static RemoveGroupMemberExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMemberExtensionByKeysRequest self = new RemoveGroupMemberExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMemberExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveGroupMemberExtensionByKeysRequest setRequestParams(RemoveGroupMemberExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveGroupMemberExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveGroupMemberExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Keys")
        public java.util.List<String> keys;

        public static RemoveGroupMemberExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveGroupMemberExtensionByKeysRequestRequestParams self = new RemoveGroupMemberExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveGroupMemberExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveGroupMemberExtensionByKeysRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public RemoveGroupMemberExtensionByKeysRequestRequestParams setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

    }

}
