// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ReadMessageRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ReadMessageRequestRequestParams requestParams;

    public static ReadMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageRequest self = new ReadMessageRequest();
        return TeaModel.build(map, self);
    }

    public ReadMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReadMessageRequest setRequestParams(ReadMessageRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ReadMessageRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ReadMessageRequestRequestParams extends TeaModel {
        // 操作者ID
        @NameInMap("AppUid")
        public String appUid;

        // 消息ID
        @NameInMap("MsgId")
        public String msgId;

        public static ReadMessageRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageRequestRequestParams self = new ReadMessageRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ReadMessageRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ReadMessageRequestRequestParams setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
