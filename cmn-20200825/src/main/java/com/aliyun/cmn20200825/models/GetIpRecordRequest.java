// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("IpRecordId")
    public String ipRecordId;

    public static GetIpRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpRecordRequest self = new GetIpRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetIpRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetIpRecordRequest setIpRecordId(String ipRecordId) {
        this.ipRecordId = ipRecordId;
        return this;
    }
    public String getIpRecordId() {
        return this.ipRecordId;
    }

}
