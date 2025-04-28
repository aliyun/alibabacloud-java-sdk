// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BatchApplyAdviceByIdListRequest extends TeaModel {
    /**
     * <p>The date when the suggestion is generated. Specify the date in the yyyyMMdd format. The date must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>20221115</p>
     */
    @NameInMap("AdviceDate")
    public Long adviceDate;

    /**
     * <p>The IDs of the suggestions to be applied. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>c2589ff3-e86c-4f19-80c8-2aeb7dd9****,53414470-ebf4-4a53-a312-8a1ad8fd****,6e8dce84-fec8-4b0b-9c04-b0cea12c****,b3b9703d-55ca-47e0-96dd-6a4a9dbf****</p>
     */
    @NameInMap("AdviceIdList")
    public String adviceIdList;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-uf6g8w25jacm7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static BatchApplyAdviceByIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchApplyAdviceByIdListRequest self = new BatchApplyAdviceByIdListRequest();
        return TeaModel.build(map, self);
    }

    public BatchApplyAdviceByIdListRequest setAdviceDate(Long adviceDate) {
        this.adviceDate = adviceDate;
        return this;
    }
    public Long getAdviceDate() {
        return this.adviceDate;
    }

    public BatchApplyAdviceByIdListRequest setAdviceIdList(String adviceIdList) {
        this.adviceIdList = adviceIdList;
        return this;
    }
    public String getAdviceIdList() {
        return this.adviceIdList;
    }

    public BatchApplyAdviceByIdListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BatchApplyAdviceByIdListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
