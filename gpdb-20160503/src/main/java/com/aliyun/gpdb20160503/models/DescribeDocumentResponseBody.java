// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DocsCount")
    public Integer docsCount;

    /**
     * <strong>example:</strong>
     * <p>RapidOCRPDFLoader</p>
     */
    @NameInMap("DocumentLoader")
    public String documentLoader;

    /**
     * <strong>example:</strong>
     * <p>txt</p>
     */
    @NameInMap("FileExt")
    public String fileExt;

    /**
     * <strong>example:</strong>
     * <p>b8078c9591413550f8963e37e24abcea</p>
     */
    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <strong>example:</strong>
     * <p>2023-11-01 10:01:01.123456</p>
     */
    @NameInMap("FileMtime")
    public String fileMtime;

    /**
     * <strong>example:</strong>
     * <p>music.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FileVersion")
    public Integer fileVersion;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://oss.xxx/music.txt">http://oss.xxx/music.txt</a></p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>ChineseRecursiveTextSplitter</p>
     */
    @NameInMap("TextSplitter")
    public String textSplitter;

    public static DescribeDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocumentResponseBody self = new DescribeDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocumentResponseBody setDocsCount(Integer docsCount) {
        this.docsCount = docsCount;
        return this;
    }
    public Integer getDocsCount() {
        return this.docsCount;
    }

    public DescribeDocumentResponseBody setDocumentLoader(String documentLoader) {
        this.documentLoader = documentLoader;
        return this;
    }
    public String getDocumentLoader() {
        return this.documentLoader;
    }

    public DescribeDocumentResponseBody setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public DescribeDocumentResponseBody setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public DescribeDocumentResponseBody setFileMtime(String fileMtime) {
        this.fileMtime = fileMtime;
        return this;
    }
    public String getFileMtime() {
        return this.fileMtime;
    }

    public DescribeDocumentResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeDocumentResponseBody setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public DescribeDocumentResponseBody setFileVersion(Integer fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Integer getFileVersion() {
        return this.fileVersion;
    }

    public DescribeDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocumentResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeDocumentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDocumentResponseBody setTextSplitter(String textSplitter) {
        this.textSplitter = textSplitter;
        return this;
    }
    public String getTextSplitter() {
        return this.textSplitter;
    }

}
