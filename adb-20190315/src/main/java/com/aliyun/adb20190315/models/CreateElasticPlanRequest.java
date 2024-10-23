// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateElasticPlanRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1d8lbdj22rx****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether the scaling plan takes effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ElasticPlanEnable")
    public Boolean elasticPlanEnable;

    /**
     * <p>The end date of the scaling plan. Specify the date in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-09</p>
     */
    @NameInMap("ElasticPlanEndDay")
    public String elasticPlanEndDay;

    /**
     * <p>The dates of the month when you want to execute the scaling plan. A number specifies a date of the month. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,15,25</p>
     */
    @NameInMap("ElasticPlanMonthlyRepeat")
    public String elasticPlanMonthlyRepeat;

    /**
     * <p>The name of the scaling plan.</p>
     * <ul>
     * <li>The name must be 2 to 30 characters in length.</li>
     * <li>The name can contain letters, digits, and underscores (_).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    /**
     * <p>The number of nodes that are involved in the scaling plan.</p>
     * <ul>
     * <li>If ElasticPlanType is set to <strong>worker</strong>, you can set this parameter to 0 or leave this parameter empty.</li>
     * <li>If ElasticPlanType is set to <strong>executorcombineworker</strong> or <strong>executor</strong>, you must set this parameter to a value that is greater than 0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ElasticPlanNodeNum")
    public Integer elasticPlanNodeNum;

    /**
     * <p>The start date of the scaling plan. Specify the date in the yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-02</p>
     */
    @NameInMap("ElasticPlanStartDay")
    public String elasticPlanStartDay;

    /**
     * <p>The restoration time of the scaling plan. Specify the time on the hour in the HH:mm:ss format. The interval between the scale-up time and the restoration time cannot be more than 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10:00:00</p>
     */
    @NameInMap("ElasticPlanTimeEnd")
    public String elasticPlanTimeEnd;

    /**
     * <p>The scale-up time of the scaling plan. Specify the time on the hour in the HH:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00:00</p>
     */
    @NameInMap("ElasticPlanTimeStart")
    public String elasticPlanTimeStart;

    /**
     * <p>The type of the scaling plan. Valid values:</p>
     * <ul>
     * <li><strong>worker</strong>: scales only elastic I/O resources.</li>
     * <li><strong>executor</strong>: scales only computing resources.</li>
     * <li><strong>executorcombineworker</strong> (default): scales both elastic I/O resources and computing resources by proportion.<blockquote>
     * <ul>
     * <li>If you want to set this parameter to <strong>executorcombineworker</strong>, make sure that the cluster runs a minor version of 3.1.3.2 or later.</li>
     * <li>If you want to set this parameter to <strong>worker</strong> or <strong>executor</strong>, make sure that the cluster runs a minor version of 3.1.6.1 or later and a ticket is submitted. After your request is approved, you can set this parameter to <strong>worker</strong> or <strong>executor</strong>.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>worker</p>
     */
    @NameInMap("ElasticPlanType")
    public String elasticPlanType;

    /**
     * <p>The days of the week when you want to execute the scaling plan. Valid values: 0 to 6 (Sunday to Saturday). Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4,5</p>
     */
    @NameInMap("ElasticPlanWeeklyRepeat")
    public String elasticPlanWeeklyRepeat;

    /**
     * <p>The resource specifications that can be scaled up by the scaling plan. Valid values:</p>
     * <ul>
     * <li>8 Core 64 GB (default)</li>
     * <li>16 Core 64 GB</li>
     * <li>32 Core 64 GB</li>
     * <li>64 Core 128 GB</li>
     * <li>12 Core 96 GB</li>
     * <li>24 Core 96 GB</li>
     * <li>52 Core 86 GB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>32 Core 64 GB</p>
     */
    @NameInMap("ElasticPlanWorkerSpec")
    public String elasticPlanWorkerSpec;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the resource group.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/466685.html">DescribeDBResourceGroup</a> operation to query the resource group name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>realtime</p>
     */
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

    public CreateElasticPlanRequest setElasticPlanMonthlyRepeat(String elasticPlanMonthlyRepeat) {
        this.elasticPlanMonthlyRepeat = elasticPlanMonthlyRepeat;
        return this;
    }
    public String getElasticPlanMonthlyRepeat() {
        return this.elasticPlanMonthlyRepeat;
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

    public CreateElasticPlanRequest setElasticPlanType(String elasticPlanType) {
        this.elasticPlanType = elasticPlanType;
        return this;
    }
    public String getElasticPlanType() {
        return this.elasticPlanType;
    }

    public CreateElasticPlanRequest setElasticPlanWeeklyRepeat(String elasticPlanWeeklyRepeat) {
        this.elasticPlanWeeklyRepeat = elasticPlanWeeklyRepeat;
        return this;
    }
    public String getElasticPlanWeeklyRepeat() {
        return this.elasticPlanWeeklyRepeat;
    }

    public CreateElasticPlanRequest setElasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
        this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
        return this;
    }
    public String getElasticPlanWorkerSpec() {
        return this.elasticPlanWorkerSpec;
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
