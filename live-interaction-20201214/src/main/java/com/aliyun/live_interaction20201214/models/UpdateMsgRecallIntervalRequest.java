// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateMsgRecallIntervalRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UpdateMsgRecallIntervalRequestRequestParams requestParams;

    public static UpdateMsgRecallIntervalRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsgRecallIntervalRequest self = new UpdateMsgRecallIntervalRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsgRecallIntervalRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMsgRecallIntervalRequest setRequestParams(UpdateMsgRecallIntervalRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateMsgRecallIntervalRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UpdateMsgRecallIntervalRequestRequestParams extends TeaModel {
        @NameInMap("ClientMsgRecallIntervalMinute")
        public Long clientMsgRecallIntervalMinute;

        public static UpdateMsgRecallIntervalRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateMsgRecallIntervalRequestRequestParams self = new UpdateMsgRecallIntervalRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateMsgRecallIntervalRequestRequestParams setClientMsgRecallIntervalMinute(Long clientMsgRecallIntervalMinute) {
            this.clientMsgRecallIntervalMinute = clientMsgRecallIntervalMinute;
            return this;
        }
        public Long getClientMsgRecallIntervalMinute() {
            return this.clientMsgRecallIntervalMinute;
        }

    }

}
