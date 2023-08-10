// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDynamicConfigRequest extends TeaModel {
    @NameInMap("ConfigList")
    public String configList;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("EnableLimit")
    public Boolean enableLimit;

    @NameInMap("JobCode")
    public String jobCode;

    @NameInMap("RegionId")
    public String regionId;

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

}
