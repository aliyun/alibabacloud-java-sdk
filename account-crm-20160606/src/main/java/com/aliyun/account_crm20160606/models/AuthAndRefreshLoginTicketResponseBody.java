// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthAndRefreshLoginTicketResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AuthAndRefreshLoginTicketResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static AuthAndRefreshLoginTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthAndRefreshLoginTicketResponseBody self = new AuthAndRefreshLoginTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthAndRefreshLoginTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthAndRefreshLoginTicketResponseBody setData(AuthAndRefreshLoginTicketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AuthAndRefreshLoginTicketResponseBodyData getData() {
        return this.data;
    }

    public AuthAndRefreshLoginTicketResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AuthAndRefreshLoginTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AuthAndRefreshLoginTicketResponseBodyData extends TeaModel {
        @NameInMap("NewLoginTicket")
        public String newLoginTicket;

        public static AuthAndRefreshLoginTicketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AuthAndRefreshLoginTicketResponseBodyData self = new AuthAndRefreshLoginTicketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AuthAndRefreshLoginTicketResponseBodyData setNewLoginTicket(String newLoginTicket) {
            this.newLoginTicket = newLoginTicket;
            return this;
        }
        public String getNewLoginTicket() {
            return this.newLoginTicket;
        }

    }

}
