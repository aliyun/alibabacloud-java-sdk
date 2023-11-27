// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public RemoveGroupExtensionByKeysRequestRequestParams requestParams;

    public static RemoveGroupExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupExtensionByKeysRequest self = new RemoveGroupExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveGroupExtensionByKeysRequest setRequestParams(RemoveGroupExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RemoveGroupExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RemoveGroupExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("Keys")
        public java.util.List<String> keys;

        public static RemoveGroupExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RemoveGroupExtensionByKeysRequestRequestParams self = new RemoveGroupExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RemoveGroupExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RemoveGroupExtensionByKeysRequestRequestParams setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

    }

}
