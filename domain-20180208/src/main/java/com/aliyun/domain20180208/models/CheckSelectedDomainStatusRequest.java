// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckSelectedDomainStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    public static CheckSelectedDomainStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSelectedDomainStatusRequest self = new CheckSelectedDomainStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckSelectedDomainStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
