// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DescribeFileResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data fields.</p>
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
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indications whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
         * <p>The ID of the category to which the document belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3XXXXXXXX</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The timestamp when the document was uploaded to Model Studio. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC + 8.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-26 12:45:43</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The primary key ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>file_9a65732555b54d5ea10796ca5742ba22_XXXXXXXX</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>test.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type of the document. The value is an extension. Valid values: pdf, docx, doc, txt, md, pptx, and ppt.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("FileType")
        public String fileType;

        @NameInMap("ParseResultDownloadUrl")
        public String parseResultDownloadUrl;

        /**
         * <p>The parser that is used to parse the document. Valid value:</p>
         * <ul>
         * <li>DASHSCOPE_DOCMIND: The default document parser.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DASHSCOPE_DOCMIND</p>
         */
        @NameInMap("Parser")
        public String parser;

        /**
         * <p>The size of the document. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("SizeInBytes")
        public Long sizeInBytes;

        /**
         * <p>The status of the document. Valid values:</p>
         * <ul>
         * <li>INIT: pending parsing.</li>
         * <li>PARSING</li>
         * <li>PARSE_SUCCESS</li>
         * <li>PARSE_FAILED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PARSE_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are associated with the document. A document can be associated with multiple tags.</p>
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
