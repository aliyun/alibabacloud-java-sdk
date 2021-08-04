// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputBooleanResponseBody extends TeaModel {
    @NameInMap("result")
    public Boolean result;

    @NameInMap("current")
    public Integer current;

    @NameInMap("total")
    public Long total;

    @NameInMap("totalPage")
    public Integer totalPage;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("bizException")
    public Boolean bizException;

    @NameInMap("errorMsg")
    public String errorMsg;

    public static PrimitiveInputBooleanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputBooleanResponseBody self = new PrimitiveInputBooleanResponseBody();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputBooleanResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public PrimitiveInputBooleanResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PrimitiveInputBooleanResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PrimitiveInputBooleanResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public PrimitiveInputBooleanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PrimitiveInputBooleanResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PrimitiveInputBooleanResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PrimitiveInputBooleanResponseBody setBizException(Boolean bizException) {
        this.bizException = bizException;
        return this;
    }
    public Boolean getBizException() {
        return this.bizException;
    }

    public PrimitiveInputBooleanResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
