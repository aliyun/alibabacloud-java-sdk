// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateElasticPlanRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable <strong>Default Proportional Scaling for EIUs</strong>. Valid values:</p>
     * <ul>
     * <li>true. In this case, storage resources are scaled along with computing resources, and the TargetSize and CronExpression parameters are not supported.</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter must be specified when Type is set to WORKER. This parameter is not required when Type is set to EXECUTOR.</p>
     * </li>
     * <li><p>You can enable Default Proportional Scaling for EIUs for only a single scaling plan of a cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoScale")
    public Boolean autoScale;

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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
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
     * <p> The name must be 2 to 30 characters in length and can contain letters, digits, and underscores (_). The name must start with a letter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    /**
     * <p>Specifies whether to immediately enable the scaling plan after the plan is created. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

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
     * <p>The name of the resource group.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you want to create a scaling plan that uses interactive resource groups, you must specify this parameter. If you want to create a scaling plan that uses elastic I/O units (EIUs), you do not need to specify this parameter.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the resource group name for a cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

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

    /**
     * <p>The type of the scaling plan. Valid values:</p>
     * <ul>
     * <li>EXECUTOR: the interactive resource group type, which indicates the computing resource type.</li>
     * <li>WORKER: the EIU type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXECUTOR</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticPlanRequest self = new CreateElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticPlanRequest setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    public CreateElasticPlanRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public CreateElasticPlanRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateElasticPlanRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateElasticPlanRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public CreateElasticPlanRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateElasticPlanRequest setTargetSize(String targetSize) {
        this.targetSize = targetSize;
        return this;
    }
    public String getTargetSize() {
        return this.targetSize;
    }

    public CreateElasticPlanRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
