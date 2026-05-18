// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDocumentResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDocumentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>KnowledgeBaseNotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Resource not found kb-***</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocumentResponseBody self = new DescribeDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocumentResponseBody setData(DescribeDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDocumentResponseBodyData getData() {
        return this.data;
    }

    public DescribeDocumentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDocumentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDocumentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DocsCount")
        public Long docsCount;

        /**
         * <strong>example:</strong>
         * <p>ADBPGLoader</p>
         */
        @NameInMap("DocumentLoaderName")
        public String documentLoaderName;

        /**
         * <strong>example:</strong>
         * <p>md</p>
         */
        @NameInMap("FileExt")
        public String fileExt;

        /**
         * <strong>example:</strong>
         * <p>20307</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>2026-04-22 22:59:35</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2026-04-24 21:22:53</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        @NameInMap("KbUuid")
        public String kbUuid;

        /**
         * <strong>example:</strong>
         * <p>[&quot;test&quot;,&quot;abc&quot;]</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        /**
         * <strong>example:</strong>
         * <p>test.md</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public Long state;

        /**
         * <strong>example:</strong>
         * <p>This is a test document.</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>ChineseRecursiveTextSplitter</p>
         */
        @NameInMap("TextSplitterName")
        public String textSplitterName;

        public static DescribeDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocumentResponseBodyData self = new DescribeDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDocumentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDocumentResponseBodyData setDocsCount(Long docsCount) {
            this.docsCount = docsCount;
            return this;
        }
        public Long getDocsCount() {
            return this.docsCount;
        }

        public DescribeDocumentResponseBodyData setDocumentLoaderName(String documentLoaderName) {
            this.documentLoaderName = documentLoaderName;
            return this;
        }
        public String getDocumentLoaderName() {
            return this.documentLoaderName;
        }

        public DescribeDocumentResponseBodyData setFileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }
        public String getFileExt() {
            return this.fileExt;
        }

        public DescribeDocumentResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeDocumentResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDocumentResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDocumentResponseBodyData setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

        public DescribeDocumentResponseBodyData setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public DescribeDocumentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDocumentResponseBodyData setState(Long state) {
            this.state = state;
            return this;
        }
        public Long getState() {
            return this.state;
        }

        public DescribeDocumentResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeDocumentResponseBodyData setTextSplitterName(String textSplitterName) {
            this.textSplitterName = textSplitterName;
            return this;
        }
        public String getTextSplitterName() {
            return this.textSplitterName;
        }

    }

}
