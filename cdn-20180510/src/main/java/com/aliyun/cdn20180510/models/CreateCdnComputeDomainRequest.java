// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnComputeDomainRequest extends TeaModel {
    @NameInMap("Coverage")
    public String coverage;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateCdnComputeDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnComputeDomainRequest self = new CreateCdnComputeDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnComputeDomainRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public CreateCdnComputeDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCdnComputeDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
