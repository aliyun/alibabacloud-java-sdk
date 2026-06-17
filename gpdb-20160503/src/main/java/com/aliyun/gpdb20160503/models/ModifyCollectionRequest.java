// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyCollectionRequest extends TeaModel {
    /**
     * <p>The collection name.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to list all collections.</p>
     * </blockquote>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details for all AnalyticDB for PostgreSQL instances in a region, including their instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A JSON string that specifies the operations to add or modify metadata fields. For the required format, see the example.</p>
     * <p>Use this parameter to add new metadata fields, rename existing metadata fields, or perform implicit data type conversion on existing fields.</p>
     * <p>Details:</p>
     * <p>To add a new metadata field, set <code>operations[*].operator = add</code>. Then, use <code>operations[*].newMetaName</code> to specify the field\&quot;s name, <code>operations[*].newMetaType</code> for its data type, and <code>operations[*].fullTextRetrieval</code> to enable full-text retrieval for it.</p>
     * <p>To modify an existing metadata field, set <code>operations[*].operator = replace</code>. You must specify the current field name in <code>operations[*].oldMetaName</code>. To rename the field, provide the new name in <code>operations[*].newMetaName</code>. To change its data type, provide the new type in <code>operations[*].newMetaType</code>.</p>
     * <blockquote>
     * <ul>
     * <li><p>For a list of supported data types, see <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a>. The money data type is not supported.</p>
     * </li>
     * <li><p>Full-text retrieval can be enabled for a field only during an <code>add</code> operation, not a <code>replace</code> operation.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>The field names <code>id</code>, <code>vector</code>, <code>to_tsvector</code>, and <code>source</code> are reserved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;operations&quot;:[
     * {&quot;operator&quot;:&quot;add&quot;,&quot;newMetaType&quot;:&quot;int&quot;,&quot;newMetaName&quot;:&quot;ext1&quot;,&quot;fullTextRetrieval&quot;:true},
     * {&quot;operator&quot;:&quot;replace&quot;,&quot;oldMetaName&quot;:&quot;ext2&quot;,&quot;newMetaName&quot;:&quot;ext3&quot;},
     * {&quot;operator&quot;:&quot;replace&quot;,&quot;newMetaType&quot;:&quot;bigint&quot;,&quot;oldMetaName&quot;:&quot;ext4&quot;},
     * {&quot;operator&quot;:&quot;replace&quot;,&quot;newMetaType&quot;:&quot;int&quot;,&quot;oldMetaName&quot;:&quot;ext5&quot;,&quot;newMetaName&quot;:&quot;ext6&quot;}
     * ]}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The namespace. The default value is <code>public</code>.</p>
     * <blockquote>
     * <p>You can call the CreateNamespace operation to create a namespace and the ListNamespaces operation to list existing namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password for the namespace.</p>
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
     * <p>The ID of the workspace that contains multiple database instances. You must specify either this parameter or <code>DBInstanceId</code>. If you specify both, this parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ModifyCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollectionRequest self = new ModifyCollectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCollectionRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public ModifyCollectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyCollectionRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public ModifyCollectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyCollectionRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public ModifyCollectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCollectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCollectionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
