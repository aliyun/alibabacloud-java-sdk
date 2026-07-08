// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDocInfoResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetDocInfoResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDocInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocInfoResponseBody self = new GetDocInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocInfoResponseBody setData(GetDocInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDocInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDocInfoResponseBodyDataPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static GetDocInfoResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDocInfoResponseBodyDataPageInfo self = new GetDocInfoResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public GetDocInfoResponseBodyDataPageInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetDocInfoResponseBodyDataPageInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetDocInfoResponseBodyData extends TeaModel {
        /**
         * <p>The category where the document is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The document name.</p>
         * 
         * <strong>example:</strong>
         * <p>電視廣播2020年報</p>
         */
        @NameInMap("DocName")
        public String docName;

        /**
         * <p>The document type.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <p>The URL of the document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.pdf">http://xxx/xxx.pdf</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("PageInfo")
        public GetDocInfoResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>1和0，当状态为1时 表示获取文档成功，用户可进行生成文档摘要、生脑图等操作</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The status message.</p>
         * 
         * <strong>example:</strong>
         * <p>导入成功</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>Text transcripts from the video\&quot;s audio.</p>
         */
        @NameInMap("VideoContents")
        public java.util.List<String> videoContents;

        public static GetDocInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocInfoResponseBodyData self = new GetDocInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocInfoResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public GetDocInfoResponseBodyData setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public GetDocInfoResponseBodyData setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public GetDocInfoResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetDocInfoResponseBodyData setPageInfo(GetDocInfoResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public GetDocInfoResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public GetDocInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDocInfoResponseBodyData setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public GetDocInfoResponseBodyData setVideoContents(java.util.List<String> videoContents) {
            this.videoContents = videoContents;
            return this;
        }
        public java.util.List<String> getVideoContents() {
            return this.videoContents;
        }

    }

}
