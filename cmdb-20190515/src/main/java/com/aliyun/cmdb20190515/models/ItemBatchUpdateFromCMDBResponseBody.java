// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class ItemBatchUpdateFromCMDBResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("success")
    public Boolean success;

    public static ItemBatchUpdateFromCMDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ItemBatchUpdateFromCMDBResponseBody self = new ItemBatchUpdateFromCMDBResponseBody();
        return TeaModel.build(map, self);
    }

    public ItemBatchUpdateFromCMDBResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ItemBatchUpdateFromCMDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ItemBatchUpdateFromCMDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
