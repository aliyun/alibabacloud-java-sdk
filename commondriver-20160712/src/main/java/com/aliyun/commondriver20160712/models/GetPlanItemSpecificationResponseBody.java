// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetPlanItemSpecificationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPlanItemSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlanItemSpecificationResponseBody self = new GetPlanItemSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlanItemSpecificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPlanItemSpecificationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetPlanItemSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPlanItemSpecificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
