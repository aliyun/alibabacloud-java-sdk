// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateDeviceNameListURLResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information returned if the call is successful. For more information, see the following parameters:</p>
     */
    @NameInMap("Data")
    public GenerateDeviceNameListURLResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateDeviceNameListURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceNameListURLResponseBody self = new GenerateDeviceNameListURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceNameListURLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateDeviceNameListURLResponseBody setData(GenerateDeviceNameListURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDeviceNameListURLResponseBodyData getData() {
        return this.data;
    }

    public GenerateDeviceNameListURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateDeviceNameListURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDeviceNameListURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateDeviceNameListURLResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey ID of the bucket owner.</p>
         * <br>
         * <p>The OSS bucket stores the file.</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The URL of the file that is stored in OSS.</p>
         * <br>
         * <p>After the device list file is uploaded, this parameter is used to call the [CreateOTAStaticUpgradeJob](~~147496~~) operation to create a static update batch.</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The endpoint of OSS.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The full path of the file in OSS. You can call the OSS PostObject operation to upload the file to OSS.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the object storage. Default value: OSS.</p>
         */
        @NameInMap("ObjectStorage")
        public String objectStorage;

        /**
         * <p>The parameter that is used by OSS to verify form fields for the request.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The signature that is calculated based on **AccessKeySecret** and **Policy**. When you call an OSS operation, OSS uses the signature information to verify the POST request.</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The time when the URL of the file that you want to upload was generated. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        public static GenerateDeviceNameListURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDeviceNameListURLResponseBodyData self = new GenerateDeviceNameListURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDeviceNameListURLResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GenerateDeviceNameListURLResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GenerateDeviceNameListURLResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateDeviceNameListURLResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateDeviceNameListURLResponseBodyData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

        public GenerateDeviceNameListURLResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateDeviceNameListURLResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateDeviceNameListURLResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
