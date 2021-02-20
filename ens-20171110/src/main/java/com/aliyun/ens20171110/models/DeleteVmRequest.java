// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteVmRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("WorkloadUuid")
    public String workloadUuid;

    public static DeleteVmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVmRequest self = new DeleteVmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVmRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DeleteVmRequest setWorkloadUuid(String workloadUuid) {
        this.workloadUuid = workloadUuid;
        return this;
    }
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

}
