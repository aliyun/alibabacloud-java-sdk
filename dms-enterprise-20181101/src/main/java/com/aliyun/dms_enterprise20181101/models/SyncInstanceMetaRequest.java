// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SyncInstanceMetaRequest extends TeaModel {
    /**
     * <p>Specifies whether to skip synchronization for the metadata of table dictionaries. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IgnoreTable")
    public Boolean ignoreTable;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html) section of the Manage DMS tenants topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static SyncInstanceMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInstanceMetaRequest self = new SyncInstanceMetaRequest();
        return TeaModel.build(map, self);
    }

    public SyncInstanceMetaRequest setIgnoreTable(Boolean ignoreTable) {
        this.ignoreTable = ignoreTable;
        return this;
    }
    public Boolean getIgnoreTable() {
        return this.ignoreTable;
    }

    public SyncInstanceMetaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncInstanceMetaRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
