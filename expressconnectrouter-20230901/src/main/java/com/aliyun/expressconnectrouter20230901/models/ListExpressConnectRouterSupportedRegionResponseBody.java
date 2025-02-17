// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListExpressConnectRouterSupportedRegionResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <li>True</li>
     * <li>False</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The regions in which the ECR feature is activated.</p>
     */
    @NameInMap("SupportedRegionIdList")
    public java.util.List<String> supportedRegionIdList;

    public static ListExpressConnectRouterSupportedRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExpressConnectRouterSupportedRegionResponseBody self = new ListExpressConnectRouterSupportedRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExpressConnectRouterSupportedRegionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListExpressConnectRouterSupportedRegionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListExpressConnectRouterSupportedRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExpressConnectRouterSupportedRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExpressConnectRouterSupportedRegionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListExpressConnectRouterSupportedRegionResponseBody setSupportedRegionIdList(java.util.List<String> supportedRegionIdList) {
        this.supportedRegionIdList = supportedRegionIdList;
        return this;
    }
    public java.util.List<String> getSupportedRegionIdList() {
        return this.supportedRegionIdList;
    }

}
