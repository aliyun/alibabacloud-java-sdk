// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class AddDocumentsResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;1234567890123456&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;1234567890123456&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;AuthAction&quot;:&quot;milvusknowledgebase:ListDatasets&quot;}</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public AddDocumentsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DDDBE0E5-4314-156F-B7F1-C4BCFD25A509</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static AddDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDocumentsResponseBody self = new AddDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDocumentsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddDocumentsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddDocumentsResponseBody setData(AddDocumentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDocumentsResponseBodyData getData() {
        return this.data;
    }

    public AddDocumentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddDocumentsResponseBodyDataDocuments extends TeaModel {
        /**
         * <p>The chunk count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("chunkCount")
        public Integer chunkCount;

        /**
         * <p>The chunk method.</p>
         * 
         * <strong>example:</strong>
         * <p>naive</p>
         */
        @NameInMap("chunkMethod")
        public String chunkMethod;

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-123</p>
         */
        @NameInMap("datasetId")
        public String datasetId;

        /**
         * <p>The document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-123</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The object path.</p>
         * 
         * <strong>example:</strong>
         * <p>uploaded/doc-id/example.pdf</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <p>The document name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The processing progress.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("progress")
        public Float progress;

        /**
         * <p>The processing status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("run")
        public String run;

        /**
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The file extension.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("suffix")
        public String suffix;

        /**
         * <p>The thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("thumbnail")
        public String thumbnail;

        /**
         * <p>The token count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("tokenCount")
        public Integer tokenCount;

        public static AddDocumentsResponseBodyDataDocuments build(java.util.Map<String, ?> map) throws Exception {
            AddDocumentsResponseBodyDataDocuments self = new AddDocumentsResponseBodyDataDocuments();
            return TeaModel.build(map, self);
        }

        public AddDocumentsResponseBodyDataDocuments setChunkCount(Integer chunkCount) {
            this.chunkCount = chunkCount;
            return this;
        }
        public Integer getChunkCount() {
            return this.chunkCount;
        }

        public AddDocumentsResponseBodyDataDocuments setChunkMethod(String chunkMethod) {
            this.chunkMethod = chunkMethod;
            return this;
        }
        public String getChunkMethod() {
            return this.chunkMethod;
        }

        public AddDocumentsResponseBodyDataDocuments setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public AddDocumentsResponseBodyDataDocuments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddDocumentsResponseBodyDataDocuments setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public AddDocumentsResponseBodyDataDocuments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddDocumentsResponseBodyDataDocuments setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public AddDocumentsResponseBodyDataDocuments setRun(String run) {
            this.run = run;
            return this;
        }
        public String getRun() {
            return this.run;
        }

        public AddDocumentsResponseBodyDataDocuments setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public AddDocumentsResponseBodyDataDocuments setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public AddDocumentsResponseBodyDataDocuments setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public AddDocumentsResponseBodyDataDocuments setTokenCount(Integer tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Integer getTokenCount() {
            return this.tokenCount;
        }

    }

    public static class AddDocumentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of documents.</p>
         */
        @NameInMap("documents")
        public java.util.List<AddDocumentsResponseBodyDataDocuments> documents;

        /**
         * <p>The list of errors.</p>
         */
        @NameInMap("errors")
        public java.util.List<String> errors;

        public static AddDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDocumentsResponseBodyData self = new AddDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDocumentsResponseBodyData setDocuments(java.util.List<AddDocumentsResponseBodyDataDocuments> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<AddDocumentsResponseBodyDataDocuments> getDocuments() {
            return this.documents;
        }

        public AddDocumentsResponseBodyData setErrors(java.util.List<String> errors) {
            this.errors = errors;
            return this;
        }
        public java.util.List<String> getErrors() {
            return this.errors;
        }

    }

}
