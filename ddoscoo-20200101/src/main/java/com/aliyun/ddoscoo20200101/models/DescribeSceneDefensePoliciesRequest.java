// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefensePoliciesRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <br>
     * <p>*   **0**: disabled</p>
     * <p>*   **1**: pending enabling</p>
     * <p>*   **2**: enabled</p>
     * <p>*   **3**: expired</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the template that is used to create the policy. Valid values:</p>
     * <br>
     * <p>*   **promotion**: the Important Activity template</p>
     * <p>*   **bypass**: the Forward All template</p>
     */
    @NameInMap("Template")
    public String template;

    public static DescribeSceneDefensePoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDefensePoliciesRequest self = new DescribeSceneDefensePoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDefensePoliciesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSceneDefensePoliciesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSceneDefensePoliciesRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
