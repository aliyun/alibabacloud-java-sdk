// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertCollectionDataRequest extends TeaModel {
    /**
     * <p>The name of the collection.</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](~~86911~~) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password of the namespace.</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Rows")
    public java.util.List<UpsertCollectionDataRequestRows> rows;

    public static UpsertCollectionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertCollectionDataRequest self = new UpsertCollectionDataRequest();
        return TeaModel.build(map, self);
    }

    public UpsertCollectionDataRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UpsertCollectionDataRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpsertCollectionDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpsertCollectionDataRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UpsertCollectionDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpsertCollectionDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpsertCollectionDataRequest setRows(java.util.List<UpsertCollectionDataRequestRows> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<UpsertCollectionDataRequestRows> getRows() {
        return this.rows;
    }

    public static class UpsertCollectionDataRequestRows extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Metadata")
        public java.util.Map<String, String> metadata;

        @NameInMap("Vector")
        public java.util.List<Double> vector;

        public static UpsertCollectionDataRequestRows build(java.util.Map<String, ?> map) throws Exception {
            UpsertCollectionDataRequestRows self = new UpsertCollectionDataRequestRows();
            return TeaModel.build(map, self);
        }

        public UpsertCollectionDataRequestRows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpsertCollectionDataRequestRows setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public UpsertCollectionDataRequestRows setVector(java.util.List<Double> vector) {
            this.vector = vector;
            return this;
        }
        public java.util.List<Double> getVector() {
            return this.vector;
        }

    }

}
