// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DescribeFileResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data field.</p>
     */
    @NameInMap("Data")
    public DescribeFileResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Requests throttling triggered.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: The operation was successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileResponseBody self = new DescribeFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFileResponseBody setData(DescribeFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeFileResponseBodyData getData() {
        return this.data;
    }

    public DescribeFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFileResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the category to which the file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The timestamp when the file was added to Model Studio. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-09 12:45:43</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>file_9a65732555b54d5ea10796ca5742ba22_xxxxxxxx</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX Product Introduction.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type, which is the file extension. Valid values: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The download URL of the source file.</p>
         * 
         * <strong>example:</strong>
         * <p>https:xxxx.com/xxx.pdf?sign=xxxx&amp;expiredAt=xxxx</p>
         */
        @NameInMap("OriginFileDownloadUrl")
        public String originFileDownloadUrl;

        /**
         * <p>The cause of the parsing failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Error Message</p>
         */
        @NameInMap("ParseErrorMessage")
        public String parseErrorMessage;

        /**
         * <p>The download URL of the file parsing result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/parse-result">https://example.com/parse-result</a></p>
         */
        @NameInMap("ParseResultDownloadUrl")
        public String parseResultDownloadUrl;

        /**
         * <p>The type of the parser used to parse the file. Valid values:</p>
         * <ul>
         * <li>DASHSCOPE_DOCMIND: the default document parser.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DASHSCOPE_DOCMIND</p>
         */
        @NameInMap("Parser")
        public String parser;

        /**
         * <p>The size of the file, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("SizeInBytes")
        public Long sizeInBytes;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The status of a file used for a document knowledge base (type: UNSTRUCTURED). Valid values:</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>The status of a file used for an unstructured knowledge base (type: UNSTRUCTURED). Valid values:</p>
         * <ul>
         * <li>INIT: to be parsed.</li>
         * <li>IN_PARSE_QUEUE: queuing for parsing.</li>
         * <li>PARSING: parsing.</li>
         * <li>PARSE_SUCCESS: parsed.
         * <note>You can import a document into a knowledge base only after its status changes to PARSE_SUCCESS.</note></li>
         * <li>PARSE_FAILED: parsing failed.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;
         * The status of a file used for <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a> in an agent application (type: SESSION_FILE). Valid values:</p>
         * <ul>
         * <li>INIT: to be parsed.</li>
         * <li>IN_PARSE_QUEUE: queuing for parsing.</li>
         * <li>PARSING: parsing.</li>
         * <li>PARSE_SUCCESS: parsed.</li>
         * <li>PARSE_FAILED: parsing failed.</li>
         * <li>SAFE_CHECKING: undergoing security check.</li>
         * <li>SAFE_CHECK_FAILED: security check failed.</li>
         * <li>INDEX_BUILDING: building index.</li>
         * <li>INDEX_BUILD_SUCCESS: index built.</li>
         * <li>INDEX_BUILDING_FAILED: index building failed.</li>
         * <li>INDEX_DELETED: file index deleted.</li>
         * <li>FILE_IS_READY: file ready.
         * <note>You can perform Q&amp;A only after the status changes to FILE_IS_READY.</note></li>
         * <li>FILE_EXPIRED: file expired.
         * <note>The file is valid only for the current session of the user. After the user closes the session, the file expires. The maximum validity period is 7 days. Long-term storage is not supported.</note></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PARSE_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags associated with the file. A file can be associated with multiple tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static DescribeFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileResponseBodyData self = new DescribeFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeFileResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeFileResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFileResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DescribeFileResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeFileResponseBodyData setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public DescribeFileResponseBodyData setOriginFileDownloadUrl(String originFileDownloadUrl) {
            this.originFileDownloadUrl = originFileDownloadUrl;
            return this;
        }
        public String getOriginFileDownloadUrl() {
            return this.originFileDownloadUrl;
        }

        public DescribeFileResponseBodyData setParseErrorMessage(String parseErrorMessage) {
            this.parseErrorMessage = parseErrorMessage;
            return this;
        }
        public String getParseErrorMessage() {
            return this.parseErrorMessage;
        }

        public DescribeFileResponseBodyData setParseResultDownloadUrl(String parseResultDownloadUrl) {
            this.parseResultDownloadUrl = parseResultDownloadUrl;
            return this;
        }
        public String getParseResultDownloadUrl() {
            return this.parseResultDownloadUrl;
        }

        public DescribeFileResponseBodyData setParser(String parser) {
            this.parser = parser;
            return this;
        }
        public String getParser() {
            return this.parser;
        }

        public DescribeFileResponseBodyData setSizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }
        public Long getSizeInBytes() {
            return this.sizeInBytes;
        }

        public DescribeFileResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
