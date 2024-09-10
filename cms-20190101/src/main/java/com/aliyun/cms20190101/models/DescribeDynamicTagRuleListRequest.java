// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListRequest extends TeaModel {
    /**
     * <p>The ID of the tag rule.</p>
     * 
     * <strong>example:</strong>
     * <p>004155fa-15ba-466d-b61a-***********</p>
     */
    @NameInMap("DynamicTagRuleId")
    public String dynamicTagRuleId;

    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Minimum value: 1. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The tag key.</p>
     * <p>For more information about how to obtain a tag key, see <a href="https://help.aliyun.com/document_detail/145558.html">DescribeTagKeyList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>tagkey1</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    /**
     * <p>The ID of the region to which the tags belong.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TagRegionId")
    public String tagRegionId;

    /**
     * <p>The tag value.</p>
     * <p>For more information about how to obtain a tag value, see <a href="https://help.aliyun.com/document_detail/145557.html">DescribeTagKeyList</a>.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
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
