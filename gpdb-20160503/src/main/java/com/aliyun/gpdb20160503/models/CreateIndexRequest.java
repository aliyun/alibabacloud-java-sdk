// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The collection name.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to query the list.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The index parameters. If this parameter is not specified, a B-tree index is created by default.</p>
     * <blockquote>
     * <ul>
     * <li>b-tree: The fillFactor parameter. Valid values: 10 to 100. Default value: 90.</li>
     * <li>gin: The fastUpdate parameter. Valid values: true and false. Default value: true.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;b-tree&quot;:{&quot;fillFactor&quot;:90}} or {&quot;gin&quot;:{&quot;fastUpdate&quot;:false}}</p>
     */
    @NameInMap("IndexConfig")
    public String indexConfig;

    /**
     * <p>The index field. Only a single field is supported, and the field must be a key defined in Metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("IndexField")
    public String indexField;

    /**
     * <p>The index name.</p>
     * 
     * <strong>example:</strong>
     * <p>testindex</p>
     */
    @NameInMap("IndexName")
    public String indexName;

    /**
     * <p>The namespace.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query the list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password of the namespace.</p>
     * <blockquote>
     * <p>This value is specified by the CreateNamespace operation.</p>
     * </blockquote>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the workspace that consists of multiple database instances. This parameter and DBInstanceId cannot both be empty. If both this parameter and DBInstanceId are specified, this parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexRequest self = new CreateIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateIndexRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateIndexRequest setIndexConfig(String indexConfig) {
        this.indexConfig = indexConfig;
        return this;
    }
    public String getIndexConfig() {
        return this.indexConfig;
    }

    public CreateIndexRequest setIndexField(String indexField) {
        this.indexField = indexField;
        return this;
    }
    public String getIndexField() {
        return this.indexField;
    }

    public CreateIndexRequest setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public CreateIndexRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateIndexRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public CreateIndexRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIndexRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIndexRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
