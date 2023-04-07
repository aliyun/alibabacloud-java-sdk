// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileResponseBody extends TeaModel {
    @NameInMap("FileModels")
    public java.util.List<CreateCdsFileResponseBodyFileModels> fileModels;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdsFileResponseBody self = new CreateCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdsFileResponseBody setFileModels(java.util.List<CreateCdsFileResponseBodyFileModels> fileModels) {
        this.fileModels = fileModels;
        return this;
    }
    public java.util.List<CreateCdsFileResponseBodyFileModels> getFileModels() {
        return this.fileModels;
    }

    public CreateCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCdsFileResponseBodyFileModels extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("UploadId")
        public String uploadId;

        @NameInMap("UploadUrl")
        public String uploadUrl;

        public static CreateCdsFileResponseBodyFileModels build(java.util.Map<String, ?> map) throws Exception {
            CreateCdsFileResponseBodyFileModels self = new CreateCdsFileResponseBodyFileModels();
            return TeaModel.build(map, self);
        }

        public CreateCdsFileResponseBodyFileModels setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateCdsFileResponseBodyFileModels setUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }
        public String getUploadId() {
            return this.uploadId;
        }

        public CreateCdsFileResponseBodyFileModels setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
