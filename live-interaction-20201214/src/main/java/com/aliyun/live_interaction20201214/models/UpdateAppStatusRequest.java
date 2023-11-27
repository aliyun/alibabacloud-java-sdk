// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateAppStatusRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UpdateAppStatusRequestRequestParams requestParams;

    public static UpdateAppStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppStatusRequest self = new UpdateAppStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppStatusRequest setRequestParams(UpdateAppStatusRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateAppStatusRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UpdateAppStatusRequestRequestParams extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        public static UpdateAppStatusRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppStatusRequestRequestParams self = new UpdateAppStatusRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateAppStatusRequestRequestParams setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
