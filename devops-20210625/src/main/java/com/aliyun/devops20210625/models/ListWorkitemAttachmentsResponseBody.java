// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemAttachmentsResponseBody extends TeaModel {
    @NameInMap("attachments")
    public java.util.List<ListWorkitemAttachmentsResponseBodyAttachments> attachments;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListWorkitemAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemAttachmentsResponseBody self = new ListWorkitemAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkitemAttachmentsResponseBody setAttachments(java.util.List<ListWorkitemAttachmentsResponseBodyAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<ListWorkitemAttachmentsResponseBodyAttachments> getAttachments() {
        return this.attachments;
    }

    public ListWorkitemAttachmentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkitemAttachmentsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListWorkitemAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkitemAttachmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkitemAttachmentsResponseBodyAttachments extends TeaModel {
        @NameInMap("creator")
        public String creator;

        @NameInMap("fileIdentifier")
        public String fileIdentifier;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("fileSuffix")
        public String fileSuffix;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("size")
        public String size;

        @NameInMap("url")
        public String url;

        public static ListWorkitemAttachmentsResponseBodyAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListWorkitemAttachmentsResponseBodyAttachments self = new ListWorkitemAttachmentsResponseBodyAttachments();
            return TeaModel.build(map, self);
        }

        public ListWorkitemAttachmentsResponseBodyAttachments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkitemAttachmentsResponseBodyAttachments setFileIdentifier(String fileIdentifier) {
            this.fileIdentifier = fileIdentifier;
            return this;
        }
        public String getFileIdentifier() {
            return this.fileIdentifier;
        }

        public ListWorkitemAttachmentsResponseBodyAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListWorkitemAttachmentsResponseBodyAttachments setFileSuffix(String fileSuffix) {
            this.fileSuffix = fileSuffix;
            return this;
        }
        public String getFileSuffix() {
            return this.fileSuffix;
        }

        public ListWorkitemAttachmentsResponseBodyAttachments setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkitemAttachmentsResponseBodyAttachments setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListWorkitemAttachmentsResponseBodyAttachments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
