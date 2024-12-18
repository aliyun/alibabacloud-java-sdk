// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AddDatasetDocumentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <strong>example:</strong>
     * <p>数据集名称</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Document")
    public AddDatasetDocumentRequestDocument document;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddDatasetDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDatasetDocumentRequest self = new AddDatasetDocumentRequest();
        return TeaModel.build(map, self);
    }

    public AddDatasetDocumentRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public AddDatasetDocumentRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public AddDatasetDocumentRequest setDocument(AddDatasetDocumentRequestDocument document) {
        this.document = document;
        return this;
    }
    public AddDatasetDocumentRequestDocument getDocument() {
        return this.document;
    }

    public AddDatasetDocumentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AddDatasetDocumentRequestDocumentMultimodalMedias extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>图片或视频文件地址</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>多模态数据唯一标识</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>多模态数据类型</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static AddDatasetDocumentRequestDocumentMultimodalMedias build(java.util.Map<String, ?> map) throws Exception {
            AddDatasetDocumentRequestDocumentMultimodalMedias self = new AddDatasetDocumentRequestDocumentMultimodalMedias();
            return TeaModel.build(map, self);
        }

        public AddDatasetDocumentRequestDocumentMultimodalMedias setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public AddDatasetDocumentRequestDocumentMultimodalMedias setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public AddDatasetDocumentRequestDocumentMultimodalMedias setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class AddDatasetDocumentRequestDocument extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableHandleMultimodalMedia")
        public Boolean disableHandleMultimodalMedia;

        /**
         * <strong>example:</strong>
         * <p>业务文档唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>文档类型</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <strong>example:</strong>
         * <p>内部文档唯一ID</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>扩展字段1</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <strong>example:</strong>
         * <p>扩展字段2</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <strong>example:</strong>
         * <p>扩展字段3</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <strong>example:</strong>
         * <p>模型名称 todo 商业化 仅个别账号可传入</p>
         */
        @NameInMap("MultimodalIndexName")
        public String multimodalIndexName;

        @NameInMap("MultimodalMedias")
        public java.util.List<AddDatasetDocumentRequestDocumentMultimodalMedias> multimodalMedias;

        /**
         * <strong>example:</strong>
         * <p>2024-12-09 13:35:40</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>来源</p>
         */
        @NameInMap("SourceFrom")
        public String sourceFrom;

        /**
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xxxxx@xxxxx.com">xxxxx@xxxxx.com</a></p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Url")
        public String url;

        public static AddDatasetDocumentRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            AddDatasetDocumentRequestDocument self = new AddDatasetDocumentRequestDocument();
            return TeaModel.build(map, self);
        }

        public AddDatasetDocumentRequestDocument setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AddDatasetDocumentRequestDocument setDisableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
            this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
            return this;
        }
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

        public AddDatasetDocumentRequestDocument setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public AddDatasetDocumentRequestDocument setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public AddDatasetDocumentRequestDocument setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public AddDatasetDocumentRequestDocument setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public AddDatasetDocumentRequestDocument setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public AddDatasetDocumentRequestDocument setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public AddDatasetDocumentRequestDocument setMultimodalIndexName(String multimodalIndexName) {
            this.multimodalIndexName = multimodalIndexName;
            return this;
        }
        public String getMultimodalIndexName() {
            return this.multimodalIndexName;
        }

        public AddDatasetDocumentRequestDocument setMultimodalMedias(java.util.List<AddDatasetDocumentRequestDocumentMultimodalMedias> multimodalMedias) {
            this.multimodalMedias = multimodalMedias;
            return this;
        }
        public java.util.List<AddDatasetDocumentRequestDocumentMultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        public AddDatasetDocumentRequestDocument setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public AddDatasetDocumentRequestDocument setSourceFrom(String sourceFrom) {
            this.sourceFrom = sourceFrom;
            return this;
        }
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        public AddDatasetDocumentRequestDocument setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public AddDatasetDocumentRequestDocument setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public AddDatasetDocumentRequestDocument setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
