// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyCollectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
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
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
