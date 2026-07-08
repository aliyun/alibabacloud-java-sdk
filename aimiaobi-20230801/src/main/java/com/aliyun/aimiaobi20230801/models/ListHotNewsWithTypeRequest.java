// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotNewsWithTypeRequest extends TeaModel {
    /**
     * <p>The unique identifier of the business space: <a href="https://help.aliyun.com/document_detail/3027170.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>The news category. Valid values:</p>
     * <ul>
     * <li>society: social current affairs.</li>
     * <li>person: people news.</li>
     * <li>government: government affairs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>society</p>
     */
    @NameInMap("NewsType")
    public String newsType;

    /**
     * <p>The list of news categories for multi-selection. Valid values:</p>
     * <ul>
     * <li>society: social current affairs.</li>
     * <li>person: people news.</li>
     * <li>government: government affairs.</li>
     * </ul>
     */
    @NameInMap("NewsTypes")
    public java.util.List<String> newsTypes;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static ListHotNewsWithTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotNewsWithTypeRequest self = new ListHotNewsWithTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListHotNewsWithTypeRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListHotNewsWithTypeRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListHotNewsWithTypeRequest setNewsType(String newsType) {
        this.newsType = newsType;
        return this;
    }
    public String getNewsType() {
        return this.newsType;
    }

    public ListHotNewsWithTypeRequest setNewsTypes(java.util.List<String> newsTypes) {
        this.newsTypes = newsTypes;
        return this;
    }
    public java.util.List<String> getNewsTypes() {
        return this.newsTypes;
    }

    public ListHotNewsWithTypeRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
