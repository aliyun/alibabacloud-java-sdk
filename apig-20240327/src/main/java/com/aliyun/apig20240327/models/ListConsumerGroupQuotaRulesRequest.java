// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerGroupQuotaRulesRequest extends TeaModel {
    /**
     * <p>The ID of the gateway. This parameter is optional. If specified, the results are filtered by the exact gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-123456</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The keyword for the rule name. This parameter is optional. If specified, the results are filtered by fuzzy match on the rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>daily</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListConsumerGroupQuotaRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupQuotaRulesRequest self = new ListConsumerGroupQuotaRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupQuotaRulesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListConsumerGroupQuotaRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListConsumerGroupQuotaRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumerGroupQuotaRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
