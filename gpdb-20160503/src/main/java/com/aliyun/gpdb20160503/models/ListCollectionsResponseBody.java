// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListCollectionsResponseBody extends TeaModel {
    @NameInMap("Collections")
    public ListCollectionsResponseBodyCollections collections;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static ListCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionsResponseBody self = new ListCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollectionsResponseBody setCollections(ListCollectionsResponseBodyCollections collections) {
        this.collections = collections;
        return this;
    }
    public ListCollectionsResponseBodyCollections getCollections() {
        return this.collections;
    }

    public ListCollectionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListCollectionsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListCollectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCollectionsResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListCollectionsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCollectionsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListCollectionsResponseBodyCollections extends TeaModel {
        @NameInMap("Collection")
        public java.util.List<String> collection;

        public static ListCollectionsResponseBodyCollections build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionsResponseBodyCollections self = new ListCollectionsResponseBodyCollections();
            return TeaModel.build(map, self);
        }

        public ListCollectionsResponseBodyCollections setCollection(java.util.List<String> collection) {
            this.collection = collection;
            return this;
        }
        public java.util.List<String> getCollection() {
            return this.collection;
        }

    }

}
