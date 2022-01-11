// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ReserveDomainRequest extends TeaModel {
    @NameInMap("Channels")
    public java.util.List<String> channels;

    @NameInMap("DomainName")
    public String domainName;

    public static ReserveDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ReserveDomainRequest self = new ReserveDomainRequest();
        return TeaModel.build(map, self);
    }

    public ReserveDomainRequest setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public ReserveDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
