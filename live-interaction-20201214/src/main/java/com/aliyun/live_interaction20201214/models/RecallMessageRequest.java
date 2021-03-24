// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RecallMessageRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public RecallMessageRequestRequestParams requestParams;

    public static RecallMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecallMessageRequest self = new RecallMessageRequest();
        return TeaModel.build(map, self);
    }

    public RecallMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RecallMessageRequest setRequestParams(RecallMessageRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public RecallMessageRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class RecallMessageRequestRequestParams extends TeaModel {
        // 操作者ID
        @NameInMap("AppUid")
        public String appUid;

        // 会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 消息ID
        @NameInMap("MsgId")
        public String msgId;

        // 撤回显示类型（默认为0)。0：静默撤回，不显示撤回信息，1：普通撤回，显示撤回信息；
        @NameInMap("Type")
        public Integer type;

        // 操作者类型(默认为0)。0: 发送者; 1: 群主; 2: 系统; 3: 安全合规; 101: 业务自定义类型
        @NameInMap("OperatorType")
        public Integer operatorType;

        // 业务自定义扩展字段
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static RecallMessageRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RecallMessageRequestRequestParams self = new RecallMessageRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public RecallMessageRequestRequestParams setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public RecallMessageRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public RecallMessageRequestRequestParams setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public RecallMessageRequestRequestParams setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public RecallMessageRequestRequestParams setOperatorType(Integer operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public Integer getOperatorType() {
            return this.operatorType;
        }

        public RecallMessageRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

}
