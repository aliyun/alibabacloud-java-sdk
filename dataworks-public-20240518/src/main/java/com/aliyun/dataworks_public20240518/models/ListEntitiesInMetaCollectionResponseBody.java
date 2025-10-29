// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListEntitiesInMetaCollectionResponseBody extends TeaModel {
    /**
     * <p>The pagination result.</p>
     */
    @NameInMap("PagingInfo")
    public ListEntitiesInMetaCollectionResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F05080B0-CCE6-5D22-B284-34A51C5D4E28</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEntitiesInMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesInMetaCollectionResponseBody self = new ListEntitiesInMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEntitiesInMetaCollectionResponseBody setPagingInfo(ListEntitiesInMetaCollectionResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListEntitiesInMetaCollectionResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListEntitiesInMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities extends TeaModel {
        /**
         * <p>The entity comment.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The creation time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1737078994080</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description specified when the entity was added to the collection. Valid only for albums.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the entity. Currently, only the Table type is supported. If the entity is deleted, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>dlf-table:123456789:test_catalog:test_database::test_table</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The last modified time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1737078994080</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The entity name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>dlf-table</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities self = new ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities();
            return TeaModel.build(map, self);
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListEntitiesInMetaCollectionResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of entities in the collection.</p>
         */
        @NameInMap("Entities")
        public java.util.List<ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities> entities;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListEntitiesInMetaCollectionResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesInMetaCollectionResponseBodyPagingInfo self = new ListEntitiesInMetaCollectionResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfo setEntities(java.util.List<ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities> getEntities() {
            return this.entities;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEntitiesInMetaCollectionResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
