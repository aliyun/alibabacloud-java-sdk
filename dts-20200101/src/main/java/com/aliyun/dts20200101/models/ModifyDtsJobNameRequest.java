// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobNameRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The new name of the DTS task.</p>
     * <br>
     * <p>>  We recommend that you specify a descriptive name for easy identification. You do not need to use a unique name.</p>
     */
    @NameInMap("DtsJobName")
    public String dtsJobName;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDtsJobNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobNameRequest self = new ModifyDtsJobNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobNameRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobNameRequest setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public ModifyDtsJobNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
