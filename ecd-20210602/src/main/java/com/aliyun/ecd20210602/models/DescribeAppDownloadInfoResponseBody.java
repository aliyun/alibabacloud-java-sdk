// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeAppDownloadInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAppDownloadInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppDownloadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDownloadInfoResponseBody self = new DescribeAppDownloadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppDownloadInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppDownloadInfoResponseBody setData(DescribeAppDownloadInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAppDownloadInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeAppDownloadInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppDownloadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppDownloadInfoResponseBodyData extends TeaModel {
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

        public static DescribeAppDownloadInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppDownloadInfoResponseBodyData self = new DescribeAppDownloadInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAppDownloadInfoResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeAppDownloadInfoResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeAppDownloadInfoResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeAppDownloadInfoResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeAppDownloadInfoResponseBodyData setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public DescribeAppDownloadInfoResponseBodyData setRealFileName(String realFileName) {
            this.realFileName = realFileName;
            return this;
        }
        public String getRealFileName() {
            return this.realFileName;
        }

        public DescribeAppDownloadInfoResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
