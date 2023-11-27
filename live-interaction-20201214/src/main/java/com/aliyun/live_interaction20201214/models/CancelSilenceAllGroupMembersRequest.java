// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CancelSilenceAllGroupMembersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public CancelSilenceAllGroupMembersRequestRequestParams requestParams;

    public static CancelSilenceAllGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSilenceAllGroupMembersRequest self = new CancelSilenceAllGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public CancelSilenceAllGroupMembersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelSilenceAllGroupMembersRequest setRequestParams(CancelSilenceAllGroupMembersRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public CancelSilenceAllGroupMembersRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class CancelSilenceAllGroupMembersRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        public static CancelSilenceAllGroupMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CancelSilenceAllGroupMembersRequestRequestParams self = new CancelSilenceAllGroupMembersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public CancelSilenceAllGroupMembersRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public CancelSilenceAllGroupMembersRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

    }

}
