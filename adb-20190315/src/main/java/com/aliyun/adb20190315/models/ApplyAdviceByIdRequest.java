// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ApplyAdviceByIdRequest extends TeaModel {
    /**
     * <p>The date when the suggestion is generated. Specify the date in the yyyyMMdd format. The date must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>20221101</p>
     */
    @NameInMap("AdviceDate")
    public Long adviceDate;

    /**
     * <p>The suggestion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0baf1f52-53df-487f-8292-99a03716****</p>
     */
    @NameInMap("AdviceId")
    public String adviceId;

    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of Data Warehouse Edition (V3.0) clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-uf6g8w25jacm7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
