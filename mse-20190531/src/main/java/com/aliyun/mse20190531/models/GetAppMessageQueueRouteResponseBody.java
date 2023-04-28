// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetAppMessageQueueRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAppMessageQueueRouteResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("FilterSide")
        public String filterSide;

        @NameInMap("Region")
        public String region;

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
