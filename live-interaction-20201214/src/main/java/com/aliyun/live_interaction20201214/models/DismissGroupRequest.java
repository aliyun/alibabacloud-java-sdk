// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class DismissGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    // 解散群聊请求实体
    @NameInMap("RequestParams")
    public DismissGroupRequestRequestParams requestParams;

    public static DismissGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DismissGroupRequest self = new DismissGroupRequest();
        return TeaModel.build(map, self);
    }

    public DismissGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DismissGroupRequest setRequestParams(DismissGroupRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public DismissGroupRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class DismissGroupRequestRequestParams extends TeaModel {
        // 操作用户
        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        // 会话id
        @NameInMap("AppCid")
        public String appCid;

        public static DismissGroupRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            DismissGroupRequestRequestParams self = new DismissGroupRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public DismissGroupRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public DismissGroupRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

    }

}
