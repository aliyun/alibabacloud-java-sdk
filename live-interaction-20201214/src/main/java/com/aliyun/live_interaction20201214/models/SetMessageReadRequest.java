// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetMessageReadRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public SetMessageReadRequestRequestParams requestParams;

    public static SetMessageReadRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMessageReadRequest self = new SetMessageReadRequest();
        return TeaModel.build(map, self);
    }

    public SetMessageReadRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetMessageReadRequest setRequestParams(SetMessageReadRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SetMessageReadRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SetMessageReadRequestRequestParams extends TeaModel {
        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("MsgId")
        public String msgId;

        public static SetMessageReadRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SetMessageReadRequestRequestParams self = new SetMessageReadRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SetMessageReadRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public SetMessageReadRequestRequestParams setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
