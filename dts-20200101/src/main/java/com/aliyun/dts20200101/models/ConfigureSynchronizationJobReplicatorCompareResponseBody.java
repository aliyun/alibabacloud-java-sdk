// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobReplicatorCompareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrCode")
    public String errCode;

    public static ConfigureSynchronizationJobReplicatorCompareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobReplicatorCompareResponseBody self = new ConfigureSynchronizationJobReplicatorCompareResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobReplicatorCompareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigureSynchronizationJobReplicatorCompareResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ConfigureSynchronizationJobReplicatorCompareResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ConfigureSynchronizationJobReplicatorCompareResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
