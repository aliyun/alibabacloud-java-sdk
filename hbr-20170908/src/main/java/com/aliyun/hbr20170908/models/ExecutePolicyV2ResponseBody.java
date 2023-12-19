// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ExecutePolicyV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExecutePolicyV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecutePolicyV2ResponseBody self = new ExecutePolicyV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecutePolicyV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecutePolicyV2ResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ExecutePolicyV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecutePolicyV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecutePolicyV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
