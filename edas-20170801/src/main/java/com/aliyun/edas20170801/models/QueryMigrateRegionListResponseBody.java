// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateRegionListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The namespaces.</p>
     */
    @NameInMap("RegionEntityList")
    public QueryMigrateRegionListResponseBodyRegionEntityList regionEntityList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMigrateRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMigrateRegionListResponseBody self = new QueryMigrateRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMigrateRegionListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryMigrateRegionListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMigrateRegionListResponseBody setRegionEntityList(QueryMigrateRegionListResponseBodyRegionEntityList regionEntityList) {
        this.regionEntityList = regionEntityList;
        return this;
    }
    public QueryMigrateRegionListResponseBodyRegionEntityList getRegionEntityList() {
        return this.regionEntityList;
    }

    public QueryMigrateRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity extends TeaModel {
        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity self = new QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity();
            return TeaModel.build(map, self);
        }

        public QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class QueryMigrateRegionListResponseBodyRegionEntityList extends TeaModel {
        @NameInMap("RegionEntity")
        public java.util.List<QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity> regionEntity;

        public static QueryMigrateRegionListResponseBodyRegionEntityList build(java.util.Map<String, ?> map) throws Exception {
            QueryMigrateRegionListResponseBodyRegionEntityList self = new QueryMigrateRegionListResponseBodyRegionEntityList();
            return TeaModel.build(map, self);
        }

        public QueryMigrateRegionListResponseBodyRegionEntityList setRegionEntity(java.util.List<QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity> regionEntity) {
            this.regionEntity = regionEntity;
            return this;
        }
        public java.util.List<QueryMigrateRegionListResponseBodyRegionEntityListRegionEntity> getRegionEntity() {
            return this.regionEntity;
        }

    }

}
