// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupSilenceMembersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ListGroupSilenceMembersRequestRequestParams requestParams;

    public static ListGroupSilenceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupSilenceMembersRequest self = new ListGroupSilenceMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupSilenceMembersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListGroupSilenceMembersRequest setRequestParams(ListGroupSilenceMembersRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ListGroupSilenceMembersRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ListGroupSilenceMembersRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        public static ListGroupSilenceMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListGroupSilenceMembersRequestRequestParams self = new ListGroupSilenceMembersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ListGroupSilenceMembersRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public ListGroupSilenceMembersRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

    }

}
