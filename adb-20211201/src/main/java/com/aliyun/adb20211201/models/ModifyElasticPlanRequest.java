// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanRequest extends TeaModel {
    /**
     * <p>A CORN expression that specifies the scaling cycle and time for the scaling plan.</p>
     * 
     * <strong>example:</strong>
     * <p>0 20 14 * * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9509beptiz****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the scaling plan.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/601334.html">DescribeElasticPlans</a> operation to query the names of scaling plans.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    /**
     * <p>The end time of the scaling plan.</p>
     * <blockquote>
     * <p> Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T12:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time of the scaling plan.</p>
     * <blockquote>
     * <p> Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T12:01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The desired specifications of elastic resources after scaling.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the scaling plan uses <strong>EIUs</strong> and <strong>Default Proportional Scaling for EIUs</strong> is enabled, you do not need to specify this parameter. In other cases, you must specify this parameter.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/601278.html">DescribeElasticPlanSpecifications</a> operation to query the specifications that are supported for scaling plans.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>32ACU</p>
     */
    @NameInMap("TargetSize")
    public String targetSize;

    public static ModifyElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticPlanRequest self = new ModifyElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticPlanRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public ModifyElasticPlanRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyElasticPlanRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyElasticPlanRequest setTargetSize(String targetSize) {
        this.targetSize = targetSize;
        return this;
    }
    public String getTargetSize() {
        return this.targetSize;
    }

}
