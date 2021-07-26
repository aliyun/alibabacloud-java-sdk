// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpBlockRecordResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("IpBlockRecordId")
    public String ipBlockRecordId;

    public static CreateIpBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpBlockRecordResponseBody self = new CreateIpBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpBlockRecordResponseBody setIpBlockRecordId(String ipBlockRecordId) {
        this.ipBlockRecordId = ipBlockRecordId;
        return this;
    }
    public String getIpBlockRecordId() {
        return this.ipBlockRecordId;
    }

}
