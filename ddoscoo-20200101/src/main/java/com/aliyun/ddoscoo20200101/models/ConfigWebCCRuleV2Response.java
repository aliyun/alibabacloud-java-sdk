// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCRuleV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigWebCCRuleV2ResponseBody body;

    public static ConfigWebCCRuleV2Response build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebCCRuleV2Response self = new ConfigWebCCRuleV2Response();
        return TeaModel.build(map, self);
    }

    public ConfigWebCCRuleV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigWebCCRuleV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigWebCCRuleV2Response setBody(ConfigWebCCRuleV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigWebCCRuleV2ResponseBody getBody() {
        return this.body;
    }

}
