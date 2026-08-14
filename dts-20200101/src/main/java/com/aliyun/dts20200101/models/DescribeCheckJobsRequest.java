// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeCheckJobsRequest extends TeaModel {
    /**
     * <p>The ID of the data validation task.</p>
     * 
     * <strong>example:</strong>
     * <p>z9p104ib23***</p>
     */
    @NameInMap("CheckJobId")
    public String checkJobId;

    /**
     * <p>The data validation method. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: full data validation.</li>
     * <li><strong>2</strong>: incremental data validation.</li>
     * <li><strong>3</strong>: all.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>The ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsz9p104ib23e972e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the data migration or data synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>zwy_test</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeCheckJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckJobsRequest self = new DescribeCheckJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckJobsRequest setCheckJobId(String checkJobId) {
        this.checkJobId = checkJobId;
        return this;
    }
    public String getCheckJobId() {
        return this.checkJobId;
    }

    public DescribeCheckJobsRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public DescribeCheckJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCheckJobsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescribeCheckJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCheckJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
