// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetUploadInfoResponseBody extends TeaModel {
    /**
     * <p>The response code of the API. A value of 200 indicates success. If the call fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The file upload address and temporary credentials.</p>
     */
    @NameInMap("Data")
    public GetUploadInfoResponseBodyData data;

    /**
     * <p>The processing message returned by the API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadInfoResponseBody self = new GetUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUploadInfoResponseBody setData(GetUploadInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUploadInfoResponseBodyData getData() {
        return this.data;
    }

    public GetUploadInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUploadInfoResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey ID of the STS temporary access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NUexample****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret of the STS temporary access credential. This parameter is used together with AccessKeyId and StsToken.</p>
         * 
         * <strong>example:</strong>
         * <p>secret-example****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The name of the destination OSS bucket for the upload.</p>
         * 
         * <strong>example:</strong>
         * <p>appstream-example</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>Not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>The OSS directory prefix where files are allowed to be uploaded. The path of the uploaded object must be located in this directory.</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The OSS endpoint for public network access.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("OssPoint")
        public String ossPoint;

        /**
         * <p>The internal OSS endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai-internal.aliyuncs.com</p>
         */
        @NameInMap("OssPointInternal")
        public String ossPointInternal;

        /**
         * <p>The STS temporary security token. This parameter is used together with AccessKeyId and AccessKeySecret for file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>CAISexample****</p>
         */
        @NameInMap("StsToken")
        public String stsToken;

        public static GetUploadInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUploadInfoResponseBodyData self = new GetUploadInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUploadInfoResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetUploadInfoResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetUploadInfoResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetUploadInfoResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetUploadInfoResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetUploadInfoResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetUploadInfoResponseBodyData setOssPointInternal(String ossPointInternal) {
            this.ossPointInternal = ossPointInternal;
            return this;
        }
        public String getOssPointInternal() {
            return this.ossPointInternal;
        }

        public GetUploadInfoResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
