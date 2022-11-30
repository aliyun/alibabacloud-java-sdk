// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteSipTrunkApplyResponseBody extends TeaModel {
    @NameInMap("ApplyId")
    public String applyId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSipTrunkApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSipTrunkApplyResponseBody self = new DeleteSipTrunkApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSipTrunkApplyResponseBody setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public DeleteSipTrunkApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSipTrunkApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSipTrunkApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
