// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobReplicatorCompareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynchronizationReplicatorCompareEnable")
    public Boolean synchronizationReplicatorCompareEnable;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeSynchronizationJobReplicatorCompareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobReplicatorCompareResponseBody self = new DescribeSynchronizationJobReplicatorCompareResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobReplicatorCompareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobReplicatorCompareResponseBody setSynchronizationReplicatorCompareEnable(Boolean synchronizationReplicatorCompareEnable) {
        this.synchronizationReplicatorCompareEnable = synchronizationReplicatorCompareEnable;
        return this;
    }
    public Boolean getSynchronizationReplicatorCompareEnable() {
        return this.synchronizationReplicatorCompareEnable;
    }

    public DescribeSynchronizationJobReplicatorCompareResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSynchronizationJobReplicatorCompareResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSynchronizationJobReplicatorCompareResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
