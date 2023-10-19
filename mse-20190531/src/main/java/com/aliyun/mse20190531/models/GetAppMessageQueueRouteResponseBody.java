// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetAppMessageQueueRouteResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetAppMessageQueueRouteResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false. The value true indicates that the request was successful. The value false indicates that the request failed.</p>
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
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether the canary release for messaging feature is enabled.</p>
         * <br>
         * <p>*   `true`: enabled</p>
         * <p>*   `false`: disabled</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The side for message filtering when the canary release for messaging feature is enabled.</p>
         */
        @NameInMap("FilterSide")
        public String filterSide;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The tags used to ignore message consumption for nodes in untagged environments.</p>
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
