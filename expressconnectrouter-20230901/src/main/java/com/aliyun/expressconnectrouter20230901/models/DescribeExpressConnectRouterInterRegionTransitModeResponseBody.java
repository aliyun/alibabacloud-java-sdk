// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterInterRegionTransitModeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InterRegionTransitModeList")
    public java.util.List<DescribeExpressConnectRouterInterRegionTransitModeResponseBodyInterRegionTransitModeList> interRegionTransitModeList;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ECMP</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
