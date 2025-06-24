// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatGroupInviteLinkResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p><a href="https://chat.whatsapp.com/">https://chat.whatsapp.com/</a>****</p>
     */
    @NameInMap("InviteLink")
    public String inviteLink;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3EIK939***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddChatGroupInviteLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddChatGroupInviteLinkResponseBody self = new AddChatGroupInviteLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public AddChatGroupInviteLinkResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddChatGroupInviteLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddChatGroupInviteLinkResponseBody setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
        return this;
    }
    public String getInviteLink() {
        return this.inviteLink;
    }

    public AddChatGroupInviteLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddChatGroupInviteLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddChatGroupInviteLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
