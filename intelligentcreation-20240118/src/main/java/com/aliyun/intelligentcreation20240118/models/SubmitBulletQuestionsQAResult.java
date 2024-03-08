// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SubmitBulletQuestionsQAResult extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    public static SubmitBulletQuestionsQAResult build(java.util.Map<String, ?> map) throws Exception {
        SubmitBulletQuestionsQAResult self = new SubmitBulletQuestionsQAResult();
        return TeaModel.build(map, self);
    }

    public SubmitBulletQuestionsQAResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitBulletQuestionsQAResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SubmitBulletQuestionsQAResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
