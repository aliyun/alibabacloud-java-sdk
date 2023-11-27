// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SilenceAllGroupMembersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public SilenceAllGroupMembersRequestRequestParams requestParams;

    public static SilenceAllGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        SilenceAllGroupMembersRequest self = new SilenceAllGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public SilenceAllGroupMembersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SilenceAllGroupMembersRequest setRequestParams(SilenceAllGroupMembersRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SilenceAllGroupMembersRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SilenceAllGroupMembersRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        public static SilenceAllGroupMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SilenceAllGroupMembersRequestRequestParams self = new SilenceAllGroupMembersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SilenceAllGroupMembersRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SilenceAllGroupMembersRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

    }

}
