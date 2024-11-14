// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class QueryDedicatedBlockStorageClusterInventoryDataRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <p>The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure idempotence </a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the dedicated block storage cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsc-xxx</p>
     */
    @NameInMap("DbscId")
    public String dbscId;

    /**
     * <p>End timestamp of trend data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1606403800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time interval (seconds) between data retrieval points.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the dedicated block storage cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Start timestamp of trend data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1606303800</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDedicatedBlockStorageClusterInventoryDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDedicatedBlockStorageClusterInventoryDataRequest self = new QueryDedicatedBlockStorageClusterInventoryDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDedicatedBlockStorageClusterInventoryDataRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataRequest setDbscId(String dbscId) {
        this.dbscId = dbscId;
        return this;
    }
    public String getDbscId() {
        return this.dbscId;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryDedicatedBlockStorageClusterInventoryDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
