// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaCollectionResponseBody extends TeaModel {
    @NameInMap("MetaCollection")
    public GetMetaCollectionResponseBodyMetaCollection metaCollection;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("Administrators")
        public java.util.List<Long> administrators;

        /**
         * <strong>example:</strong>
         * <p>1668568601000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>456789</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>category.123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1668568601000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test_category</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>category.12</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
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
