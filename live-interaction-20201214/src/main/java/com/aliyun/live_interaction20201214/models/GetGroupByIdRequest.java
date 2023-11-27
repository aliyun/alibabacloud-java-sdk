// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public GetGroupByIdRequestRequestParams requestParams;

    public static GetGroupByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByIdRequest self = new GetGroupByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetGroupByIdRequest setRequestParams(GetGroupByIdRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public GetGroupByIdRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class GetGroupByIdRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        public static GetGroupByIdRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetGroupByIdRequestRequestParams self = new GetGroupByIdRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public GetGroupByIdRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

    }

}
