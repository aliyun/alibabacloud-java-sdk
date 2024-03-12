// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListExpressConnectRouterSupportedRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
