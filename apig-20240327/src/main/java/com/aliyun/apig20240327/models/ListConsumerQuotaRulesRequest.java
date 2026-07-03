// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerQuotaRulesRequest extends TeaModel {
    /**
     * <p>The gateway ID. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-123456</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The rule name keyword, used for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>daily</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListConsumerQuotaRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerQuotaRulesRequest self = new ListConsumerQuotaRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerQuotaRulesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListConsumerQuotaRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListConsumerQuotaRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumerQuotaRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
