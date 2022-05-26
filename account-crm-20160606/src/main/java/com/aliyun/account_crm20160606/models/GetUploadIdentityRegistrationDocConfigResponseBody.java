// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetUploadIdentityRegistrationDocConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUploadIdentityRegistrationDocConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUploadIdentityRegistrationDocConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadIdentityRegistrationDocConfigResponseBody self = new GetUploadIdentityRegistrationDocConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadIdentityRegistrationDocConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUploadIdentityRegistrationDocConfigResponseBody setData(GetUploadIdentityRegistrationDocConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUploadIdentityRegistrationDocConfigResponseBodyData getData() {
        return this.data;
    }

    public GetUploadIdentityRegistrationDocConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUploadIdentityRegistrationDocConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadIdentityRegistrationDocConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUploadIdentityRegistrationDocConfigResponseBodyData extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("fileName")
        public String fileName;

        public static GetUploadIdentityRegistrationDocConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUploadIdentityRegistrationDocConfigResponseBodyData self = new GetUploadIdentityRegistrationDocConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUploadIdentityRegistrationDocConfigResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetUploadIdentityRegistrationDocConfigResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
