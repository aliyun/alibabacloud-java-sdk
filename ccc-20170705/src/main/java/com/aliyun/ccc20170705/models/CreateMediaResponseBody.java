// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MediaUploadParam")
    public CreateMediaResponseBodyMediaUploadParam mediaUploadParam;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaResponseBody self = new CreateMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMediaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMediaResponseBody setMediaUploadParam(CreateMediaResponseBodyMediaUploadParam mediaUploadParam) {
        this.mediaUploadParam = mediaUploadParam;
        return this;
    }
    public CreateMediaResponseBodyMediaUploadParam getMediaUploadParam() {
        return this.mediaUploadParam;
    }

    public CreateMediaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMediaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMediaResponseBodyMediaUploadParam extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Instance")
        public String instance;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssFileName")
        public String ossFileName;

        @NameInMap("OssFilePath")
        public String ossFilePath;

        public static CreateMediaResponseBodyMediaUploadParam build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaResponseBodyMediaUploadParam self = new CreateMediaResponseBodyMediaUploadParam();
            return TeaModel.build(map, self);
        }

        public CreateMediaResponseBodyMediaUploadParam setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateMediaResponseBodyMediaUploadParam setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMediaResponseBodyMediaUploadParam setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public CreateMediaResponseBodyMediaUploadParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMediaResponseBodyMediaUploadParam setOssFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }
        public String getOssFileName() {
            return this.ossFileName;
        }

        public CreateMediaResponseBodyMediaUploadParam setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

    }

}
