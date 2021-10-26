// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // code checksum
    @NameInMap("x-fc-code-checksum")
    public String xFcCodeChecksum;

    public static CreateFunctionHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionHeaders self = new CreateFunctionHeaders();
        return TeaModel.build(map, self);
    }

    public CreateFunctionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateFunctionHeaders setXFcCodeChecksum(String xFcCodeChecksum) {
        this.xFcCodeChecksum = xFcCodeChecksum;
        return this;
    }
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

}
