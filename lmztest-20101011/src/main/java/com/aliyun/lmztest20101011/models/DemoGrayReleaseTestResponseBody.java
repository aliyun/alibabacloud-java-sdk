// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGrayReleaseTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public java.util.Map<String, String> code;

    @NameInMap("Name")
    public String name;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DemoGrayReleaseTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoGrayReleaseTestResponseBody self = new DemoGrayReleaseTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoGrayReleaseTestResponseBody setCode(java.util.Map<String, String> code) {
        this.code = code;
        return this;
    }
    public java.util.Map<String, String> getCode() {
        return this.code;
    }

    public DemoGrayReleaseTestResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DemoGrayReleaseTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
