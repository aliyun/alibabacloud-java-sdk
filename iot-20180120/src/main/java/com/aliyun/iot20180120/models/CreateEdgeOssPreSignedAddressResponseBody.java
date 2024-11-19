// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public CreateEdgeOssPreSignedAddressResponseBodyData data;

    /**
     * <p>The error message that is returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91E2BFA2-ECD7-4E11-B36B-66BCC4773922</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateEdgeOssPreSignedAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeOssPreSignedAddressResponseBody self = new CreateEdgeOssPreSignedAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeOssPreSignedAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setData(CreateEdgeOssPreSignedAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEdgeOssPreSignedAddressResponseBodyData getData() {
        return this.data;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEdgeOssPreSignedAddressResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip">http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip</a></p>
         */
        @NameInMap("OssAddress")
        public String ossAddress;

        /**
         * <p>The pre-signed URL of the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/32016.html">OSS documentation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip?Expires%5C%5Cu003d1581586402%5C%5Cu0026OSSAccessKeyId%5C%5Cu003daS4MT0IYrP******%5C%5Cu0026Signature%5C%5Cu003dIUUjZ881H3rUoCOwjMXPmGbw">http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip?Expires\\u003d1581586402\\u0026OSSAccessKeyId\\u003daS4MT0IYrP******\\u0026Signature\\u003dIUUjZ881H3rUoCOwjMXPmGbw</a>******</p>
         */
        @NameInMap("OssPreSignedAddress")
        public String ossPreSignedAddress;

        public static CreateEdgeOssPreSignedAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeOssPreSignedAddressResponseBodyData self = new CreateEdgeOssPreSignedAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEdgeOssPreSignedAddressResponseBodyData setOssAddress(String ossAddress) {
            this.ossAddress = ossAddress;
            return this;
        }
        public String getOssAddress() {
            return this.ossAddress;
        }

        public CreateEdgeOssPreSignedAddressResponseBodyData setOssPreSignedAddress(String ossPreSignedAddress) {
            this.ossPreSignedAddress = ossPreSignedAddress;
            return this;
        }
        public String getOssPreSignedAddress() {
            return this.ossPreSignedAddress;
        }

    }

}
