// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetAppMessageQueueRouteResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public GetAppMessageQueueRouteResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, the cause of the failure is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B00BCB0-105F-5A2A-B75B-641C8E9B18FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAppMessageQueueRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppMessageQueueRouteResponseBody self = new GetAppMessageQueueRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppMessageQueueRouteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAppMessageQueueRouteResponseBody setData(GetAppMessageQueueRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppMessageQueueRouteResponseBodyData getData() {
        return this.data;
    }

    public GetAppMessageQueueRouteResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAppMessageQueueRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppMessageQueueRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppMessageQueueRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppMessageQueueRouteResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@54e1f42f37cd65a</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether the feature is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The filtering side for message canary release.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        @NameInMap("FilterSide")
        public String filterSide;

        /**
         * <p>The list of baseline environment labels for MSMQ grayscale rules.</p>
         */
        @NameInMap("GrayBaseTags")
        public java.util.List<String> grayBaseTags;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The tags that are not consumed by the untagged environments of the application.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static GetAppMessageQueueRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppMessageQueueRouteResponseBodyData self = new GetAppMessageQueueRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppMessageQueueRouteResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppMessageQueueRouteResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAppMessageQueueRouteResponseBodyData setFilterSide(String filterSide) {
            this.filterSide = filterSide;
            return this;
        }
        public String getFilterSide() {
            return this.filterSide;
        }

        public GetAppMessageQueueRouteResponseBodyData setGrayBaseTags(java.util.List<String> grayBaseTags) {
            this.grayBaseTags = grayBaseTags;
            return this;
        }
        public java.util.List<String> getGrayBaseTags() {
            return this.grayBaseTags;
        }

        public GetAppMessageQueueRouteResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAppMessageQueueRouteResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
