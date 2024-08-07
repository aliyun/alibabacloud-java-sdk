// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectAttachmentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>e03a9f78-7b40-4fb3-a015-350913e37e3f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeProjectAttachmentsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeProjectAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectAttachmentsResponseBody self = new DescribeProjectAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectAttachmentsResponseBody setResult(java.util.List<DescribeProjectAttachmentsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeProjectAttachmentsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeProjectAttachmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProjectAttachmentsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Mzc4NDAtODQ3MjY4MzI=</p>
         */
        @NameInMap("AttachmentToken")
        public String attachmentToken;

        /**
         * <strong>example:</strong>
         * <p>File</p>
         */
        @NameInMap("AttachmentType")
        public String attachmentType;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p><a href="http://delivery-center.oss-cn-shanghai.aliyuncs.com/6a8****0e2/e0a***f3.jpg?Expires=1589334682&OSSAccessKeyId=wI2r*********&Signature=JWB39pUxs7RCqrcw58qXPEGu6M0%3D">http://delivery-center.oss-cn-shanghai.aliyuncs.com/6a8****0e2/e0a***f3.jpg?Expires=1589334682&amp;OSSAccessKeyId=wI2r*********&amp;Signature=JWB39pUxs7RCqrcw58qXPEGu6M0%3D</a></p>
         */
        @NameInMap("FileLink")
        public String fileLink;

        /**
         * <strong>example:</strong>
         * <p>1589334682404</p>
         */
        @NameInMap("FileLinkGmtExpired")
        public Long fileLinkGmtExpired;

        /**
         * <strong>example:</strong>
         * <p>f8-test-perview.jpeg</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>109124</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        @NameInMap("FileSuffix")
        public String fileSuffix;

        /**
         * <strong>example:</strong>
         * <p>1587968858000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>8472</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>45261111****</p>
         */
        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <strong>example:</strong>
         * <p>Provider</p>
         */
        @NameInMap("OperatorRole")
        public String operatorRole;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StepNo")
        public Integer stepNo;

        public static DescribeProjectAttachmentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectAttachmentsResponseBodyResult self = new DescribeProjectAttachmentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeProjectAttachmentsResponseBodyResult setAttachmentToken(String attachmentToken) {
            this.attachmentToken = attachmentToken;
            return this;
        }
        public String getAttachmentToken() {
            return this.attachmentToken;
        }

        public DescribeProjectAttachmentsResponseBodyResult setAttachmentType(String attachmentType) {
            this.attachmentType = attachmentType;
            return this;
        }
        public String getAttachmentType() {
            return this.attachmentType;
        }

        public DescribeProjectAttachmentsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeProjectAttachmentsResponseBodyResult setFileLink(String fileLink) {
            this.fileLink = fileLink;
            return this;
        }
        public String getFileLink() {
            return this.fileLink;
        }

        public DescribeProjectAttachmentsResponseBodyResult setFileLinkGmtExpired(Long fileLinkGmtExpired) {
            this.fileLinkGmtExpired = fileLinkGmtExpired;
            return this;
        }
        public Long getFileLinkGmtExpired() {
            return this.fileLinkGmtExpired;
        }

        public DescribeProjectAttachmentsResponseBodyResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeProjectAttachmentsResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeProjectAttachmentsResponseBodyResult setFileSuffix(String fileSuffix) {
            this.fileSuffix = fileSuffix;
            return this;
        }
        public String getFileSuffix() {
            return this.fileSuffix;
        }

        public DescribeProjectAttachmentsResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectAttachmentsResponseBodyResult setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public DescribeProjectAttachmentsResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeProjectAttachmentsResponseBodyResult setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public DescribeProjectAttachmentsResponseBodyResult setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeProjectAttachmentsResponseBodyResult setOperatorRole(String operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }
        public String getOperatorRole() {
            return this.operatorRole;
        }

        public DescribeProjectAttachmentsResponseBodyResult setStepNo(Integer stepNo) {
            this.stepNo = stepNo;
            return this;
        }
        public Integer getStepNo() {
            return this.stepNo;
        }

    }

}
