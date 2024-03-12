// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CheckAddRegionToExpressConnectRouterResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("AnyCrossBorderLink")
    public Boolean anyCrossBorderLink;

    @NameInMap("AnyInterRegionLink")
    public Boolean anyInterRegionLink;

    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("IsCdtCrossBorderEnabled")
    public Boolean isCdtCrossBorderEnabled;

    @NameInMap("IsCdtInterRegionEnabled")
    public Boolean isCdtInterRegionEnabled;

    @NameInMap("IsUserAllowedToCreateCrossBorderLink")
    public Boolean isUserAllowedToCreateCrossBorderLink;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckAddRegionToExpressConnectRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAddRegionToExpressConnectRouterResponseBody self = new CheckAddRegionToExpressConnectRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setAnyCrossBorderLink(Boolean anyCrossBorderLink) {
        this.anyCrossBorderLink = anyCrossBorderLink;
        return this;
    }
    public Boolean getAnyCrossBorderLink() {
        return this.anyCrossBorderLink;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setAnyInterRegionLink(Boolean anyInterRegionLink) {
        this.anyInterRegionLink = anyInterRegionLink;
        return this;
    }
    public Boolean getAnyInterRegionLink() {
        return this.anyInterRegionLink;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setIsCdtCrossBorderEnabled(Boolean isCdtCrossBorderEnabled) {
        this.isCdtCrossBorderEnabled = isCdtCrossBorderEnabled;
        return this;
    }
    public Boolean getIsCdtCrossBorderEnabled() {
        return this.isCdtCrossBorderEnabled;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setIsCdtInterRegionEnabled(Boolean isCdtInterRegionEnabled) {
        this.isCdtInterRegionEnabled = isCdtInterRegionEnabled;
        return this;
    }
    public Boolean getIsCdtInterRegionEnabled() {
        return this.isCdtInterRegionEnabled;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setIsUserAllowedToCreateCrossBorderLink(Boolean isUserAllowedToCreateCrossBorderLink) {
        this.isUserAllowedToCreateCrossBorderLink = isUserAllowedToCreateCrossBorderLink;
        return this;
    }
    public Boolean getIsUserAllowedToCreateCrossBorderLink() {
        return this.isUserAllowedToCreateCrossBorderLink;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAddRegionToExpressConnectRouterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
