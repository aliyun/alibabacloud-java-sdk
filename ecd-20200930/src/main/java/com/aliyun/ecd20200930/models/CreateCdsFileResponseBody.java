// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileResponseBody extends TeaModel {
    @NameInMap("FileModel")
    public CreateCdsFileResponseBodyFileModel fileModel;

    /**
     * <p>The request ID.</p>
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
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("UploadId")
        public String uploadId;

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
