// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListAgentRequest extends TeaModel {
    @NameInMap("AgentName")
    public String agentName;

    @NameInMap("GoodsCodes")
    public String goodsCodes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    public static ListAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRequest self = new ListAgentRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ListAgentRequest setGoodsCodes(String goodsCodes) {
        this.goodsCodes = goodsCodes;
        return this;
    }
    public String getGoodsCodes() {
        return this.goodsCodes;
    }

    public ListAgentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
