// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateElasticPlanRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ElasticPlanEnable")
    public Boolean elasticPlanEnable;

    @NameInMap("ElasticPlanEndDay")
    public String elasticPlanEndDay;

    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    @NameInMap("ElasticPlanNodeNum")
    public Integer elasticPlanNodeNum;

    @NameInMap("ElasticPlanStartDay")
    public String elasticPlanStartDay;

    @NameInMap("ElasticPlanTimeEnd")
    public String elasticPlanTimeEnd;

    @NameInMap("ElasticPlanTimeStart")
    public String elasticPlanTimeStart;

    @NameInMap("ElasticPlanWeeklyRepeat")
    public String elasticPlanWeeklyRepeat;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourcePoolName")
    public String resourcePoolName;

    public static CreateElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticPlanRequest self = new CreateElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateElasticPlanRequest setElasticPlanEnable(Boolean elasticPlanEnable) {
        this.elasticPlanEnable = elasticPlanEnable;
        return this;
    }
    public Boolean getElasticPlanEnable() {
        return this.elasticPlanEnable;
    }

    public CreateElasticPlanRequest setElasticPlanEndDay(String elasticPlanEndDay) {
        this.elasticPlanEndDay = elasticPlanEndDay;
        return this;
    }
    public String getElasticPlanEndDay() {
        return this.elasticPlanEndDay;
    }

    public CreateElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public CreateElasticPlanRequest setElasticPlanNodeNum(Integer elasticPlanNodeNum) {
        this.elasticPlanNodeNum = elasticPlanNodeNum;
        return this;
    }
    public Integer getElasticPlanNodeNum() {
        return this.elasticPlanNodeNum;
    }

    public CreateElasticPlanRequest setElasticPlanStartDay(String elasticPlanStartDay) {
        this.elasticPlanStartDay = elasticPlanStartDay;
        return this;
    }
    public String getElasticPlanStartDay() {
        return this.elasticPlanStartDay;
    }

    public CreateElasticPlanRequest setElasticPlanTimeEnd(String elasticPlanTimeEnd) {
        this.elasticPlanTimeEnd = elasticPlanTimeEnd;
        return this;
    }
    public String getElasticPlanTimeEnd() {
        return this.elasticPlanTimeEnd;
    }

    public CreateElasticPlanRequest setElasticPlanTimeStart(String elasticPlanTimeStart) {
        this.elasticPlanTimeStart = elasticPlanTimeStart;
        return this;
    }
    public String getElasticPlanTimeStart() {
        return this.elasticPlanTimeStart;
    }

    public CreateElasticPlanRequest setElasticPlanWeeklyRepeat(String elasticPlanWeeklyRepeat) {
        this.elasticPlanWeeklyRepeat = elasticPlanWeeklyRepeat;
        return this;
    }
    public String getElasticPlanWeeklyRepeat() {
        return this.elasticPlanWeeklyRepeat;
    }

    public CreateElasticPlanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateElasticPlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateElasticPlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateElasticPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateElasticPlanRequest setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

}
