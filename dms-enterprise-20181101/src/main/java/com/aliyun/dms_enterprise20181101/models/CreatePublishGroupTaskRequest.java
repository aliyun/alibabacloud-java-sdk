// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreatePublishGroupTaskRequest extends TeaModel {
    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("Logic")
    public Boolean logic;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("PlanTime")
    public String planTime;

    @NameInMap("PublishStrategy")
    public String publishStrategy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tid")
    public Long tid;

    public static CreatePublishGroupTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishGroupTaskRequest self = new CreatePublishGroupTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishGroupTaskRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public CreatePublishGroupTaskRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public CreatePublishGroupTaskRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreatePublishGroupTaskRequest setPlanTime(String planTime) {
        this.planTime = planTime;
        return this;
    }
    public String getPlanTime() {
        return this.planTime;
    }

    public CreatePublishGroupTaskRequest setPublishStrategy(String publishStrategy) {
        this.publishStrategy = publishStrategy;
        return this;
    }
    public String getPublishStrategy() {
        return this.publishStrategy;
    }

    public CreatePublishGroupTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePublishGroupTaskRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
