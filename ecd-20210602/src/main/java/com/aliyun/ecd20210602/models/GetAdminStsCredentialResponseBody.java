// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAdminStsCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAdminStsCredentialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetAdminStsCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdminStsCredentialResponseBody self = new GetAdminStsCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdminStsCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAdminStsCredentialResponseBody setData(GetAdminStsCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAdminStsCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetAdminStsCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAdminStsCredentialResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetAdminStsCredentialResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAdminStsCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdminStsCredentialResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetAdminStsCredentialResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AccessPath")
        public String accessPath;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("OssPoint")
        public String ossPoint;

        @NameInMap("OssPointInternal")
        public String ossPointInternal;

        @NameInMap("StsToken")
        public String stsToken;

        public static GetAdminStsCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAdminStsCredentialResponseBodyData self = new GetAdminStsCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAdminStsCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetAdminStsCredentialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetAdminStsCredentialResponseBodyData setAccessPath(String accessPath) {
            this.accessPath = accessPath;
            return this;
        }
        public String getAccessPath() {
            return this.accessPath;
        }

        public GetAdminStsCredentialResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetAdminStsCredentialResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetAdminStsCredentialResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetAdminStsCredentialResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetAdminStsCredentialResponseBodyData setOssPointInternal(String ossPointInternal) {
            this.ossPointInternal = ossPointInternal;
            return this;
        }
        public String getOssPointInternal() {
            return this.ossPointInternal;
        }

        public GetAdminStsCredentialResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
