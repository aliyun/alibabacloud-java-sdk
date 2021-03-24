// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class KickOffRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public KickOffRequestRequestParams requestParams;

    public static KickOffRequest build(java.util.Map<String, ?> map) throws Exception {
        KickOffRequest self = new KickOffRequest();
        return TeaModel.build(map, self);
    }

    public KickOffRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public KickOffRequest setRequestParams(KickOffRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public KickOffRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class KickOffRequestRequestParams extends TeaModel {
        // 用户ID
        @NameInMap("AppUid")
        public String appUid;

        // 被踢下线的App的AppKey列表，为空时全部踢下线
        @NameInMap("AppKeys")
        public java.util.List<String> appKeys;

        // 下线文案
        @NameInMap("Information")
        public String information;

        public static KickOffRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            KickOffRequestRequestParams self = new KickOffRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public KickOffRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public KickOffRequestRequestParams setAppKeys(java.util.List<String> appKeys) {
            this.appKeys = appKeys;
            return this;
        }
        public java.util.List<String> getAppKeys() {
            return this.appKeys;
        }

        public KickOffRequestRequestParams setInformation(String information) {
            this.information = information;
            return this;
        }
        public String getInformation() {
            return this.information;
        }

    }

}
