// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateGroupIconRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UpdateGroupIconRequestRequestParams requestParams;

    public static UpdateGroupIconRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupIconRequest self = new UpdateGroupIconRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupIconRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGroupIconRequest setRequestParams(UpdateGroupIconRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateGroupIconRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UpdateGroupIconRequestRequestParams extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("IconMediaId")
        public String iconMediaId;

        @NameInMap("OperatorAppUid")
        public String operatorAppUid;

        public static UpdateGroupIconRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupIconRequestRequestParams self = new UpdateGroupIconRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateGroupIconRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public UpdateGroupIconRequestRequestParams setIconMediaId(String iconMediaId) {
            this.iconMediaId = iconMediaId;
            return this;
        }
        public String getIconMediaId() {
            return this.iconMediaId;
        }

        public UpdateGroupIconRequestRequestParams setOperatorAppUid(String operatorAppUid) {
            this.operatorAppUid = operatorAppUid;
            return this;
        }
        public String getOperatorAppUid() {
            return this.operatorAppUid;
        }

    }

}
