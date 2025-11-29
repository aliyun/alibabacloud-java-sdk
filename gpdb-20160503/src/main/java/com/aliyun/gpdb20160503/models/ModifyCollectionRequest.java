// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyCollectionRequest extends TeaModel {
    /**
     * <p>The name of the collection.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to query a list of collections.</p>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The metadata of the addition or modification operation, which is in the JSON string format.</p>
     * <p>You can specify this parameter to add a metadata definition, or rename an existing metadata definition and perform implicit type conversion.</p>
     * <p>If you specify <code>operations[*].operator = add</code> to add a metadata definition, <code>operations[*].newMetaName</code> specifies the name of the metadata definition, and <code>operations[*].newMetaType</code> specifies the data type of the metadata definition.</p>
     * <p>If you specify <code>operations[*].operator = replace</code> to modify an existing metadata definition, <code>operations[*].oldMetaName</code> specifies the current name of the metadata definition, <code>operations[*].newMetaName</code> specifies the new name of the metadata definition, and <code>operations[*].newMetaType</code> specifies the new data type of the metadata definition. If you only want to rename the metadata definition, you do not need to specify the <code>operations[*].newMetaType</code> field. If you only want to perform implicit type conversion, you do not need to specify the <code>operations[*].newMetaName</code> field.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>For information about the supported data types, see <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a>.</p>
     * </li>
     * <li><p>The money data type is not supported.</p>
     * </li>
     * </ul>
     * <p>**</p>
     * <p><strong>Warning</strong>Reserved fields such as id, vector, to_tsvector, and source cannot be used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;operations&quot;:[
     * {&quot;operator&quot;:&quot;add&quot;,&quot;newMetaType&quot;:&quot;int&quot;,&quot;newMetaName&quot;:&quot;ext1&quot;},
     * {&quot;operator&quot;:&quot;replace&quot;,&quot;oldMetaName&quot;:&quot;ext2&quot;,&quot;newMetaName&quot;:&quot;ext3&quot;},
     * {&quot;operator&quot;:&quot;replace&quot;,&quot;newMetaType&quot;:&quot;bigint&quot;,&quot;oldMetaName&quot;:&quot;ext4&quot;},
     * {&quot;operator&quot;:&quot;replace&quot;,&quot;newMetaType&quot;:&quot;int&quot;,&quot;oldMetaName&quot;:&quot;ext5&quot;,&quot;newMetaName&quot;:&quot;ext6&quot;}
     * ]}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The name of the namespace. Default value: public.</p>
     * <blockquote>
     * <p> You can call the CreateNamespace operation to create a namespace and call the ListNamespaces operation to query a list of namespaces.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the workspace that consists of multiple AnalyticDB for PostgreSQL instances. You must specify one of the WorkspaceId and DBInstanceId parameters. If you specify both parameters, the WorkspaceId parameter takes precedence.</p>
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
