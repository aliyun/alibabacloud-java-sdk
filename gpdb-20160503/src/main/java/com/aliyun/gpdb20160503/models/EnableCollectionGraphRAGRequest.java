// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class EnableCollectionGraphRAGRequest extends TeaModel {
    /**
     * <p>The name of the document collection.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation to create a document collection and call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query a list of document collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The list of entity types.</p>
     * <blockquote>
     * <p>If the knowledge graph construction is enabled, this parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityTypes")
    public java.util.List<String> entityTypes;

    /**
     * <p>The name of the LLM model.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * </blockquote>
     * <ul>
     * <li><p>knowledge-extract-standard: the default value.</p>
     * </li>
     * <li><p>knowledge-extract-mini</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the knowledge graph construction is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>knowledge-extract-standard</p>
     */
    @NameInMap("LLMModel")
    public String LLMModel;

    /**
     * <p>The language used to build the knowledge graph. Valid values:</p>
     * <ul>
     * <li>Simplified Chinese. The default value.</li>
     * <li>English.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the knowledge graph construction is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Simplified Chinese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the privileged database account that has the rds_superuser permission.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation to create an account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testaccount</p>
     */
    @NameInMap("ManagerAccount")
    public String managerAccount;

    /**
     * <p>The password for the privileged database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("ManagerAccountPassword")
    public String managerAccountPassword;

    /**
     * <p>The name of the namespace. Default value: public.</p>
     * <blockquote>
     * <p>You can call the CreateNamespace operation to create a namespace and call the ListNamespaces operation to query a list of namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password of the namespace.</p>
     * <blockquote>
     * <p>The value of this parameter is specified by <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
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
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of relationship edge types.</p>
     * <blockquote>
     * <p>If the knowledge graph construction is enabled, this parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RelationshipTypes")
    public java.util.List<String> relationshipTypes;

    public static EnableCollectionGraphRAGRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCollectionGraphRAGRequest self = new EnableCollectionGraphRAGRequest();
        return TeaModel.build(map, self);
    }

    public EnableCollectionGraphRAGRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public EnableCollectionGraphRAGRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public EnableCollectionGraphRAGRequest setEntityTypes(java.util.List<String> entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    public EnableCollectionGraphRAGRequest setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
        return this;
    }
    public String getLLMModel() {
        return this.LLMModel;
    }

    public EnableCollectionGraphRAGRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public EnableCollectionGraphRAGRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public EnableCollectionGraphRAGRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public EnableCollectionGraphRAGRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public EnableCollectionGraphRAGRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public EnableCollectionGraphRAGRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableCollectionGraphRAGRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableCollectionGraphRAGRequest setRelationshipTypes(java.util.List<String> relationshipTypes) {
        this.relationshipTypes = relationshipTypes;
        return this;
    }
    public java.util.List<String> getRelationshipTypes() {
        return this.relationshipTypes;
    }

}
