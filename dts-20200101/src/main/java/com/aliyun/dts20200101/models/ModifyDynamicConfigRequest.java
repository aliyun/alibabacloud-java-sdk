// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDynamicConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;dts.datamove.source.rps.max\&quot;:5000,\&quot;dts.datamove.source.bps.max\&quot;:10485760}</p>
     */
    @NameInMap("ConfigList")
    public String configList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta7w132u12h****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLimit")
    public Boolean enableLimit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>07</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyDynamicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDynamicConfigRequest self = new ModifyDynamicConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDynamicConfigRequest setConfigList(String configList) {
        this.configList = configList;
        return this;
    }
    public String getConfigList() {
        return this.configList;
    }

    public ModifyDynamicConfigRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDynamicConfigRequest setEnableLimit(Boolean enableLimit) {
        this.enableLimit = enableLimit;
        return this;
    }
    public Boolean getEnableLimit() {
        return this.enableLimit;
    }

    public ModifyDynamicConfigRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public ModifyDynamicConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDynamicConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
