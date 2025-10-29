// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceBandwidthDetailRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The maximum interval between the beginning time and the end time is 86400 seconds. The interval is left-closed and right-open. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-11 30:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the ENS node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-6ecpqvkicnchxccozrpxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance, such as vm, eip, single_tenant, and nc. You can leave this parameter empty. The type of the instance, such as vm, eip, single_tenant, and nc.</p>
     * 
     * <strong>example:</strong>
     * <p>vm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the service, such as vm, eip, esk, and meta.</p>
     * 
     * <strong>example:</strong>
     * <p>vm</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-11 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInstanceBandwidthDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBandwidthDetailRequest self = new DescribeInstanceBandwidthDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBandwidthDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceBandwidthDetailRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeInstanceBandwidthDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceBandwidthDetailRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceBandwidthDetailRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceBandwidthDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceBandwidthDetailRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public DescribeInstanceBandwidthDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
