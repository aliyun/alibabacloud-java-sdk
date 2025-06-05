// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionEntitiesResponseBody extends TeaModel {
    @NameInMap("Entities")
    public ListRecognitionEntitiesResponseBodyEntities entities;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRecognitionEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionEntitiesResponseBody self = new ListRecognitionEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecognitionEntitiesResponseBody setEntities(ListRecognitionEntitiesResponseBodyEntities entities) {
        this.entities = entities;
        return this;
    }
    public ListRecognitionEntitiesResponseBodyEntities getEntities() {
        return this.entities;
    }

    public ListRecognitionEntitiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecognitionEntitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecognitionEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecognitionEntitiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecognitionEntitiesResponseBodyEntitiesEntity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>**<strong><strong><strong><strong><strong><strong>544cb84754</strong></strong></strong></strong></strong></strong></p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("EntityInfo")
        public String entityInfo;

        @NameInMap("EntityName")
        public String entityName;

        public static ListRecognitionEntitiesResponseBodyEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            ListRecognitionEntitiesResponseBodyEntitiesEntity self = new ListRecognitionEntitiesResponseBodyEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public ListRecognitionEntitiesResponseBodyEntitiesEntity setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListRecognitionEntitiesResponseBodyEntitiesEntity setEntityInfo(String entityInfo) {
            this.entityInfo = entityInfo;
            return this;
        }
        public String getEntityInfo() {
            return this.entityInfo;
        }

        public ListRecognitionEntitiesResponseBodyEntitiesEntity setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

    }

    public static class ListRecognitionEntitiesResponseBodyEntities extends TeaModel {
        @NameInMap("Entity")
        public java.util.List<ListRecognitionEntitiesResponseBodyEntitiesEntity> entity;

        public static ListRecognitionEntitiesResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            ListRecognitionEntitiesResponseBodyEntities self = new ListRecognitionEntitiesResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public ListRecognitionEntitiesResponseBodyEntities setEntity(java.util.List<ListRecognitionEntitiesResponseBodyEntitiesEntity> entity) {
            this.entity = entity;
            return this;
        }
        public java.util.List<ListRecognitionEntitiesResponseBodyEntitiesEntity> getEntity() {
            return this.entity;
        }

    }

}
