// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppAttributesResponseBody extends TeaModel {
    /**
     * <p>The returned application information. It is an array that consists of AppAttribute data.</p>
     */
    @NameInMap("Apps")
    public DescribeAppAttributesResponseBodyApps apps;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8883AC74-259D-4C0B-99FC-0B7F9A588B2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAppAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAttributesResponseBody self = new DescribeAppAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppAttributesResponseBody setApps(DescribeAppAttributesResponseBodyApps apps) {
        this.apps = apps;
        return this;
    }
    public DescribeAppAttributesResponseBodyApps getApps() {
        return this.apps;
    }

    public DescribeAppAttributesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppAttributesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppAttributesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>appid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo self = new DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAppAttributesResponseBodyAppsAppAttributeTags extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo> tagInfo;

        public static DescribeAppAttributesResponseBodyAppsAppAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAttributesResponseBodyAppsAppAttributeTags self = new DescribeAppAttributesResponseBodyAppsAppAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeAppAttributesResponseBodyAppsAppAttributeTags setTagInfo(java.util.List<DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<DescribeAppAttributesResponseBodyAppsAppAttributeTagsTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class DescribeAppAttributesResponseBodyAppsAppAttribute extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20112314518278</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateApptest</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The creation time (UTC) of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-31T04:10:19Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>App test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>110461946884</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The modification time (UTC) of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-31T04:10:19Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeAppAttributesResponseBodyAppsAppAttributeTags tags;

        public static DescribeAppAttributesResponseBodyAppsAppAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAttributesResponseBodyAppsAppAttribute self = new DescribeAppAttributesResponseBodyAppsAppAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeAppAttributesResponseBodyAppsAppAttribute setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppAttributesResponseBodyAppsAppAttribute setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppAttributesResponseBodyAppsAppAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeAppAttributesResponseBodyAppsAppAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppAttributesResponseBodyAppsAppAttribute setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public DescribeAppAttributesResponseBodyAppsAppAttribute setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeAppAttributesResponseBodyAppsAppAttribute setTags(DescribeAppAttributesResponseBodyAppsAppAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeAppAttributesResponseBodyAppsAppAttributeTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeAppAttributesResponseBodyApps extends TeaModel {
        @NameInMap("AppAttribute")
        public java.util.List<DescribeAppAttributesResponseBodyAppsAppAttribute> appAttribute;

        public static DescribeAppAttributesResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAttributesResponseBodyApps self = new DescribeAppAttributesResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public DescribeAppAttributesResponseBodyApps setAppAttribute(java.util.List<DescribeAppAttributesResponseBodyAppsAppAttribute> appAttribute) {
            this.appAttribute = appAttribute;
            return this;
        }
        public java.util.List<DescribeAppAttributesResponseBodyAppsAppAttribute> getAppAttribute() {
            return this.appAttribute;
        }

    }

}
