// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterInterRegionTransitModeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InterRegionTransitModeList")
    public java.util.List<DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList> interRegionTransitModeList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeExpressConnectRouterInterRegionTransitModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterInterRegionTransitModeResponseBody self = new DescribeExpressConnectRouterInterRegionTransitModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setInterRegionTransitModeList(java.util.List<DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList> interRegionTransitModeList) {
        this.interRegionTransitModeList = interRegionTransitModeList;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList> getInterRegionTransitModeList() {
        return this.interRegionTransitModeList;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressConnectRouterInterRegionTransitModeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList extends TeaModel {
        @NameInMap("Mode")
        public String mode;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList self = new DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
