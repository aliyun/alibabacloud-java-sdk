// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListRequest extends TeaModel {
    @NameInMap("TagRegionId")
    public String tagRegionId;

    @NameInMap("TagKey")
    public String tagKey;

    @NameInMap("TagValue")
    public String tagValue;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeDynamicTagRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicTagRuleListRequest self = new DescribeDynamicTagRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicTagRuleListRequest setTagRegionId(String tagRegionId) {
        this.tagRegionId = tagRegionId;
        return this;
    }
    public String getTagRegionId() {
        return this.tagRegionId;
    }

    public DescribeDynamicTagRuleListRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public DescribeDynamicTagRuleListRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
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
