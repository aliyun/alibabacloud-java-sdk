// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleSubjectUsageRequest extends TeaModel {
    /**
     * <p>The page number of the detailed consumption (request) records of the consumer within the cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of detailed consumption (request) records per page for the consumer within the cycle. Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static GetGatewayQuotaRuleSubjectUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleSubjectUsageRequest self = new GetGatewayQuotaRuleSubjectUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleSubjectUsageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetGatewayQuotaRuleSubjectUsageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
