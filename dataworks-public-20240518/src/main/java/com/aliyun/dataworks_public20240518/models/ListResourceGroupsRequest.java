// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    /**
     * <p>The name of a resource group, which is used for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The billing method of resource groups. Valid values: PrePaid and PostPaid. The value PrePaid indicates the subscription billing method, and the value PostPaid indicates the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The types of resource groups to query. If you do not configure this parameter, only serverless resource groups are returned by default.</p>
     */
    @NameInMap("ResourceGroupTypes")
    public java.util.List<String> resourceGroupTypes;

    /**
     * <p>The statuses of resource groups.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListResourceGroupsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListResourceGroupsRequest setResourceGroupTypes(java.util.List<String> resourceGroupTypes) {
        this.resourceGroupTypes = resourceGroupTypes;
        return this;
    }
    public java.util.List<String> getResourceGroupTypes() {
        return this.resourceGroupTypes;
    }

    public ListResourceGroupsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
