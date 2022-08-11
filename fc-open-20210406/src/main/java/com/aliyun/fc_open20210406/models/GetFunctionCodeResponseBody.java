// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionCodeResponseBody extends TeaModel {
    @NameInMap("checksum")
    public String checksum;

    @NameInMap("url")
    public String url;

    public static GetFunctionCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCodeResponseBody self = new GetFunctionCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionCodeResponseBody setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public GetFunctionCodeResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
