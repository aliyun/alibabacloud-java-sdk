// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class UpdatePodFromCMDBResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    public static UpdatePodFromCMDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePodFromCMDBResponseBody self = new UpdatePodFromCMDBResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePodFromCMDBResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdatePodFromCMDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdatePodFromCMDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
