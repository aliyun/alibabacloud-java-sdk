// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class UpdateReminderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateReminderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateReminderResponseBody self = new UpdateReminderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateReminderResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdateReminderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateReminderResponseBody setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public UpdateReminderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
