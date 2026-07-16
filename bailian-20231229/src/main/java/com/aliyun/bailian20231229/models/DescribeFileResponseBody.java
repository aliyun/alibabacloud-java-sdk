// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DescribeFileResponseBody extends TeaModel {
    /**
     * <p>The error status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data field returned by the operation.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
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
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>file_9a65732555b54d5ea10796ca5742ba22_xxxxxxxx</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX产品介绍.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type (extension). Possible values: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The reason for the parsing failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Error Message</p>
         */
        @NameInMap("ParseErrorMessage")
        public String parseErrorMessage;

        @NameInMap("ParseResultDownloadUrl")
        public String parseResultDownloadUrl;

        /**
         * <p>The parser type used to parse the file. Possible values:</p>
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
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("SizeInBytes")
        public Long sizeInBytes;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For files used in document-based knowledge bases (type: UNSTRUCTURED), possible values:</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>For files used in unstructured knowledge bases (type: UNSTRUCTURED), possible values:</p>
         * <ul>
         * <li>INIT: Pending parsing.</li>
         * <li>IN_PARSE_QUEUE: Queued for parsing.</li>
         * <li>PARSING: Being parsed.</li>
         * <li>PARSE_SUCCESS: Parsing completed.
         * <note>The document can be imported into a knowledge base only after the status changes to PARSE_SUCCESS.</note></li>
         * <li>PARSE_FAILED: Parsing failed.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;
         * For files used in agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a> (type: SESSION_FILE), possible values:</p>
         * <ul>
         * <li>INIT: Pending parsing.</li>
         * <li>IN_PARSE_QUEUE: Queued for parsing.</li>
         * <li>PARSING: Being parsed.</li>
         * <li>PARSE_SUCCESS: Parsing completed.</li>
         * <li>PARSE_FAILED: Parsing failed.</li>
         * <li>SAFE_CHECKING: Safety check in progress.</li>
         * <li>SAFE_CHECK_FAILED: Safety check failed.</li>
         * <li>INDEX_BUILDING: Index being built.</li>
         * <li>INDEX_BUILD_SUCCESS: Index built.</li>
         * <li>INDEX_BUILDING_FAILED: Index building failed.</li>
         * <li>INDEX_DELETED: File index deleted.</li>
         * <li>FILE_IS_READY: File is ready.
         * <note>Q&amp;A is available only after the status changes to FILE_IS_READY.</note></li>
         * <li>FILE_EXPIRED: File expired.
         * <note>The file is valid only for the current user session. After the user closes the session, the file expires (maximum validity period: 7 days). Long-term retention is not supported.</note>
         * .</li>
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
