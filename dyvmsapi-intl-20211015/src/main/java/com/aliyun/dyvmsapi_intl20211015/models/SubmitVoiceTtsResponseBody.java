// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitVoiceTtsResponseBody extends TeaModel {
    @NameInMap("ApplyId")
    public String applyId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVoiceTtsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVoiceTtsResponseBody self = new SubmitVoiceTtsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVoiceTtsResponseBody setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public SubmitVoiceTtsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitVoiceTtsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitVoiceTtsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
