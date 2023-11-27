// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupMemberByIdsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public GetGroupMemberByIdsRequestRequestParams requestParams;

    public static GetGroupMemberByIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupMemberByIdsRequest self = new GetGroupMemberByIdsRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupMemberByIdsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetGroupMemberByIdsRequest setRequestParams(GetGroupMemberByIdsRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public GetGroupMemberByIdsRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class GetGroupMemberByIdsRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUids")
        public java.util.List<String> appUids;

        public static GetGroupMemberByIdsRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetGroupMemberByIdsRequestRequestParams self = new GetGroupMemberByIdsRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public GetGroupMemberByIdsRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public GetGroupMemberByIdsRequestRequestParams setAppUids(java.util.List<String> appUids) {
            this.appUids = appUids;
            return this;
        }
        public java.util.List<String> getAppUids() {
            return this.appUids;
        }

    }

}
