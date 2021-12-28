// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeHardwareTerminalsRequest extends TeaModel {
    @NameInMap("HardwareType")
    public String hardwareType;

    @NameInMap("HardwareVersion")
    public String hardwareVersion;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeHardwareTerminalsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHardwareTerminalsRequest self = new DescribeHardwareTerminalsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHardwareTerminalsRequest setHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
        return this;
    }
    public String getHardwareType() {
        return this.hardwareType;
    }

    public DescribeHardwareTerminalsRequest setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
        return this;
    }
    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public DescribeHardwareTerminalsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
