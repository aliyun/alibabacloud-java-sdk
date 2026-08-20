// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedTagsShrinkRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The name of the prohibited software tag. Fuzzy match is supported. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the software prohibition policy. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListProhibitedPolicies~~">ListProhibitedPolicies</a>: Lists software prohibition policies.</li>
     * <li><a href="~~CreateProhibitedPolicy~~">CreateProhibitedPolicy</a>: Creates a software prohibition policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pid-867ef4007c8a****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The unique identifier of the prohibited software.</p>
     */
    @NameInMap("SoftwareId")
    public String softwareIdShrink;

    /**
     * <p>The collection of prohibited software tag IDs. Duplicate values are not allowed. A maximum of 500 IDs can be specified.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<ListProhibitedTagsShrinkRequestTagIds> tagIds;

    public static ListProhibitedTagsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedTagsShrinkRequest self = new ListProhibitedTagsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProhibitedTagsShrinkRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListProhibitedTagsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProhibitedTagsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProhibitedTagsShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListProhibitedTagsShrinkRequest setSoftwareIdShrink(String softwareIdShrink) {
        this.softwareIdShrink = softwareIdShrink;
        return this;
    }
    public String getSoftwareIdShrink() {
        return this.softwareIdShrink;
    }

    public ListProhibitedTagsShrinkRequest setTagIds(java.util.List<ListProhibitedTagsShrinkRequestTagIds> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<ListProhibitedTagsShrinkRequestTagIds> getTagIds() {
        return this.tagIds;
    }

    public static class ListProhibitedTagsShrinkRequestTagIds extends TeaModel {
        /**
         * <p>Indicates whether the prohibited software tag is a system built-in tag. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in tag that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
         * <li><strong>false</strong>: A custom tag under the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the prohibited software tag. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedTags~~">ListProhibitedTags</a>: Lists prohibited software tags.</li>
         * <li><a href="~~CreateProhibitedTag~~">CreateProhibitedTag</a>: Creates a custom prohibited software tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag-3a5f8e50c396****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static ListProhibitedTagsShrinkRequestTagIds build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedTagsShrinkRequestTagIds self = new ListProhibitedTagsShrinkRequestTagIds();
            return TeaModel.build(map, self);
        }

        public ListProhibitedTagsShrinkRequestTagIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedTagsShrinkRequestTagIds setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
