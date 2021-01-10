// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditNotifyConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeLiveAudioAuditNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditNotifyConfigRequest self = new DescribeLiveAudioAuditNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveAudioAuditNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
