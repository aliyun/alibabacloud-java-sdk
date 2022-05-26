// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthLoginTicketResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LoginTicketDto")
    public AuthLoginTicketResponseBodyLoginTicketDto loginTicketDto;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AuthLoginTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginTicketResponseBody self = new AuthLoginTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthLoginTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthLoginTicketResponseBody setLoginTicketDto(AuthLoginTicketResponseBodyLoginTicketDto loginTicketDto) {
        this.loginTicketDto = loginTicketDto;
        return this;
    }
    public AuthLoginTicketResponseBodyLoginTicketDto getLoginTicketDto() {
        return this.loginTicketDto;
    }

    public AuthLoginTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthLoginTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthLoginTicketResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthLoginTicketResponseBodyLoginTicketDto extends TeaModel {
        @NameInMap("LoginTicket")
        public String loginTicket;

        public static AuthLoginTicketResponseBodyLoginTicketDto build(java.util.Map<String, ?> map) throws Exception {
            AuthLoginTicketResponseBodyLoginTicketDto self = new AuthLoginTicketResponseBodyLoginTicketDto();
            return TeaModel.build(map, self);
        }

        public AuthLoginTicketResponseBodyLoginTicketDto setLoginTicket(String loginTicket) {
            this.loginTicket = loginTicket;
            return this;
        }
        public String getLoginTicket() {
            return this.loginTicket;
        }

    }

}
