// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetTagsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataAssetTagsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataAssetTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetTagsResponseBody self = new ListDataAssetTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAssetTagsResponseBody setPagingInfo(ListDataAssetTagsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataAssetTagsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataAssetTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataAssetTagsResponseBodyPagingInfoDataAssetTags extends TeaModel {
        /**
         * <p>The type of the tag.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>System</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the tag was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1735890003000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag administrators.</p>
         */
        @NameInMap("Managers")
        public java.util.List<String> managers;

        /**
         * <p>The time when the tag was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1735890003000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user who last modified the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The type of the tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        /**
         * <p>The tag values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListDataAssetTagsResponseBodyPagingInfoDataAssetTags build(java.util.Map<String, ?> map) throws Exception {
            ListDataAssetTagsResponseBodyPagingInfoDataAssetTags self = new ListDataAssetTagsResponseBodyPagingInfoDataAssetTags();
            return TeaModel.build(map, self);
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setManagers(java.util.List<String> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<String> getManagers() {
            return this.managers;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public ListDataAssetTagsResponseBodyPagingInfoDataAssetTags setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListDataAssetTagsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The tags.</p>
         */
        @NameInMap("DataAssetTags")
        public java.util.List<ListDataAssetTagsResponseBodyPagingInfoDataAssetTags> dataAssetTags;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2524</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataAssetTagsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataAssetTagsResponseBodyPagingInfo self = new ListDataAssetTagsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataAssetTagsResponseBodyPagingInfo setDataAssetTags(java.util.List<ListDataAssetTagsResponseBodyPagingInfoDataAssetTags> dataAssetTags) {
            this.dataAssetTags = dataAssetTags;
            return this;
        }
        public java.util.List<ListDataAssetTagsResponseBodyPagingInfoDataAssetTags> getDataAssetTags() {
            return this.dataAssetTags;
        }

        public ListDataAssetTagsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataAssetTagsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataAssetTagsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
