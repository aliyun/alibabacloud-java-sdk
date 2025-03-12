// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertCollectionDataRequest extends TeaModel {
    /**
     * <p>The name of the collection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the namespace. Default value: public.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Rows")
    public java.util.List<UpsertCollectionDataRequestRows> rows;

    /**
     * <p>The ID of the workspace that consists of multiple AnalyticDB for PostgreSQL instances. You must specify one of the WorkspaceId and DBInstanceId parameters. If you specify both parameters, the WorkspaceId parameter takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

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

    public UpsertCollectionDataRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpsertCollectionDataRequestRowsSparseVector extends TeaModel {
        @NameInMap("Indices")
        public java.util.List<Long> indices;

        @NameInMap("Values")
        public java.util.List<Double> values;

        public static UpsertCollectionDataRequestRowsSparseVector build(java.util.Map<String, ?> map) throws Exception {
            UpsertCollectionDataRequestRowsSparseVector self = new UpsertCollectionDataRequestRowsSparseVector();
            return TeaModel.build(map, self);
        }

        public UpsertCollectionDataRequestRowsSparseVector setIndices(java.util.List<Long> indices) {
            this.indices = indices;
            return this;
        }
        public java.util.List<Long> getIndices() {
            return this.indices;
        }

        public UpsertCollectionDataRequestRowsSparseVector setValues(java.util.List<Double> values) {
            this.values = values;
            return this;
        }
        public java.util.List<Double> getValues() {
            return this.values;
        }

    }

    public static class UpsertCollectionDataRequestRows extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Metadata")
        public java.util.Map<String, String> metadata;

        @NameInMap("SparseVector")
        public UpsertCollectionDataRequestRowsSparseVector sparseVector;

        /**
         * <p>This parameter is required.</p>
         */
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

        public UpsertCollectionDataRequestRows setSparseVector(UpsertCollectionDataRequestRowsSparseVector sparseVector) {
            this.sparseVector = sparseVector;
            return this;
        }
        public UpsertCollectionDataRequestRowsSparseVector getSparseVector() {
            return this.sparseVector;
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
