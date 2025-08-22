// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteCustomDomainSampleRateRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNames;

    public static DeleteCustomDomainSampleRateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomDomainSampleRateRequest self = new DeleteCustomDomainSampleRateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomDomainSampleRateRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

}
