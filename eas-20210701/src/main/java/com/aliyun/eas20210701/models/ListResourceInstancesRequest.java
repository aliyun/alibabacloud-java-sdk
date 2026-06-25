// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstancesRequest extends TeaModel {
    /**
     * <p>Filters instances by billing method. Valid values:</p>
     * <ul>
     * <li><p>PrePaid: subscription.</p>
     * </li>
     * <li><p>PostPaid: pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>A keyword for the search. You can search by instance ID or IP address.</p>
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
     * <p>Filter by instance ID. For more information, see <a href="https://help.aliyun.com/document_detail/412129.html">ListResourceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1jd6x3uots****a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Filter by instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>e-xxxx***</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>Filter by label.</p>
     */
    @NameInMap("Label")
    public java.util.Map<String, String> label;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances to return on each page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The zone of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>J</p>
     */
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
