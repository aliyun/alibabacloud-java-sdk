// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeUnpackagedAppDownloadInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeUnpackagedAppDownloadInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUnpackagedAppDownloadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnpackagedAppDownloadInfoResponseBody self = new DescribeUnpackagedAppDownloadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUnpackagedAppDownloadInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUnpackagedAppDownloadInfoResponseBody setData(DescribeUnpackagedAppDownloadInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUnpackagedAppDownloadInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeUnpackagedAppDownloadInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUnpackagedAppDownloadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUnpackagedAppDownloadInfoResponseBodyData extends TeaModel {
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

        @NameInMap("RealFileName")
        public String realFileName;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static DescribeUnpackagedAppDownloadInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnpackagedAppDownloadInfoResponseBodyData self = new DescribeUnpackagedAppDownloadInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUnpackagedAppDownloadInfoResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeUnpackagedAppDownloadInfoResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeUnpackagedAppDownloadInfoResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeUnpackagedAppDownloadInfoResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeUnpackagedAppDownloadInfoResponseBodyData setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public DescribeUnpackagedAppDownloadInfoResponseBodyData setRealFileName(String realFileName) {
            this.realFileName = realFileName;
            return this;
        }
        public String getRealFileName() {
            return this.realFileName;
        }

        public DescribeUnpackagedAppDownloadInfoResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
