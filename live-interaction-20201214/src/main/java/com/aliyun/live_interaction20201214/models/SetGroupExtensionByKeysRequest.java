// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public SetGroupExtensionByKeysRequestRequestParams requestParams;

    public static SetGroupExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGroupExtensionByKeysRequest self = new SetGroupExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public SetGroupExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetGroupExtensionByKeysRequest setRequestParams(SetGroupExtensionByKeysRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SetGroupExtensionByKeysRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SetGroupExtensionByKeysRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static SetGroupExtensionByKeysRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SetGroupExtensionByKeysRequestRequestParams self = new SetGroupExtensionByKeysRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SetGroupExtensionByKeysRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SetGroupExtensionByKeysRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

}
