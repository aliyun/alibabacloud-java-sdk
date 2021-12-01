// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobResponseBody extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public Boolean errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyDtsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobResponseBody self = new ModifyDtsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifyDtsJobResponseBody setErrMessage(Boolean errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public Boolean getErrMessage() {
        return this.errMessage;
    }

    public ModifyDtsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDtsJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyDtsJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
