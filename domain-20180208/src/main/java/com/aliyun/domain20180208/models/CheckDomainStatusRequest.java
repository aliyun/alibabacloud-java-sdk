// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckDomainStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static CheckDomainStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainStatusRequest self = new CheckDomainStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckDomainStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
