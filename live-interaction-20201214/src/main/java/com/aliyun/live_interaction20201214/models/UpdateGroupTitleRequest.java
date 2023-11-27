// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateGroupTitleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UpdateGroupTitleRequestRequestParams requestParams;

    public static UpdateGroupTitleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupTitleRequest self = new UpdateGroupTitleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupTitleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGroupTitleRequest setRequestParams(UpdateGroupTitleRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateGroupTitleRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UpdateGroupTitleRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        @NameInMap("Title")
        public String title;

        public static UpdateGroupTitleRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupTitleRequestRequestParams self = new UpdateGroupTitleRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateGroupTitleRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public UpdateGroupTitleRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

        public UpdateGroupTitleRequestRequestParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
