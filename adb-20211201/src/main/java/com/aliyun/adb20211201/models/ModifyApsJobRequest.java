// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-bj1xxxxxx</p>
     */
    @NameInMap("ApsJobId")
    public String apsJobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EntireInstance&quot;:true}</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("PartitionList")
    public String partitionList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyApsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsJobRequest self = new ModifyApsJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApsJobRequest setApsJobId(String apsJobId) {
        this.apsJobId = apsJobId;
        return this;
    }
    public String getApsJobId() {
        return this.apsJobId;
    }

    public ModifyApsJobRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public ModifyApsJobRequest setPartitionList(String partitionList) {
        this.partitionList = partitionList;
        return this;
    }
    public String getPartitionList() {
        return this.partitionList;
    }

    public ModifyApsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
