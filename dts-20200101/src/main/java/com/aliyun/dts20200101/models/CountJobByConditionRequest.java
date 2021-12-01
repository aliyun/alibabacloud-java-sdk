// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CountJobByConditionRequest extends TeaModel {
    // 目标端数据库类型
    @NameInMap("DestDbType")
    public String destDbType;

    // 父任务id
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JobType")
    public String jobType;

    // 查询的值，与Type对应
    @NameInMap("Params")
    public String params;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    // 源端数据库类型
    @NameInMap("SrcDbType")
    public String srcDbType;

    @NameInMap("Status")
    public String status;

    // 查询类型
    @NameInMap("Type")
    public String type;

    public static CountJobByConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        CountJobByConditionRequest self = new CountJobByConditionRequest();
        return TeaModel.build(map, self);
    }

    public CountJobByConditionRequest setDestDbType(String destDbType) {
        this.destDbType = destDbType;
        return this;
    }
    public String getDestDbType() {
        return this.destDbType;
    }

    public CountJobByConditionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

    public CountJobByConditionRequest setSrcDbType(String srcDbType) {
        this.srcDbType = srcDbType;
        return this;
    }
    public String getSrcDbType() {
        return this.srcDbType;
    }

    public CountJobByConditionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CountJobByConditionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
