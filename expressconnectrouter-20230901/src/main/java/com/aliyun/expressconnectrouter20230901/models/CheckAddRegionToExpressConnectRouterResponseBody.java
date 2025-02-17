// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CheckAddRegionToExpressConnectRouterResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether the ECR is used to establish connections between regions in the Chinese mainland and regions outside China. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AnyCrossBorderLink")
    public Boolean anyCrossBorderLink;

    /**
     * <p>Indicates whether the ECR is used to establish connections between regions in the Chinese mainland. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AnyInterRegionLink")
    public Boolean anyInterRegionLink;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in <strong>ErrMessage</strong>.</p>
     * <blockquote>
     * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsInstanceId</strong>, the request parameter <strong>DtsInstanceId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Indicates whether the cross-border CDT service is activated for the account to which the ECR belongs. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsCdtCrossBorderEnabled")
    public Boolean isCdtCrossBorderEnabled;

    /**
     * <p>Indicates whether the CDT service is activated for the account to which the ECR belongs. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsCdtInterRegionEnabled")
    public Boolean isCdtInterRegionEnabled;

    /**
     * <p>Indicates whether the account to which the ECR belongs can create cross-border connections. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsUserAllowedToCreateCrossBorderLink")
    public Boolean isUserAllowedToCreateCrossBorderLink;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
