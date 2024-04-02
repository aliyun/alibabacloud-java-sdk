// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditItemDetailResponseBody extends TeaModel {
    @NameInMap("ApiResult")
    public String apiResult;

    @NameInMap("ApiRiskType")
    public String apiRiskType;

    @NameInMap("ApiTs")
    public String apiTs;

    @NameInMap("NewUrl")
    public String newUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuditItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditItemDetailResponseBody self = new GetAuditItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditItemDetailResponseBody setApiResult(String apiResult) {
        this.apiResult = apiResult;
        return this;
    }
    public String getApiResult() {
        return this.apiResult;
    }

    public GetAuditItemDetailResponseBody setApiRiskType(String apiRiskType) {
        this.apiRiskType = apiRiskType;
        return this;
    }
    public String getApiRiskType() {
        return this.apiRiskType;
    }

    public GetAuditItemDetailResponseBody setApiTs(String apiTs) {
        this.apiTs = apiTs;
        return this;
    }
    public String getApiTs() {
        return this.apiTs;
    }

    public GetAuditItemDetailResponseBody setNewUrl(String newUrl) {
        this.newUrl = newUrl;
        return this;
    }
    public String getNewUrl() {
        return this.newUrl;
    }

    public GetAuditItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
