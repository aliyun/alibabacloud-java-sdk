// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmIssueOrderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    /**
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    @NameInMap("TbOrderId")
    public String tbOrderId;

    @NameInMap("TicketContents")
    public String ticketContents;

    public static TaobaoFilmIssueOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmIssueOrderResponseBody self = new TaobaoFilmIssueOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmIssueOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmIssueOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmIssueOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaobaoFilmIssueOrderResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmIssueOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmIssueOrderResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaobaoFilmIssueOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmIssueOrderResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public TaobaoFilmIssueOrderResponseBody setTbOrderId(String tbOrderId) {
        this.tbOrderId = tbOrderId;
        return this;
    }
    public String getTbOrderId() {
        return this.tbOrderId;
    }

    public TaobaoFilmIssueOrderResponseBody setTicketContents(String ticketContents) {
        this.ticketContents = ticketContents;
        return this;
    }
    public String getTicketContents() {
        return this.ticketContents;
    }

}
