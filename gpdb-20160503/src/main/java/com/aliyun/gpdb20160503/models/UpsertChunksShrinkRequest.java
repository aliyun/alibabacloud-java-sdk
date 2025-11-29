// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertChunksShrinkRequest extends TeaModel {
    /**
     * <p>Based on the Filter input specified under TextChunks, this parameter controls whether data insertion is allowed when a Filter is provided.</p>
     * <p>If AllowInsertWithFilter = true, the insert operation is performed when the filter does not match any data.</p>
     * <p>If AllowInsertWithFilter = false, no action is performed if the filter does not match any data.</p>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowInsertWithFilter")
    public Boolean allowInsertWithFilter;

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
     * <p>The file name of the document.</p>
     * <blockquote>
     * <p>When a non-empty filename is specified, the system will decide whether to overwrite the data associated with that filename based on the value of the ShouldReplaceFile parameter. If you leave this parameter empty, the data of chunks is appended to the document collection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mydoc.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The name of the namespace. Default value: public.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
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
     * <p>The value of this parameter is specified when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to overwrite the data associated with the file name specified by the FileName parameter.</p>
     * <p>If you set ShouldReplaceFile to true, the system deletes all data associated with the file name and then inserts new data.</p>
     * <p>If you set ShouldReplaceFile to false, the system does not delete the data associated with the file name, but inserts or updates the data of chunks based on the TextChunks parameter.</p>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShouldReplaceFile")
    public Boolean shouldReplaceFile;

    /**
     * <p>List of document chunks after splitting.</p>
     */
    @NameInMap("TextChunks")
    public String textChunksShrink;

    public static UpsertChunksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertChunksShrinkRequest self = new UpsertChunksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpsertChunksShrinkRequest setAllowInsertWithFilter(Boolean allowInsertWithFilter) {
        this.allowInsertWithFilter = allowInsertWithFilter;
        return this;
    }
    public Boolean getAllowInsertWithFilter() {
        return this.allowInsertWithFilter;
    }

    public UpsertChunksShrinkRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UpsertChunksShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpsertChunksShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpsertChunksShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpsertChunksShrinkRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UpsertChunksShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpsertChunksShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpsertChunksShrinkRequest setShouldReplaceFile(Boolean shouldReplaceFile) {
        this.shouldReplaceFile = shouldReplaceFile;
        return this;
    }
    public Boolean getShouldReplaceFile() {
        return this.shouldReplaceFile;
    }

    public UpsertChunksShrinkRequest setTextChunksShrink(String textChunksShrink) {
        this.textChunksShrink = textChunksShrink;
        return this;
    }
    public String getTextChunksShrink() {
        return this.textChunksShrink;
    }

}
