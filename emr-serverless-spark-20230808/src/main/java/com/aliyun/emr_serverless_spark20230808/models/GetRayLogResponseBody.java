// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRayLogResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 1000000 indicates a successful request. Other values indicate a failed request. You can view the specific error description in the message parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetRayLogResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B06AADC1-1627-5B1C-B62F-A2226C122897</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRayLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRayLogResponseBody self = new GetRayLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRayLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRayLogResponseBody setData(GetRayLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRayLogResponseBodyData getData() {
        return this.data;
    }

    public GetRayLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRayLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRayLogResponseBodyData extends TeaModel {
        /**
         * <p>The file download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mybucket.cn-hangzhou.com/xxxxxx">https://mybucket.cn-hangzhou.com/xxxxxx</a></p>
         */
        @NameInMap("accessUrl")
        public String accessUrl;

        public static GetRayLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRayLogResponseBodyData self = new GetRayLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRayLogResponseBodyData setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

    }

}
