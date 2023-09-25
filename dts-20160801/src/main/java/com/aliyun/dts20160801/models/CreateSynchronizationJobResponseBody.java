// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class CreateSynchronizationJobResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static CreateSynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSynchronizationJobResponseBody self = new CreateSynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSynchronizationJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateSynchronizationJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateSynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSynchronizationJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateSynchronizationJobResponseBody setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
