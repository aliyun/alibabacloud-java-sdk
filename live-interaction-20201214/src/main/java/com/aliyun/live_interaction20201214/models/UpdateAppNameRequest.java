// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateAppNameRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UpdateAppNameRequestRequestParams requestParams;

    public static UpdateAppNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppNameRequest self = new UpdateAppNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppNameRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppNameRequest setRequestParams(UpdateAppNameRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateAppNameRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UpdateAppNameRequestRequestParams extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        public static UpdateAppNameRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppNameRequestRequestParams self = new UpdateAppNameRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateAppNameRequestRequestParams setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

}
