// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeLhDagOwnerRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("OwnerUserId")
    public Long ownerUserId;

    @NameInMap("Tid")
    public Long tid;

    public static ChangeLhDagOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeLhDagOwnerRequest self = new ChangeLhDagOwnerRequest();
        return TeaModel.build(map, self);
    }

    public ChangeLhDagOwnerRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ChangeLhDagOwnerRequest setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public ChangeLhDagOwnerRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
