// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class GetListActionsByServiceCodesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("SupportedActions")
    public java.util.List<String> supportedActions;

    public static GetListActionsByServiceCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListActionsByServiceCodesResponseBody self = new GetListActionsByServiceCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListActionsByServiceCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListActionsByServiceCodesResponseBody setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetListActionsByServiceCodesResponseBody setSupportedActions(java.util.List<String> supportedActions) {
        this.supportedActions = supportedActions;
        return this;
    }
    public java.util.List<String> getSupportedActions() {
        return this.supportedActions;
    }

}
