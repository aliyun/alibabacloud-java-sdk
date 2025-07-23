// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateRequest extends TeaModel {
    /**
     * <p>The keyword that is used to search for templates.</p>
     * 
     * <strong>example:</strong>
     * <p>cadt</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>The criterion by which the returned templates are sorted. Valid values:</p>
     * <ul>
     * <li>1: The templates are sorted by the time when they are updated.</li>
     * <li>2: The templates are sorted by the time when they are created.</li>
     * <li>3: The templates are sorted by the system.</li>
     * <li>4: The templates are sorted by the number of times that they are used.</li>
     * <li>If you specify an integer other than 1, 2, 3, and 4 or do not specify any value, the templates are sorted by the system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public Long orderType;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyjt3c5om3hi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<ListTemplateRequestTag> tag;

    /**
     * <p>The tag that you want to use to query templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TagList")
    @Deprecated
    public Integer tagList;

    /**
     * <p>The type of the templates to be returned. Valid values: public and private</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateRequest self = new ListTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTemplateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTemplateRequest setOrderType(Long orderType) {
        this.orderType = orderType;
        return this;
    }
    public Long getOrderType() {
        return this.orderType;
    }

    public ListTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplateRequest setTag(java.util.List<ListTemplateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTemplateRequestTag> getTag() {
        return this.tag;
    }

    @Deprecated
    public ListTemplateRequest setTagList(Integer tagList) {
        this.tagList = tagList;
        return this;
    }
    public Integer getTagList() {
        return this.tagList;
    }

    public ListTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListTemplateRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTemplateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateRequestTag self = new ListTemplateRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTemplateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTemplateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
