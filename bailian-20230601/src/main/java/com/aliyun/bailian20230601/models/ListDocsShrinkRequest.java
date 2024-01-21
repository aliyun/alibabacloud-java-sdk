// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListDocsShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("TagIds")
    public String tagIdsShrink;

    public static ListDocsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocsShrinkRequest self = new ListDocsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDocsShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListDocsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDocsShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListDocsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDocsShrinkRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ListDocsShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

}
