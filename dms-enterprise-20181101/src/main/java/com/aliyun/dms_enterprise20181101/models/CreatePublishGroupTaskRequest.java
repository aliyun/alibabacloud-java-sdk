// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreatePublishGroupTaskRequest extends TeaModel {
    /**
     * <p>The ID of the database for which the schema design is executed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <p>Indicates whether the database is a logical database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The ID of the ticket.</p>
     * <blockquote>
     * <p>: You can create a schema design ticket in the DMS console. For more information, see <a href="https://help.aliyun.com/document_detail/69711.html">Design schemas</a>. You can also create a schema design ticket by calling the <a href="https://help.aliyun.com/document_detail/144649.html">CreateOrder</a> operation and obtain the ticket ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>142435</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The time to execute the schema design ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-10 00:00:00</p>
     */
    @NameInMap("PlanTime")
    public String planTime;

    /**
     * <p>The policy to execute the schema design ticket. Valid values:</p>
     * <ul>
     * <li>IMMEDIATELY: immediately executes the schema design ticket.</li>
     * <li>REGULARLY: executes the schema design ticket at a scheduled time.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMMEDIATELY</p>
     */
    @NameInMap("PublishStrategy")
    public String publishStrategy;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
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
