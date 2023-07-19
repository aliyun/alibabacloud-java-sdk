// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SkipPreCheckRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the precheck task. You can call the **DescribePreCheckStatus** operation to query the task ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to skip the precheck item. Valid values:</p>
     * <br>
     * <p>*   **true**: skips the precheck item.</p>
     * <p>*   **false**: does not skip the precheck item.</p>
     * <br>
     * <p>>  This parameter is required.</p>
     */
    @NameInMap("Skip")
    public Boolean skip;

    /**
     * <p>The shortened name of the precheck item. Valid values:</p>
     * <br>
     * <p>*   **CHECK_SAME_OBJ**: object name conflict</p>
     * <br>
     * <p>*   **CHECK_SAME_USER**: multiple usernames for one instance</p>
     * <br>
     * <p>*   **CHECK_SRC**: source database version</p>
     * <br>
     * <p>*   **CHECK_TOPOLOGY**: topology type</p>
     * <br>
     * <p>> For more information about the topologies supported by DTS, see [Synchronization topologies](~~124115~~).</p>
     * <br>
     * <p>*   **CHECK_SERVER_ID**: the server ID of the source database</p>
     * <br>
     * <p>>  Separate multiple shortened names with commas (,).</p>
     */
    @NameInMap("SkipPreCheckItems")
    public String skipPreCheckItems;

    /**
     * <p>The name of the precheck item. This parameter corresponds to the **SkipPreCheckItems** parameter. Valid values:</p>
     * <br>
     * <p>*   **CHECK_SAME_OBJ_DETAIL**: object name conflict</p>
     * <br>
     * <p>*   **CHECK_SAME_USER_DETAIL**: multiple usernames for one instance</p>
     * <br>
     * <p>*   **CHECK_SRC_DETAIL**: source database version</p>
     * <br>
     * <p>*   **CHECK_TOPOLOGY_DETAIL**: topology type</p>
     * <br>
     * <p>> For more information about the topologies supported by DTS, see [Synchronization topologies](~~124115~~).</p>
     * <br>
     * <p>*   **CHECK_SERVER_ID_DETAIL**: the server ID of the source database</p>
     * <br>
     * <p>>  Separate multiple item names with commas (,).</p>
     */
    @NameInMap("SkipPreCheckNames")
    public String skipPreCheckNames;

    public static SkipPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipPreCheckRequest self = new SkipPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public SkipPreCheckRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public SkipPreCheckRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SkipPreCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SkipPreCheckRequest setSkip(Boolean skip) {
        this.skip = skip;
        return this;
    }
    public Boolean getSkip() {
        return this.skip;
    }

    public SkipPreCheckRequest setSkipPreCheckItems(String skipPreCheckItems) {
        this.skipPreCheckItems = skipPreCheckItems;
        return this;
    }
    public String getSkipPreCheckItems() {
        return this.skipPreCheckItems;
    }

    public SkipPreCheckRequest setSkipPreCheckNames(String skipPreCheckNames) {
        this.skipPreCheckNames = skipPreCheckNames;
        return this;
    }
    public String getSkipPreCheckNames() {
        return this.skipPreCheckNames;
    }

}
