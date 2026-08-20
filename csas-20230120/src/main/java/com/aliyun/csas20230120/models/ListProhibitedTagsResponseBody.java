// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedTagsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>287434FF-344F-565A-8623-439005BA9287</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of prohibited software tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListProhibitedTagsResponseBodyTags> tags;

    /**
     * <p>The total number of prohibited software tags.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListProhibitedTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedTagsResponseBody self = new ListProhibitedTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProhibitedTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProhibitedTagsResponseBody setTags(java.util.List<ListProhibitedTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListProhibitedTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public ListProhibitedTagsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListProhibitedTagsResponseBodyTags extends TeaModel {
        /**
         * <p>The time when the prohibited software tag was created, in the yyyy-MM-dd HH:mm:ss format. The time is in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10 11:39:34</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the prohibited software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the tag is a system built-in device tag. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in device tag.</li>
         * <li><strong>false</strong>: A user-defined device tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The name of the prohibited software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The collection of software prohibition policy IDs that reference the tag.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The collection of prohibited software IDs included in the tag.</p>
         */
        @NameInMap("SoftwareIds")
        public java.util.List<String> softwareIds;

        /**
         * <p>The ID of the prohibited software tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-7b2c9e4a1d8f****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static ListProhibitedTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedTagsResponseBodyTags self = new ListProhibitedTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListProhibitedTagsResponseBodyTags setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProhibitedTagsResponseBodyTags setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProhibitedTagsResponseBodyTags setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedTagsResponseBodyTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProhibitedTagsResponseBodyTags setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListProhibitedTagsResponseBodyTags setSoftwareIds(java.util.List<String> softwareIds) {
            this.softwareIds = softwareIds;
            return this;
        }
        public java.util.List<String> getSoftwareIds() {
            return this.softwareIds;
        }

        public ListProhibitedTagsResponseBodyTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
