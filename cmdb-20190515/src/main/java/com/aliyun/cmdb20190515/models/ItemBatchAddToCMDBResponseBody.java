// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemBatchAddToCMDBResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("value")
    public java.util.List<Long> value;

    public static ItemBatchAddToCMDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ItemBatchAddToCMDBResponseBody self = new ItemBatchAddToCMDBResponseBody();
        return TeaModel.build(map, self);
    }

    public ItemBatchAddToCMDBResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ItemBatchAddToCMDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ItemBatchAddToCMDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ItemBatchAddToCMDBResponseBody setValue(java.util.List<Long> value) {
        this.value = value;
        return this;
    }
    public java.util.List<Long> getValue() {
        return this.value;
    }

}
