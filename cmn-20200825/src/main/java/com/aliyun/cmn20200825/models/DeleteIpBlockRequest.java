// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteIpBlockRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源ID
    @NameInMap("IpBlockId")
    public String ipBlockId;

    public static DeleteIpBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpBlockRequest self = new DeleteIpBlockRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteIpBlockRequest setIpBlockId(String ipBlockId) {
        this.ipBlockId = ipBlockId;
        return this;
    }
    public String getIpBlockId() {
        return this.ipBlockId;
    }

}
