// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeCheckJobsRequest extends TeaModel {
    /**
     * <p>Check the task job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>z9p104ib23***</p>
     */
    @NameInMap("CheckJobId")
    public String checkJobId;

    /**
     * <p>The type of the check</p>
     * <blockquote>
     * <blockquote>
     * <p>1 full quantity, 2 incremental, 3 all</p>
     * </blockquote>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>Data migration instance ID, which can be queried by calling the <strong>describemigrationjobs</strong> API.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsz9p104ib23e972e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the data migration or synchronization job.</p>
     * 
     * <strong>example:</strong>
     * <p>zwy_test</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Resource group ID.</p>
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
