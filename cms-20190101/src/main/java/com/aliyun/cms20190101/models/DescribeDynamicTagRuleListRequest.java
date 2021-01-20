// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListRequest extends TeaModel {
    @NameInMap("TagKey")
    public String tagKey;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeDynamicTagRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicTagRuleListRequest self = new DescribeDynamicTagRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicTagRuleListRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public DescribeDynamicTagRuleListRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDynamicTagRuleListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
