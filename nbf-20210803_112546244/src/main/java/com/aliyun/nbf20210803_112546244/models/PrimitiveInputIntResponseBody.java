// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputIntResponseBody extends TeaModel {
    @NameInMap("result")
    public Integer result;

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
    public java.io.InputStream errorCode;

    @NameInMap("bizException")
    public Boolean bizException;

    @NameInMap("errorMsg")
    public java.io.InputStream errorMsg;

    public static PrimitiveInputIntResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputIntResponseBody self = new PrimitiveInputIntResponseBody();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputIntResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public PrimitiveInputIntResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PrimitiveInputIntResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PrimitiveInputIntResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public PrimitiveInputIntResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PrimitiveInputIntResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PrimitiveInputIntResponseBody setErrorCode(java.io.InputStream errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public java.io.InputStream getErrorCode() {
        return this.errorCode;
    }

    public PrimitiveInputIntResponseBody setBizException(Boolean bizException) {
        this.bizException = bizException;
        return this;
    }
    public Boolean getBizException() {
        return this.bizException;
    }

    public PrimitiveInputIntResponseBody setErrorMsg(java.io.InputStream errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public java.io.InputStream getErrorMsg() {
        return this.errorMsg;
    }

}
