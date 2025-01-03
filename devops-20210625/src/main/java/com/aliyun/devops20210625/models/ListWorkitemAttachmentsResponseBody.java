// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemAttachmentsResponseBody extends TeaModel {
    @NameInMap("attachments")
    public java.util.List<ListWorkitemAttachmentsResponseBodyAttachments> attachments;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>237109</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>dflkjlsdddsdl234lkjfg</p>
         */
        @NameInMap("fileIdentifier")
        public String fileIdentifier;

        /**
         * <strong>example:</strong>
         * <p>Artifacts_1565193_1.tgz</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>tgz</p>
         */
        @NameInMap("fileSuffix")
        public String fileSuffix;

        /**
         * <strong>example:</strong>
         * <p>1545726028000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p><a href="http://grace-share.oss-cn-hangzhou.aliyuncs.com/qf%2Fheap.bin?Expires=1675750082&OSSAccessKeyId=LTAI5t8irN2Wu3BGrBpffZue&Signature=RqRUEuHiwW8wuahYz6CenHaWWs4%3D">http://grace-share.oss-cn-hangzhou.aliyuncs.com/qf%2Fheap.bin?Expires=1675750082&amp;OSSAccessKeyId=LTAI5t8irN2Wu3BGrBpffZue&amp;Signature=RqRUEuHiwW8wuahYz6CenHaWWs4%3D</a></p>
         */
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
