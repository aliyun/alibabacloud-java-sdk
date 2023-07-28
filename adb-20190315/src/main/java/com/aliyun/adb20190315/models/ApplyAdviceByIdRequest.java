// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ApplyAdviceByIdRequest extends TeaModel {
    /**
     * <p>The date when the suggestion is generated. Specify the date in the yyyyMMdd format. The date must be in UTC.</p>
     */
    @NameInMap("AdviceDate")
    public Long adviceDate;

    /**
     * <p>The suggestion ID.</p>
     */
    @NameInMap("AdviceId")
    public String adviceId;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of Data Warehouse Edition (V3.0) clusters.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ApplyAdviceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAdviceByIdRequest self = new ApplyAdviceByIdRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAdviceByIdRequest setAdviceDate(Long adviceDate) {
        this.adviceDate = adviceDate;
        return this;
    }
    public Long getAdviceDate() {
        return this.adviceDate;
    }

    public ApplyAdviceByIdRequest setAdviceId(String adviceId) {
        this.adviceId = adviceId;
        return this;
    }
    public String getAdviceId() {
        return this.adviceId;
    }

    public ApplyAdviceByIdRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ApplyAdviceByIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
