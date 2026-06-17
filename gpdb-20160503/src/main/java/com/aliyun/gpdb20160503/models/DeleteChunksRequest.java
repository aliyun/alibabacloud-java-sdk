// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteChunksRequest extends TeaModel {
    /**
     * <p>A list of chunk IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChunkIds")
    public java.util.List<String> chunkIds;

    /**
     * <p>The name of the document collection.</p>
     * <blockquote>
     * <p>You create this document collection by calling the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. To view existing document collections, call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testcollection</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to view details for all AnalyticDB for PostgreSQL instances in a specific region, including their instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the namespace. The default value is public.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to view a list of namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password for the namespace.</p>
     * <blockquote>
     * <p>This password is set when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChunksRequest self = new DeleteChunksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChunksRequest setChunkIds(java.util.List<String> chunkIds) {
        this.chunkIds = chunkIds;
        return this;
    }
    public java.util.List<String> getChunkIds() {
        return this.chunkIds;
    }

    public DeleteChunksRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public DeleteChunksRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteChunksRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteChunksRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public DeleteChunksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
