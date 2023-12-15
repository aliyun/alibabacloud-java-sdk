// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class DeleteReminderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteReminderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReminderResponseBody self = new DeleteReminderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReminderResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteReminderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteReminderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
