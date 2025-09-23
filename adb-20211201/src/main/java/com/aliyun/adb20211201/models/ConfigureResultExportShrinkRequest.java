// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ConfigureResultExportShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9509beptiz****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("OssInfo")
    public String ossInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SlsInfo")
    public String slsInfoShrink;

    public static ConfigureResultExportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureResultExportShrinkRequest self = new ConfigureResultExportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureResultExportShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ConfigureResultExportShrinkRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ConfigureResultExportShrinkRequest setOssInfoShrink(String ossInfoShrink) {
        this.ossInfoShrink = ossInfoShrink;
        return this;
    }
    public String getOssInfoShrink() {
        return this.ossInfoShrink;
    }

    public ConfigureResultExportShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureResultExportShrinkRequest setSlsInfoShrink(String slsInfoShrink) {
        this.slsInfoShrink = slsInfoShrink;
        return this;
    }
    public String getSlsInfoShrink() {
        return this.slsInfoShrink;
    }

}
