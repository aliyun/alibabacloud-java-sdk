// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCenterPolicyListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BusinessType")
    public Integer businessType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PolicyGroupId")
    public java.util.List<String> policyGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static DescribeCenterPolicyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenterPolicyListRequest self = new DescribeCenterPolicyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenterPolicyListRequest setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public DescribeCenterPolicyListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenterPolicyListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenterPolicyListRequest setPolicyGroupId(java.util.List<String> policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public java.util.List<String> getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeCenterPolicyListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeCenterPolicyListRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
