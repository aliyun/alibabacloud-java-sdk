// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsRequest extends TeaModel {
    /**
     * <p>The ID of the DTS dedicated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_atyl3b5214uk***</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The type of the source database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("DestProductType")
    public String destProductType;

    /**
     * <p>The environment label of the DTS instance. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: normal</li>
     * <li><strong>online</strong>: online</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
     * <blockquote>
     * <p>Separate multiple instance IDs with commas (,). Make sure that the <strong>JobType</strong> parameter is set as expected.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsi03e3zty16i****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * <blockquote>
     * <p>Separate multiple task IDs with commas (,). Make sure that the <strong>JobType</strong> parameter is set as expected.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>qa110wq5r93hb49</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The DTS task ID.</p>
     * <blockquote>
     * <p>In most cases, you do not need to set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pk13r731m****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the source or destination database instance that corresponds to the <strong>InstanceType</strong> request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1966yuut4w3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the source or destination database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The task type of the DTS instance. Valid values:</p>
     * <ul>
     * <li><strong>MIGRATION</strong>: data migration (default).</li>
     * <li><strong>SYNC</strong>: data synchronization.</li>
     * <li><strong>SUBSCRIBE</strong>: change tracking.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MIGRATION</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The sort criterion when the response contains multiple DTS instances. Valid values:</p>
     * <ul>
     * <li><strong>CreateTime</strong>: sorts by task creation time.</li>
     * <li><strong>FinishTime</strong>: sorts by task completion time.</li>
     * <li><strong>duLimit</strong> (dedicated cluster tasks): sorts by the upper limit of DU usage for DTS tasks. This value is supported only for dedicated clusters.</li>
     * </ul>
     * <blockquote>
     * <p>You can also specify <strong>OrderDirection</strong> to set the sort order to ascending or descending.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The sort order of instances. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: ascending order. This is the default value.</li>
     * <li><strong>DESC</strong>: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Valid values: <strong>10</strong>, <strong>20</strong>, and <strong>30</strong>. Default value: <strong>20</strong>. Maximum value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The specific content of the query condition.</p>
     * <blockquote>
     * <p>Specify <strong>Type</strong> in advance to define the query condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtspk3f13r731m****</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Deprecated parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the destination database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SrcProductType")
    public String srcProductType;

    /**
     * <p>The instance status of the DTS instance. Valid values:</p>
     * <p>Data migration task statuses:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: not started.</li>
     * <li><strong>Prechecking</strong>: running a precheck.</li>
     * <li><strong>PrecheckFailed</strong>: precheck failed.</li>
     * <li><strong>PreCheckPass</strong>: precheck passed.</li>
     * <li><strong>NotConfigured</strong>: not configured.</li>
     * <li><strong>Migrating</strong>: migrating.</li>
     * <li><strong>Suspending</strong>: paused.</li>
     * <li><strong>MigrationFailed</strong>: migration failed.</li>
     * <li><strong>Finished</strong>: completed.</li>
     * <li><strong>Retrying</strong>: retrying.</li>
     * <li><strong>Upgrade</strong>: upgrading.</li>
     * <li><strong>Locked</strong>: locked.</li>
     * <li><strong>Downgrade</strong>: downgrading.</li>
     * </ul>
     * <p>Data synchronization task statuses:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: not started.</li>
     * <li><strong>Prechecking</strong>: running a precheck.</li>
     * <li><strong>PrecheckFailed</strong>: precheck failed.</li>
     * <li><strong>PreCheckPass</strong>: precheck passed.</li>
     * <li><strong>NotConfigured</strong>: not configured.</li>
     * <li><strong>Initializing</strong>: performing initial synchronization.</li>
     * <li><strong>InitializeFailed</strong>: initial synchronization failed.</li>
     * <li><strong>Synchronizing</strong>: synchronizing.</li>
     * <li><strong>Failed</strong>: synchronization failed.</li>
     * <li><strong>Suspending</strong>: paused.</li>
     * <li><strong>Modifying</strong>: modifying synchronization objects.</li>
     * <li><strong>Finished</strong>: completed.</li>
     * <li><strong>Retrying</strong>: retrying.</li>
     * <li><strong>Upgrade</strong>: upgrading.</li>
     * <li><strong>Locked</strong>: locked.</li>
     * <li><strong>Downgrade</strong>: downgrading.</li>
     * </ul>
     * <p>Change tracking task statuses:</p>
     * <ul>
     * <li><strong>NotConfigured</strong>: not configured.</li>
     * <li><strong>NotStarted</strong>: not started.</li>
     * <li><strong>Prechecking</strong>: running a precheck.</li>
     * <li><strong>PrecheckFailed</strong>: precheck failed.</li>
     * <li><strong>PreCheckPass</strong>: precheck passed.</li>
     * <li><strong>Starting</strong>: starting.</li>
     * <li><strong>Normal</strong>: normal.</li>
     * <li><strong>Retrying</strong>: retrying.</li>
     * <li><strong>Abnormal</strong>: abnormal.</li>
     * <li><strong>Upgrade</strong>: upgrading.</li>
     * <li><strong>Locked</strong>: locked.</li>
     * <li><strong>Downgrade</strong>: downgrading.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Migrating</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag-based search condition in JSON format.</p>
     * <blockquote>
     * <p>You can call the <strong>ListTagResources</strong> operation to query tag keys and values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[     {         \&quot;key\&quot;: \&quot;testK\&quot;,         \&quot;value\&quot;: \&quot;testV\&quot;     }  ]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The conditional query parameter. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: queries by DTS instance ID.</li>
     * <li><strong>name</strong>: queries by DTS instance name. Fuzzy match is supported.</li>
     * <li><strong>srcRds</strong>: queries by the ID of the source instance (ApsaraDB RDS).</li>
     * <li><strong>rds</strong>: queries by the ID of the destination instance (ApsaraDB RDS).</li>
     * </ul>
     * <blockquote>
     * <p>Specify the <strong>Params</strong> parameter to provide the specific content of the query condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies whether to exclude task objects from the response (not return the <strong>DbObject</strong> parameter). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: excludes <strong>DbObject</strong> from the response.</li>
     * <li><strong>false</strong>: includes <strong>DbObject</strong> in the response, which can improve the response speed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithoutDbList")
    public Boolean withoutDbList;

    /**
     * <p>Specifies whether the node is a seamless integration (Zero-ETL) node. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static DescribeDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobsRequest self = new DescribeDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobsRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeDtsJobsRequest setDestProductType(String destProductType) {
        this.destProductType = destProductType;
        return this;
    }
    public String getDestProductType() {
        return this.destProductType;
    }

    public DescribeDtsJobsRequest setDtsBisLabel(String dtsBisLabel) {
        this.dtsBisLabel = dtsBisLabel;
        return this;
    }
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    public DescribeDtsJobsRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeDtsJobsRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDtsJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDtsJobsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDtsJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeDtsJobsRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public DescribeDtsJobsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public DescribeDtsJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeDtsJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDtsJobsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeDtsJobsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDtsJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDtsJobsRequest setSrcProductType(String srcProductType) {
        this.srcProductType = srcProductType;
        return this;
    }
    public String getSrcProductType() {
        return this.srcProductType;
    }

    public DescribeDtsJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDtsJobsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeDtsJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDtsJobsRequest setWithoutDbList(Boolean withoutDbList) {
        this.withoutDbList = withoutDbList;
        return this;
    }
    public Boolean getWithoutDbList() {
        return this.withoutDbList;
    }

    public DescribeDtsJobsRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
