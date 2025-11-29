// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertChunksRequest extends TeaModel {
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
    public java.util.List<UpsertChunksRequestTextChunks> textChunks;

    public static UpsertChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertChunksRequest self = new UpsertChunksRequest();
        return TeaModel.build(map, self);
    }

    public UpsertChunksRequest setAllowInsertWithFilter(Boolean allowInsertWithFilter) {
        this.allowInsertWithFilter = allowInsertWithFilter;
        return this;
    }
    public Boolean getAllowInsertWithFilter() {
        return this.allowInsertWithFilter;
    }

    public UpsertChunksRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UpsertChunksRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpsertChunksRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpsertChunksRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpsertChunksRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UpsertChunksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpsertChunksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpsertChunksRequest setShouldReplaceFile(Boolean shouldReplaceFile) {
        this.shouldReplaceFile = shouldReplaceFile;
        return this;
    }
    public Boolean getShouldReplaceFile() {
        return this.shouldReplaceFile;
    }

    public UpsertChunksRequest setTextChunks(java.util.List<UpsertChunksRequestTextChunks> textChunks) {
        this.textChunks = textChunks;
        return this;
    }
    public java.util.List<UpsertChunksRequestTextChunks> getTextChunks() {
        return this.textChunks;
    }

    public static class UpsertChunksRequestTextChunks extends TeaModel {
        /**
         * <p>The content of the document.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud-native data warehouse AnalyticDB PostgreSQL Edition provides a simple, fast, and cost-effective PB-level cloud data warehouse solution.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The condition that is used to filter the data to be updated. Specify this parameter in a format that is the same as the WHERE clause.</p>
         * 
         * <strong>example:</strong>
         * <p>title = \&quot;seagull\&quot;</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>The unique ID of the vector data.</p>
         * 
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        public static UpsertChunksRequestTextChunks build(java.util.Map<String, ?> map) throws Exception {
            UpsertChunksRequestTextChunks self = new UpsertChunksRequestTextChunks();
            return TeaModel.build(map, self);
        }

        public UpsertChunksRequestTextChunks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpsertChunksRequestTextChunks setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public UpsertChunksRequestTextChunks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpsertChunksRequestTextChunks setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

    }

}
