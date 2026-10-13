// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListAgentRequest extends TeaModel {
    /**
     * <p>The business space name. You can use this parameter to search by name.</p>
     * 
     * <strong>example:</strong>
     * <p>BusinessSpace_001</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The commodity code. You can use this parameter to filter by commodity code and query instance information.</p>
     * 
     * <strong>example:</strong>
     * <p>G_cloudBeeBot_public</p>
     */
    @NameInMap("GoodsCodes")
    public String goodsCodes;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page in the response. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

}
