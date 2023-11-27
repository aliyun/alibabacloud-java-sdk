// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupAllMembersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ListGroupAllMembersRequestRequestParams requestParams;

    public static ListGroupAllMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAllMembersRequest self = new ListGroupAllMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupAllMembersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListGroupAllMembersRequest setRequestParams(ListGroupAllMembersRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ListGroupAllMembersRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ListGroupAllMembersRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        public static ListGroupAllMembersRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListGroupAllMembersRequestRequestParams self = new ListGroupAllMembersRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ListGroupAllMembersRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

    }

}
