// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefensePoliciesRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management.</p>
     * <p>If you do not configure this parameter, the default resource group is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the policy that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: pending activation.</li>
     * <li><strong>2</strong>: active.</li>
     * <li><strong>3</strong>: expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The templatetype used by the policy that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>promotion</strong>: Important Activity template.</li>
     * <li><strong>bypass</strong>: full forwarding template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
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
