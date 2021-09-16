// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CountJobByConditionRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("Params")
    public String params;

    @NameInMap("Status")
    public String status;

    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OrderColumn")
    public String orderColumn;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("GroupId")
    public String groupId;

    public static CountJobByConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        CountJobByConditionRequest self = new CountJobByConditionRequest();
        return TeaModel.build(map, self);
    }

    public CountJobByConditionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CountJobByConditionRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CountJobByConditionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CountJobByConditionRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CountJobByConditionRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CountJobByConditionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CountJobByConditionRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public CountJobByConditionRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public CountJobByConditionRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CountJobByConditionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
