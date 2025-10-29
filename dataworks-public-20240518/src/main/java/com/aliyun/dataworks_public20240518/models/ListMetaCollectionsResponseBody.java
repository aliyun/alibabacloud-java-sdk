// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaCollectionsResponseBody extends TeaModel {
    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("Data")
    public ListMetaCollectionsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E25887B7-579C-54A5-9C4F-83A0DE367DDE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMetaCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCollectionsResponseBody self = new ListMetaCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaCollectionsResponseBody setData(ListMetaCollectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMetaCollectionsResponseBodyData getData() {
        return this.data;
    }

    public ListMetaCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMetaCollectionsResponseBodyDataMetaCollections extends TeaModel {
        /**
         * <p>The list of administrator IDs. Supported only for album types. Administrators must be users within the same tenant. Multiple administrators can be specified.</p>
         */
        @NameInMap("Administrators")
        public java.util.List<String> administrators;

        /**
         * <p>The creation time in milliseconds (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1668568601000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>456789</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The collection description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The collection name.</p>
         * 
         * <strong>example:</strong>
         * <p>category.123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The modification time in milliseconds (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1668568601000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The collection name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_category</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent collection. Can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>category.1</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The collection type. Valid values:</p>
         * <ul>
         * <li>Category</li>
         * <li>Album</li>
         * <li>AlbumCategory: Album subcategory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Category</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListMetaCollectionsResponseBodyDataMetaCollections build(java.util.Map<String, ?> map) throws Exception {
            ListMetaCollectionsResponseBodyDataMetaCollections self = new ListMetaCollectionsResponseBodyDataMetaCollections();
            return TeaModel.build(map, self);
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setAdministrators(java.util.List<String> administrators) {
            this.administrators = administrators;
            return this;
        }
        public java.util.List<String> getAdministrators() {
            return this.administrators;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListMetaCollectionsResponseBodyDataMetaCollections setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMetaCollectionsResponseBodyData extends TeaModel {
        /**
         * <p>The list of collections.</p>
         */
        @NameInMap("MetaCollections")
        public java.util.List<ListMetaCollectionsResponseBodyDataMetaCollections> metaCollections;

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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMetaCollectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaCollectionsResponseBodyData self = new ListMetaCollectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaCollectionsResponseBodyData setMetaCollections(java.util.List<ListMetaCollectionsResponseBodyDataMetaCollections> metaCollections) {
            this.metaCollections = metaCollections;
            return this;
        }
        public java.util.List<ListMetaCollectionsResponseBodyDataMetaCollections> getMetaCollections() {
            return this.metaCollections;
        }

        public ListMetaCollectionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMetaCollectionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMetaCollectionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
