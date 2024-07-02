// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyFileUploadLeaseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataCenter.FileTooLarge</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ApplyFileUploadLeaseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>778C0B3B-xxxx-5FC1-A947-36EDD13606AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ApplyFileUploadLeaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyFileUploadLeaseResponseBody self = new ApplyFileUploadLeaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyFileUploadLeaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyFileUploadLeaseResponseBody setData(ApplyFileUploadLeaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyFileUploadLeaseResponseBodyData getData() {
        return this.data;
    }

    public ApplyFileUploadLeaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyFileUploadLeaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyFileUploadLeaseResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApplyFileUploadLeaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyFileUploadLeaseResponseBodyDataParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;X-bailian-extra&quot;: &quot;MTAwNTQyNjQ5NTE2OTE3OA==&quot;,
         *         &quot;Content-Type&quot;: &quot;application/pdf&quot;</p>
         */
        @NameInMap("Headers")
        public Object headers;

        /**
         * <strong>example:</strong>
         * <p>PUT</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bailian-datahub-data-origin-prod.oss-cn-hangzhou.aliyuncs.com/1005426495169178/10024405/68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847.pdf?Expires=1716699536&OSSAccessKeyId=TestID&Signature=HfwPUZo4pR6DatSDym0zFKVh9Wg%3D">https://bailian-datahub-data-origin-prod.oss-cn-hangzhou.aliyuncs.com/1005426495169178/10024405/68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847.pdf?Expires=1716699536&amp;OSSAccessKeyId=TestID&amp;Signature=HfwPUZo4pR6DatSDym0zFKVh9Wg%3D</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ApplyFileUploadLeaseResponseBodyDataParam build(java.util.Map<String, ?> map) throws Exception {
            ApplyFileUploadLeaseResponseBodyDataParam self = new ApplyFileUploadLeaseResponseBodyDataParam();
            return TeaModel.build(map, self);
        }

        public ApplyFileUploadLeaseResponseBodyDataParam setHeaders(Object headers) {
            this.headers = headers;
            return this;
        }
        public Object getHeaders() {
            return this.headers;
        }

        public ApplyFileUploadLeaseResponseBodyDataParam setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ApplyFileUploadLeaseResponseBodyDataParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ApplyFileUploadLeaseResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1e6a159107384782be5e45ac4759b247.1719325231035</p>
         */
        @NameInMap("FileUploadLeaseId")
        public String fileUploadLeaseId;

        @NameInMap("Param")
        public ApplyFileUploadLeaseResponseBodyDataParam param;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Type")
        public String type;

        public static ApplyFileUploadLeaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyFileUploadLeaseResponseBodyData self = new ApplyFileUploadLeaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyFileUploadLeaseResponseBodyData setFileUploadLeaseId(String fileUploadLeaseId) {
            this.fileUploadLeaseId = fileUploadLeaseId;
            return this;
        }
        public String getFileUploadLeaseId() {
            return this.fileUploadLeaseId;
        }

        public ApplyFileUploadLeaseResponseBodyData setParam(ApplyFileUploadLeaseResponseBodyDataParam param) {
            this.param = param;
            return this;
        }
        public ApplyFileUploadLeaseResponseBodyDataParam getParam() {
            return this.param;
        }

        public ApplyFileUploadLeaseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
