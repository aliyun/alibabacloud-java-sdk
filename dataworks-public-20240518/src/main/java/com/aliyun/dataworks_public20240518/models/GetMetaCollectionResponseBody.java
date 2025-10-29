// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaCollectionResponseBody extends TeaModel {
    /**
     * <p>The collection details.</p>
     */
    @NameInMap("MetaCollection")
    public GetMetaCollectionResponseBodyMetaCollection metaCollection;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCollectionResponseBody self = new GetMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaCollectionResponseBody setMetaCollection(GetMetaCollectionResponseBodyMetaCollection metaCollection) {
        this.metaCollection = metaCollection;
        return this;
    }
    public GetMetaCollectionResponseBodyMetaCollection getMetaCollection() {
        return this.metaCollection;
    }

    public GetMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaCollectionResponseBodyMetaCollection extends TeaModel {
        /**
         * <p>The list of administrator IDs. Valid only for the album type. The IDs must belong to users in the same tenant. Multiple IDs can be specified.</p>
         */
        @NameInMap("Administrators")
        public java.util.List<Long> administrators;

        /**
         * <p>The creation time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1668568601000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>456789</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The collection description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The collection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>category.123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The last modified time in milliseconds.</p>
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
         * <p>The parent collection ID. This parameter can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>category.12</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The collection type. Valid values:</p>
         * <ul>
         * <li>Category</li>
         * <li>Album</li>
         * <li>AlbumCategory: Album subcategory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Category</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMetaCollectionResponseBodyMetaCollection build(java.util.Map<String, ?> map) throws Exception {
            GetMetaCollectionResponseBodyMetaCollection self = new GetMetaCollectionResponseBodyMetaCollection();
            return TeaModel.build(map, self);
        }

        public GetMetaCollectionResponseBodyMetaCollection setAdministrators(java.util.List<Long> administrators) {
            this.administrators = administrators;
            return this;
        }
        public java.util.List<Long> getAdministrators() {
            return this.administrators;
        }

        public GetMetaCollectionResponseBodyMetaCollection setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaCollectionResponseBodyMetaCollection setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetMetaCollectionResponseBodyMetaCollection setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetaCollectionResponseBodyMetaCollection setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMetaCollectionResponseBodyMetaCollection setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetMetaCollectionResponseBodyMetaCollection setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaCollectionResponseBodyMetaCollection setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetMetaCollectionResponseBodyMetaCollection setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
