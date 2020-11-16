// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditNotifyConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLiveAudioAuditNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditNotifyConfigRequest self = new DescribeLiveAudioAuditNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
