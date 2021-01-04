// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SyncInstanceMetaRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IgnoreTable")
    public Boolean ignoreTable;

    public static SyncInstanceMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInstanceMetaRequest self = new SyncInstanceMetaRequest();
        return TeaModel.build(map, self);
    }

    public SyncInstanceMetaRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public SyncInstanceMetaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncInstanceMetaRequest setIgnoreTable(Boolean ignoreTable) {
        this.ignoreTable = ignoreTable;
        return this;
    }
    public Boolean getIgnoreTable() {
        return this.ignoreTable;
    }

}
