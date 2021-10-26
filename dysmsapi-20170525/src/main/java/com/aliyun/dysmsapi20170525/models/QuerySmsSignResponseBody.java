// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateDate")
    public String createDate;

    @NameInMap("Message")
    public String message;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignStatus")
    public Integer signStatus;

    public static QuerySmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignResponseBody self = new QuerySmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsSignResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public QuerySmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsSignResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QuerySmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSignResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsSignResponseBody setSignStatus(Integer signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public Integer getSignStatus() {
        return this.signStatus;
    }

}
