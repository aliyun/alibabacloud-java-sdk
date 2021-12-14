// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Query400QualificationDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static Query400QualificationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Query400QualificationDetailResponseBody self = new Query400QualificationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public Query400QualificationDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Query400QualificationDetailResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public Query400QualificationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
