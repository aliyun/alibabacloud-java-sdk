// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class AppGroupUpdateFromCMDBResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    public static AppGroupUpdateFromCMDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppGroupUpdateFromCMDBResponseBody self = new AppGroupUpdateFromCMDBResponseBody();
        return TeaModel.build(map, self);
    }

    public AppGroupUpdateFromCMDBResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public AppGroupUpdateFromCMDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AppGroupUpdateFromCMDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
