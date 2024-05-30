// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](https://help.aliyun.com/document_detail/196974.html).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the group of messages.</p>
     */
    @NameInMap("GroupMessageId")
    public String groupMessageId;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendChatappMassMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMassMessageResponseBody self = new SendChatappMassMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendChatappMassMessageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SendChatappMassMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendChatappMassMessageResponseBody setGroupMessageId(String groupMessageId) {
        this.groupMessageId = groupMessageId;
        return this;
    }
    public String getGroupMessageId() {
        return this.groupMessageId;
    }

    public SendChatappMassMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendChatappMassMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
