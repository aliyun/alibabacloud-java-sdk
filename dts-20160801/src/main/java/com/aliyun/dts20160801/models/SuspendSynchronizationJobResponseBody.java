// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class SuspendSynchronizationJobResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static SuspendSynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendSynchronizationJobResponseBody self = new SuspendSynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendSynchronizationJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SuspendSynchronizationJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SuspendSynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SuspendSynchronizationJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
