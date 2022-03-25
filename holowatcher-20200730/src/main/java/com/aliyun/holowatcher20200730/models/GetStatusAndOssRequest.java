// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetStatusAndOssRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("body")
    public String body;

    public static GetStatusAndOssRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStatusAndOssRequest self = new GetStatusAndOssRequest();
        return TeaModel.build(map, self);
    }

    public GetStatusAndOssRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public GetStatusAndOssRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
