// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitSipTrunkResponseBody extends TeaModel {
    @NameInMap("ApplyId")
    public String applyId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSipTrunkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSipTrunkResponseBody self = new SubmitSipTrunkResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSipTrunkResponseBody setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public SubmitSipTrunkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitSipTrunkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitSipTrunkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
