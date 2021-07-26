// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpBlockRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("IpBlockRecordId")
    public String ipBlockRecordId;

    public static GetIpBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpBlockRecordRequest self = new GetIpBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetIpBlockRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetIpBlockRecordRequest setIpBlockRecordId(String ipBlockRecordId) {
        this.ipBlockRecordId = ipBlockRecordId;
        return this;
    }
    public String getIpBlockRecordId() {
        return this.ipBlockRecordId;
    }

}
