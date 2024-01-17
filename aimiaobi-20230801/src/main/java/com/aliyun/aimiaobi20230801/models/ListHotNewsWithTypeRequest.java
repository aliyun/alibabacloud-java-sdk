// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotNewsWithTypeRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("NewsType")
    public String newsType;

    @NameInMap("NewsTypes")
    public java.util.List<String> newsTypes;

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
