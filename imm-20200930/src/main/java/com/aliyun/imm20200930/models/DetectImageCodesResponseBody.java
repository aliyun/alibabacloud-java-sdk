// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCodesResponseBody extends TeaModel {
    @NameInMap("Codes")
    public java.util.List<Codes> codes;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCodesResponseBody self = new DetectImageCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageCodesResponseBody setCodes(java.util.List<Codes> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.List<Codes> getCodes() {
        return this.codes;
    }

    public DetectImageCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
