// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class CountNormalCorpIdentifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CountNormalCorpIdentifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountNormalCorpIdentifyResponseBody self = new CountNormalCorpIdentifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CountNormalCorpIdentifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CountNormalCorpIdentifyResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CountNormalCorpIdentifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
