// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreatePublishGroupTaskRequest extends TeaModel {
    /**
     * <p>The ID of the database for which the schema design is executed.</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>Indicates whether the database is a logical database.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The ID of the ticket.</p>
     * <br>
     * <p>> : You can create a schema design ticket in the DMS console. For more information, see [Design schemas](~~69711~~). You can also create a schema design ticket by calling the [CreateOrder](~~144649~~) operation and obtain the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The time to execute the schema design ticket.</p>
     */
    @NameInMap("PlanTime")
    public String planTime;

    /**
     * <p>The policy to execute the schema design ticket. Valid values:</p>
     * <br>
     * <p>*   IMMEDIATELY: immediately executes the schema design ticket.</p>
     * <p>*   REGULARLY: executes the schema design ticket at a scheduled time.</p>
     */
    @NameInMap("PublishStrategy")
    public String publishStrategy;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](~~181330~~).</p>
     */
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

    public CreatePublishGroupTaskRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
