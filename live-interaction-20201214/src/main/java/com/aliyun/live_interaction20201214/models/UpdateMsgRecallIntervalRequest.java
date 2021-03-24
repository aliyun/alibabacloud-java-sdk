// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateMsgRecallIntervalRequest extends TeaModel {
    // 请求
    @NameInMap("RequestParams")
    public UpdateMsgRecallIntervalRequestRequestParams requestParams;

    // 应用Id
    @NameInMap("AppId")
    public String appId;

    public static UpdateMsgRecallIntervalRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsgRecallIntervalRequest self = new UpdateMsgRecallIntervalRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsgRecallIntervalRequest setRequestParams(UpdateMsgRecallIntervalRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateMsgRecallIntervalRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public UpdateMsgRecallIntervalRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public static class UpdateMsgRecallIntervalRequestRequestParams extends TeaModel {
        // 消息撤回时间间隔
        @NameInMap("MsgRecallInterval")
        public Long msgRecallInterval;

        public static UpdateMsgRecallIntervalRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateMsgRecallIntervalRequestRequestParams self = new UpdateMsgRecallIntervalRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateMsgRecallIntervalRequestRequestParams setMsgRecallInterval(Long msgRecallInterval) {
            this.msgRecallInterval = msgRecallInterval;
            return this;
        }
        public Long getMsgRecallInterval() {
            return this.msgRecallInterval;
        }

    }

}
