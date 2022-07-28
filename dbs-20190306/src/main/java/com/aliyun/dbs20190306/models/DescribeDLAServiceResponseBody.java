// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeDLAServiceResponseBody extends TeaModel {
    @NameInMap("AutoAdd")
    public Boolean autoAdd;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HaveJobFailed")
    public Boolean haveJobFailed;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDLAServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDLAServiceResponseBody self = new DescribeDLAServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDLAServiceResponseBody setAutoAdd(Boolean autoAdd) {
        this.autoAdd = autoAdd;
        return this;
    }
    public Boolean getAutoAdd() {
        return this.autoAdd;
    }

    public DescribeDLAServiceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDLAServiceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDLAServiceResponseBody setHaveJobFailed(Boolean haveJobFailed) {
        this.haveJobFailed = haveJobFailed;
        return this;
    }
    public Boolean getHaveJobFailed() {
        return this.haveJobFailed;
    }

    public DescribeDLAServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDLAServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDLAServiceResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeDLAServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
