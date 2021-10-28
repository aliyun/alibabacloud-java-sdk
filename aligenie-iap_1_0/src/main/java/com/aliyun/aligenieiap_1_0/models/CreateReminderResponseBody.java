// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CreateReminderResponseBody extends TeaModel {
    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // 创建的提醒id
    @NameInMap("Model")
    public Long model;

    // 服务成功标识
    @NameInMap("Success")
    public Boolean success;

    public static CreateReminderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReminderResponseBody self = new CreateReminderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReminderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateReminderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateReminderResponseBody setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public CreateReminderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
