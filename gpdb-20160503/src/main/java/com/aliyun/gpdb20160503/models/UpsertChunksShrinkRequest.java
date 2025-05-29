// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertChunksShrinkRequest extends TeaModel {
    /**
     * <p>Document collection name.</p>
     * <blockquote>
     * <p>Created by the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> API. You can use the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> API to view the already created document collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>Instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>File name.</p>
     * <blockquote>
     * <p>If a file name is specified and not empty, it will overwrite the data for this file name; if empty, the chunks data will be appended directly to the document collection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mydoc.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>Namespace, default is public.</p>
     * <blockquote>
     * <p>You can create it using the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> API and view the list using the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Password corresponding to the namespace.</p>
     * <blockquote>
     * <p>This value is specified by the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> API.</p>
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
     * <p>Region ID where the instance is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShouldReplaceFile")
    public Boolean shouldReplaceFile;

    /**
     * <p>List of split documents.</p>
     */
    @NameInMap("TextChunks")
    public String textChunksShrink;

    public static UpsertChunksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertChunksShrinkRequest self = new UpsertChunksShrinkRequest();
        return TeaModel.build(map, self);
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
