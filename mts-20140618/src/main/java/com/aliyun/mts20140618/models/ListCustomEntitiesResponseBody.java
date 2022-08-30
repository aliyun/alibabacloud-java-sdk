// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomEntitiesResponseBody extends TeaModel {
    @NameInMap("CustomEntities")
    public ListCustomEntitiesResponseBodyCustomEntities customEntities;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCustomEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomEntitiesResponseBody self = new ListCustomEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomEntitiesResponseBody setCustomEntities(ListCustomEntitiesResponseBodyCustomEntities customEntities) {
        this.customEntities = customEntities;
        return this;
    }
    public ListCustomEntitiesResponseBodyCustomEntities getCustomEntities() {
        return this.customEntities;
    }

    public ListCustomEntitiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomEntitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomEntitiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity extends TeaModel {
        @NameInMap("CustomEntityId")
        public String customEntityId;

        @NameInMap("CustomEntityInfo")
        public String customEntityInfo;

        @NameInMap("CustomEntityName")
        public String customEntityName;

        public static ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity build(java.util.Map<String, ?> map) throws Exception {
            ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity self = new ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity();
            return TeaModel.build(map, self);
        }

        public ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity setCustomEntityId(String customEntityId) {
            this.customEntityId = customEntityId;
            return this;
        }
        public String getCustomEntityId() {
            return this.customEntityId;
        }

        public ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity setCustomEntityInfo(String customEntityInfo) {
            this.customEntityInfo = customEntityInfo;
            return this;
        }
        public String getCustomEntityInfo() {
            return this.customEntityInfo;
        }

        public ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity setCustomEntityName(String customEntityName) {
            this.customEntityName = customEntityName;
            return this;
        }
        public String getCustomEntityName() {
            return this.customEntityName;
        }

    }

    public static class ListCustomEntitiesResponseBodyCustomEntities extends TeaModel {
        @NameInMap("CustomEntity")
        public java.util.List<ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity> customEntity;

        public static ListCustomEntitiesResponseBodyCustomEntities build(java.util.Map<String, ?> map) throws Exception {
            ListCustomEntitiesResponseBodyCustomEntities self = new ListCustomEntitiesResponseBodyCustomEntities();
            return TeaModel.build(map, self);
        }

        public ListCustomEntitiesResponseBodyCustomEntities setCustomEntity(java.util.List<ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity> customEntity) {
            this.customEntity = customEntity;
            return this;
        }
        public java.util.List<ListCustomEntitiesResponseBodyCustomEntitiesCustomEntity> getCustomEntity() {
            return this.customEntity;
        }

    }

}
