// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ShieldPrecheckRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or data synchronization instance. You can call the **DescribeMigrationJobs** or DescribeSynchronizationJobs operation to query the instance ID.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The precheck items that you want to ignore. Separate multiple items with commas (,). Valid values:</p>
     * <br>
     * <p>*   **CHECK_SAME_OBJ**: schema name conflict</p>
     * <br>
     * <p>*   **CHECK_SAME_USER**: multiple usernames for one instance</p>
     * <br>
     * <p>*   **CHECK_SRC**: source database version</p>
     * <br>
     * <p>*   **CHECK_TOPOLOGY**: topology</p>
     * <br>
     * <p>> For more information about the topologies supported by DTS, see [Synchronization topologies](~~124115~~).</p>
     * <br>
     * <p>*   **CHECK_SERVER_ID**: value of server_id in the source database</p>
     */
    @NameInMap("PrecheckItems")
    public String precheckItems;

    @NameInMap("RegionId")
    public String regionId;

    public static ShieldPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ShieldPrecheckRequest self = new ShieldPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public ShieldPrecheckRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ShieldPrecheckRequest setPrecheckItems(String precheckItems) {
        this.precheckItems = precheckItems;
        return this;
    }
    public String getPrecheckItems() {
        return this.precheckItems;
    }

    public ShieldPrecheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
