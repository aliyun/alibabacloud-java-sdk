// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpRecordResponseBody extends TeaModel {
    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("IpRecordId")
    public String ipRecordId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 若创建接口为异步实现，则需返回明确的JobId。
    @NameInMap("JobId")
    public String jobId;

    public static CreateIpRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpRecordResponseBody self = new CreateIpRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpRecordResponseBody setIpRecordId(String ipRecordId) {
        this.ipRecordId = ipRecordId;
        return this;
    }
    public String getIpRecordId() {
        return this.ipRecordId;
    }

    public CreateIpRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpRecordResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
