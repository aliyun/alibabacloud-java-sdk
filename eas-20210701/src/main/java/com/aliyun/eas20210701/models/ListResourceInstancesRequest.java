// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstancesRequest extends TeaModel {
    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The keyword used to query instances. Instances can be queried by instance ID or instance IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.224.xx.xx</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.224.xx.xx</p>
     */
    @NameInMap("InstanceIP")
    public String instanceIP;

    /**
     * <p>The instance ID. For more information about how to query the instance ID, see <a href="https://help.aliyun.com/document_detail/412129.html">ListResourceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1jd6x3uotsv****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>e-xxxx***</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance state.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Ready-SchedulingDisabled</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The instance is available but unschedulable</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>Ready</p>
     * <!-- -->
     * 
     * <p>: The instance</p>
     * <!-- -->
     * 
     * <p>is running</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>NotReady</p>
     * <!-- -->
     * 
     * <p>: The instance is unready.</p>
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Stopped</p>
     * <!-- -->
     * 
     * <p>: The instance has stopped.</p>
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>NotReady-SchedulingDisabled</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The instance is unavailable and unschedulable</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>Attaching</p>
     * <!-- -->
     * 
     * <p>: The instance</p>
     * <!-- -->
     * 
     * <p>is starting</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>Deleting</p>
     * <!-- -->
     * 
     * <p>: The instance is being deleted.</p>
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>CreateFailed: The instance failed to be created.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Label")
    public java.util.Map<String, String> label;

    /**
     * <p>The sorting order.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>asc: The instances are sorted in ascending order.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>desc</p>
     * <!-- -->
     * 
     * <p>: The instances are sorted in descending order.</p>
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field that you use to sort the query results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>CreateTime</p>
     * <!-- -->
     * 
     * <p>: The instances are sorted based on the time when the instances were created.</p>
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>MemoryUsed</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The instances are sorted based on the memory usage of the instances</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>GpuUsed</p>
     * <!-- -->
     * 
     * <p>: The instances are sorted based on the</p>
     * <!-- -->
     * 
     * <p>GPU usage of the instances.</p>
     * <!-- -->
     * </li>
     * <li><p>ExpireTime: The instances are sorted based on the time when the instances expired.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>CpuUsed</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>The instances are sorted based on the CPU utilization of the instances.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("Zone")
    public String zone;

    public static ListResourceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstancesRequest self = new ListResourceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListResourceInstancesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListResourceInstancesRequest setInstanceIP(String instanceIP) {
        this.instanceIP = instanceIP;
        return this;
    }
    public String getInstanceIP() {
        return this.instanceIP;
    }

    public ListResourceInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListResourceInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListResourceInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public ListResourceInstancesRequest setLabel(java.util.Map<String, String> label) {
        this.label = label;
        return this;
    }
    public java.util.Map<String, String> getLabel() {
        return this.label;
    }

    public ListResourceInstancesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListResourceInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceInstancesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListResourceInstancesRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
