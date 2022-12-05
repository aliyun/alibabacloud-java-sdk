// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamAuthCheckingRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Url")
    public String url;

    public static DescribeLiveStreamAuthCheckingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamAuthCheckingRequest self = new DescribeLiveStreamAuthCheckingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamAuthCheckingRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamAuthCheckingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamAuthCheckingRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
