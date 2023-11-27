// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMessageByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public GetMessageByIdRequestRequestParams requestParams;

    public static GetMessageByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageByIdRequest self = new GetMessageByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMessageByIdRequest setRequestParams(GetMessageByIdRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public GetMessageByIdRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class GetMessageByIdRequestRequestParams extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static GetMessageByIdRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetMessageByIdRequestRequestParams self = new GetMessageByIdRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public GetMessageByIdRequestRequestParams setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
