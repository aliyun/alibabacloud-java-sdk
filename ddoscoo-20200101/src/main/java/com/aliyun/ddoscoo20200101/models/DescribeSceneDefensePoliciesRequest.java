// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefensePoliciesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Template")
    public String template;

    @NameInMap("Status")
    public String status;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSceneDefensePoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDefensePoliciesRequest self = new DescribeSceneDefensePoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDefensePoliciesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSceneDefensePoliciesRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public DescribeSceneDefensePoliciesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSceneDefensePoliciesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
