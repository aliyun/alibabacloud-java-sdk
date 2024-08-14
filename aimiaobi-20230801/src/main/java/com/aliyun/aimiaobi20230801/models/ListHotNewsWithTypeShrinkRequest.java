// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotNewsWithTypeShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>society</p>
     */
    @NameInMap("NewsType")
    public String newsType;

    @NameInMap("NewsTypes")
    public String newsTypesShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static ListHotNewsWithTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotNewsWithTypeShrinkRequest self = new ListHotNewsWithTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotNewsWithTypeShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListHotNewsWithTypeShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListHotNewsWithTypeShrinkRequest setNewsType(String newsType) {
        this.newsType = newsType;
        return this;
    }
    public String getNewsType() {
        return this.newsType;
    }

    public ListHotNewsWithTypeShrinkRequest setNewsTypesShrink(String newsTypesShrink) {
        this.newsTypesShrink = newsTypesShrink;
        return this;
    }
    public String getNewsTypesShrink() {
        return this.newsTypesShrink;
    }

    public ListHotNewsWithTypeShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
