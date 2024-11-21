// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCustomScenePoliciesRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: 1 to 100000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 5, 10, and 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the policy, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850233.html">ListWafRulesets</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    public static DescribeCustomScenePoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomScenePoliciesRequest self = new DescribeCustomScenePoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomScenePoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomScenePoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomScenePoliciesRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
