// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileResponseBody extends TeaModel {
    /**
     * <p>File upload response object.</p>
     */
    @NameInMap("FileModel")
    public CreateCdsFileResponseBodyFileModel fileModel;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BAFE05D-FFB9-5938-96D0-08017DB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdsFileResponseBody self = new CreateCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdsFileResponseBody setFileModel(CreateCdsFileResponseBodyFileModel fileModel) {
        this.fileModel = fileModel;
        return this;
    }
    public CreateCdsFileResponseBodyFileModel getFileModel() {
        return this.fileModel;
    }

    public CreateCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCdsFileResponseBodyFileModel extends TeaModel {
        /**
         * <p>File ID.</p>
         * 
         * <strong>example:</strong>
         * <p>646ec2f662b1e08f7a2b4d648982f906****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>File upload task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20BE155AC20943BE9D405B0997A9****</p>
         */
        @NameInMap("UploadId")
        public String uploadId;

        /**
         * <p>File upload URL. Valid for 15 minutes by default.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data.aliyunpds.com/xxx/xxx?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx&partNumber=1&uploadId=0CC175B9C0F1B6A831C399E26977">https://data.aliyunpds.com/xxx/xxx?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx&amp;partNumber=1&amp;uploadId=0CC175B9C0F1B6A831C399E26977</a>****</p>
         */
        @NameInMap("UploadUrl")
        public String uploadUrl;

        public static CreateCdsFileResponseBodyFileModel build(java.util.Map<String, ?> map) throws Exception {
            CreateCdsFileResponseBodyFileModel self = new CreateCdsFileResponseBodyFileModel();
            return TeaModel.build(map, self);
        }

        public CreateCdsFileResponseBodyFileModel setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateCdsFileResponseBodyFileModel setUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }
        public String getUploadId() {
            return this.uploadId;
        }

        public CreateCdsFileResponseBodyFileModel setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
