// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListRequest extends TeaModel {
    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("DynamicTagRuleId")
    public String dynamicTagRuleId;

    /**
     * <p>The ID of the region to which the tags belong.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The conditional expressions used to create an application group based on the tag.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Minimum value: 1. Default value: 30.</p>
     */
    @NameInMap("TagRegionId")
    public String tagRegionId;

    /**
     * <p>The ID of the tag rule.</p>
     */
    @NameInMap("TagValue")
    public String tagValue;

    public static DescribeDynamicTagRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicTagRuleListRequest self = new DescribeDynamicTagRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicTagRuleListRequest setDynamicTagRuleId(String dynamicTagRuleId) {
        this.dynamicTagRuleId = dynamicTagRuleId;
        return this;
    }
    public String getDynamicTagRuleId() {
        return this.dynamicTagRuleId;
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

    public DescribeDynamicTagRuleListRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public DescribeDynamicTagRuleListRequest setTagRegionId(String tagRegionId) {
        this.tagRegionId = tagRegionId;
        return this;
    }
    public String getTagRegionId() {
        return this.tagRegionId;
    }

    public DescribeDynamicTagRuleListRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
