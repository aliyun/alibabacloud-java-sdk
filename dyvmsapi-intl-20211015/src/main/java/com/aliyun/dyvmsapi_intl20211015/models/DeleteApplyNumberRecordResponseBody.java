// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteApplyNumberRecordResponseBody extends TeaModel {
    @NameInMap("ApplyId")
    public String applyId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplyNumberRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplyNumberRecordResponseBody self = new DeleteApplyNumberRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplyNumberRecordResponseBody setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public DeleteApplyNumberRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteApplyNumberRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteApplyNumberRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
