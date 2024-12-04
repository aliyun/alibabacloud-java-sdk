// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsShrinkRequest extends TeaModel {
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
    public String resourceGroupTypesShrink;

    /**
     * <p>The statuses of resource groups.</p>
     */
    @NameInMap("Statuses")
    public String statusesShrink;

    public static ListResourceGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsShrinkRequest self = new ListResourceGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListResourceGroupsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListResourceGroupsShrinkRequest setResourceGroupTypesShrink(String resourceGroupTypesShrink) {
        this.resourceGroupTypesShrink = resourceGroupTypesShrink;
        return this;
    }
    public String getResourceGroupTypesShrink() {
        return this.resourceGroupTypesShrink;
    }

    public ListResourceGroupsShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}
