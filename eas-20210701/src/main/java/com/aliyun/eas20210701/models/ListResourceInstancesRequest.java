// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstancesRequest extends TeaModel {
    /**
     * <p>The billing method of the machines to filter. Valid values:</p>
     * <ul>
     * <li>PrePaid: Subscription.</li>
     * <li>PostPaid: Pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The search keyword. You can search by machine ID or IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.224.xx.xx</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The IP address of the machine.</p>
     * 
     * <strong>example:</strong>
     * <p>10.224.xx.xx</p>
     */
    @NameInMap("InstanceIP")
    public String instanceIP;

    /**
     * <p>Filters the results by instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/412129.html">ListResourceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1jd6x3uots****a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Filters the results by instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>e-xxxx***</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The status of the machine.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>Filters the results by label.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:null}</p>
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
     * <p>The page number of the machine instance list in the dedicated resource group. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The paging Settings for the number of machines to return on each page in a paged query. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The zone of the machine.</p>
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
