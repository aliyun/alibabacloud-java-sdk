// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobResultResponseBody extends TeaModel {
    /**
     * <p>The complete text parsing content.</p>
     * <blockquote>
     * <p>For a content task, ContentList splits the original document by page. Each page has a separate Markdown text block.</p>
     * </blockquote>
     */
    @NameInMap("ContentList")
    public java.util.List<DescribeDocParserJobResultResponseBodyContentList> contentList;

    /**
     * <p>The dynamic error code. This parameter will be deprecated soon.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message. It is used to replace the <strong>%s</strong> placeholder in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The OSS download URL of the file.</p>
     * <blockquote>
     * <p>For a ZIP task, this field returns the download URL of the ZIP package. The URL is valid for 30 minutes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa">https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa</a>****</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The public OSS download URL of the file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa">https://oss-cn-hangzhou.aliyuncs.com/806a_209584525031252870_078f1180f27b4c069c0f271758aa</a>****</p>
     */
    @NameInMap("OuterFileUrl")
    public String outerFileUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDocParserJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobResultResponseBody self = new DescribeDocParserJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobResultResponseBody setContentList(java.util.List<DescribeDocParserJobResultResponseBodyContentList> contentList) {
        this.contentList = contentList;
        return this;
    }
    public java.util.List<DescribeDocParserJobResultResponseBodyContentList> getContentList() {
        return this.contentList;
    }

    public DescribeDocParserJobResultResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDocParserJobResultResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDocParserJobResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDocParserJobResultResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDocParserJobResultResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public DescribeDocParserJobResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDocParserJobResultResponseBody setOuterFileUrl(String outerFileUrl) {
        this.outerFileUrl = outerFileUrl;
        return this;
    }
    public String getOuterFileUrl() {
        return this.outerFileUrl;
    }

    public DescribeDocParserJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocParserJobResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDocParserJobResultResponseBodyContentList extends TeaModel {
        /**
         * <p>The text content of the corresponding page, which is the complete parsed Markdown text.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>Demo * ** Demo title **</li>
         * </ul>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        public static DescribeDocParserJobResultResponseBodyContentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocParserJobResultResponseBodyContentList self = new DescribeDocParserJobResultResponseBodyContentList();
            return TeaModel.build(map, self);
        }

        public DescribeDocParserJobResultResponseBodyContentList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDocParserJobResultResponseBodyContentList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

    }

}
