// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatConversationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ImportGroupChatConversationResponseBodyResult result;

    public static ImportGroupChatConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportGroupChatConversationResponseBody self = new ImportGroupChatConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportGroupChatConversationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportGroupChatConversationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportGroupChatConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportGroupChatConversationResponseBody setResult(ImportGroupChatConversationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ImportGroupChatConversationResponseBodyResult getResult() {
        return this.result;
    }

    public static class ImportGroupChatConversationResponseBodyResult extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        public static ImportGroupChatConversationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ImportGroupChatConversationResponseBodyResult self = new ImportGroupChatConversationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ImportGroupChatConversationResponseBodyResult setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

    }

}
