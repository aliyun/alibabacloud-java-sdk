// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyTempStorageLeaseResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataCenter.FileTooLarge</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data fields.</p>
     */
    @NameInMap("Data")
    public ApplyTempStorageLeaseResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>778C0B3B-xxxx-5FC1-A947-36EDD13606AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ApplyTempStorageLeaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyTempStorageLeaseResponseBody self = new ApplyTempStorageLeaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyTempStorageLeaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyTempStorageLeaseResponseBody setData(ApplyTempStorageLeaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyTempStorageLeaseResponseBodyData getData() {
        return this.data;
    }

    public ApplyTempStorageLeaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyTempStorageLeaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyTempStorageLeaseResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApplyTempStorageLeaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyTempStorageLeaseResponseBodyDataParam extends TeaModel {
        /**
         * <p>K-V fields to be included in the Header; both Key and Value are strings.</p>
         * 
         * <strong>example:</strong>
         * <p>Content-Type: application/json</p>
         */
        @NameInMap("Headers")
        public Object headers;

        /**
         * <p>HTTP method for the call. Valid values: PUT POST</p>
         * 
         * <strong>example:</strong>
         * <p>PUT</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>Authorized URL for the file upload.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bailian-datahub-data-origin-prod.oss-cn-hangzhou.aliyuncs.com/1005426495169178/10024405/68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847.pdf?Expires=1716699536&OSSAccessKeyId=TestID&Signature=HfwPUZo4pR6DatSDym0zFKVh9Wg%3D">https://bailian-datahub-data-origin-prod.oss-cn-hangzhou.aliyuncs.com/1005426495169178/10024405/68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847.pdf?Expires=1716699536&amp;OSSAccessKeyId=TestID&amp;Signature=HfwPUZo4pR6DatSDym0zFKVh9Wg%3D</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ApplyTempStorageLeaseResponseBodyDataParam build(java.util.Map<String, ?> map) throws Exception {
            ApplyTempStorageLeaseResponseBodyDataParam self = new ApplyTempStorageLeaseResponseBodyDataParam();
            return TeaModel.build(map, self);
        }

        public ApplyTempStorageLeaseResponseBodyDataParam setHeaders(Object headers) {
            this.headers = headers;
            return this;
        }
        public Object getHeaders() {
            return this.headers;
        }

        public ApplyTempStorageLeaseResponseBodyDataParam setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ApplyTempStorageLeaseResponseBodyDataParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ApplyTempStorageLeaseResponseBodyData extends TeaModel {
        /**
         * <p>HTTP parameters used for uploading the file.</p>
         */
        @NameInMap("Param")
        public ApplyTempStorageLeaseResponseBodyDataParam param;

        /**
         * <p>Unique lease ID. This parameter is required when retrieving the uploaded file within the application later.</p>
         * 
         * <strong>example:</strong>
         * <p>1e6a159107384782be5e45ac4759b247.1719325231035</p>
         */
        @NameInMap("TempStorageLeaseId")
        public String tempStorageLeaseId;

        public static ApplyTempStorageLeaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyTempStorageLeaseResponseBodyData self = new ApplyTempStorageLeaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyTempStorageLeaseResponseBodyData setParam(ApplyTempStorageLeaseResponseBodyDataParam param) {
            this.param = param;
            return this;
        }
        public ApplyTempStorageLeaseResponseBodyDataParam getParam() {
            return this.param;
        }

        public ApplyTempStorageLeaseResponseBodyData setTempStorageLeaseId(String tempStorageLeaseId) {
            this.tempStorageLeaseId = tempStorageLeaseId;
            return this;
        }
        public String getTempStorageLeaseId() {
            return this.tempStorageLeaseId;
        }

    }

}
