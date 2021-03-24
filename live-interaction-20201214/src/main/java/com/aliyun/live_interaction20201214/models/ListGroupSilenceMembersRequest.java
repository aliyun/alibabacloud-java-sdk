// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupSilenceMembersRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 群禁言添加白名单请求体
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
        // 操作者
        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        // 群会话id
        @NameInMap("AppCid")
        public String appCid;

        public static ListGroupSilenceMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListGroupSilenceMembersRequestRequestParams self = new ListGroupSilenceMembersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ListGroupSilenceMembersRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public ListGroupSilenceMembersRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

    }

}
