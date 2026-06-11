// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleSubjectUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
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
