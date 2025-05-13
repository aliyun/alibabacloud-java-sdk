// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class RumDnsResponse extends TeaModel {
    @NameInMap("domain")
    public String domain;

    @NameInMap("message")
    public String message;

    @NameInMap("result")
    public Boolean result;

    public static RumDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        RumDnsResponse self = new RumDnsResponse();
        return TeaModel.build(map, self);
    }

    public RumDnsResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public RumDnsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RumDnsResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
