// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemAddToCMDBResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("value")
    public java.util.List<Long> value;

    public static ItemAddToCMDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ItemAddToCMDBResponseBody self = new ItemAddToCMDBResponseBody();
        return TeaModel.build(map, self);
    }

    public ItemAddToCMDBResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ItemAddToCMDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ItemAddToCMDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ItemAddToCMDBResponseBody setValue(java.util.List<Long> value) {
        this.value = value;
        return this;
    }
    public java.util.List<Long> getValue() {
        return this.value;
    }

}
