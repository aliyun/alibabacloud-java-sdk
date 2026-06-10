// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListAgentRequest extends TeaModel {
    /**
     * <p>The name of the business space. Use this parameter to filter the results.</p>
     * 
     * <strong>example:</strong>
     * <p>业务空间_001</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The commodity code. Filters the results to return only business spaces associated with a specific commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>G_cloudBeeBot_public</p>
     */
    @NameInMap("GoodsCodes")
    public String goodsCodes;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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
