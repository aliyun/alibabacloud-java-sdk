// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class AppGroupAddToCMDBResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("value")
    public Long value;

    public static AppGroupAddToCMDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppGroupAddToCMDBResponseBody self = new AppGroupAddToCMDBResponseBody();
        return TeaModel.build(map, self);
    }

    public AppGroupAddToCMDBResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public AppGroupAddToCMDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AppGroupAddToCMDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AppGroupAddToCMDBResponseBody setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
