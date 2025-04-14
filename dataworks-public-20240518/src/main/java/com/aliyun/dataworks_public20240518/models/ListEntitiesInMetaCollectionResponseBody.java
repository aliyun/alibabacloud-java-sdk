// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListEntitiesInMetaCollectionResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListEntitiesInMetaCollectionResponseBodyPagingInfo pagingInfo;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1737078994080</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>dlf-table:123456789:test_catalog:test_database::test_table</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1737078994080</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("Entities")
        public java.util.List<ListEntitiesInMetaCollectionResponseBodyPagingInfoEntities> entities;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
