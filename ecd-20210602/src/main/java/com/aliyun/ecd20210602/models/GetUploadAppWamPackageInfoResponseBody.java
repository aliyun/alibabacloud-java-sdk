// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetUploadAppWamPackageInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUploadAppWamPackageInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUploadAppWamPackageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadAppWamPackageInfoResponseBody self = new GetUploadAppWamPackageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadAppWamPackageInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUploadAppWamPackageInfoResponseBody setData(GetUploadAppWamPackageInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUploadAppWamPackageInfoResponseBodyData getData() {
        return this.data;
    }

    public GetUploadAppWamPackageInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUploadAppWamPackageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUploadAppWamPackageInfoResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("File")
        public String file;

        @NameInMap("OssPointInternal")
        public String ossPointInternal;

        @NameInMap("RealFileName")
        public String realFileName;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetUploadAppWamPackageInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUploadAppWamPackageInfoResponseBodyData self = new GetUploadAppWamPackageInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUploadAppWamPackageInfoResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetUploadAppWamPackageInfoResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetUploadAppWamPackageInfoResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetUploadAppWamPackageInfoResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetUploadAppWamPackageInfoResponseBodyData setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public GetUploadAppWamPackageInfoResponseBodyData setOssPointInternal(String ossPointInternal) {
            this.ossPointInternal = ossPointInternal;
            return this;
        }
        public String getOssPointInternal() {
            return this.ossPointInternal;
        }

        public GetUploadAppWamPackageInfoResponseBodyData setRealFileName(String realFileName) {
            this.realFileName = realFileName;
            return this;
        }
        public String getRealFileName() {
            return this.realFileName;
        }

        public GetUploadAppWamPackageInfoResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
