// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class GrayReleaseDemoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Year")
    public String year;

    public static GrayReleaseDemoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrayReleaseDemoResponseBody self = new GrayReleaseDemoResponseBody();
        return TeaModel.build(map, self);
    }

    public GrayReleaseDemoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GrayReleaseDemoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrayReleaseDemoResponseBody setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

}
