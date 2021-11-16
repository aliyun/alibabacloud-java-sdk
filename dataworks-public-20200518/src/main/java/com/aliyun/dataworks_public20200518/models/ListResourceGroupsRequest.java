// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    @NameInMap("BizExtKey")
    public String bizExtKey;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("ResourceGroupType")
    public Integer resourceGroupType;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setBizExtKey(String bizExtKey) {
        this.bizExtKey = bizExtKey;
        return this;
    }
    public String getBizExtKey() {
        return this.bizExtKey;
    }

    public ListResourceGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceGroupsRequest setResourceGroupType(Integer resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }
    public Integer getResourceGroupType() {
        return this.resourceGroupType;
    }

}
