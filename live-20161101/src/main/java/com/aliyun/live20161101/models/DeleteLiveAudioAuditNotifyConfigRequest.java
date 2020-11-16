// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditNotifyConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DeleteLiveAudioAuditNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAudioAuditNotifyConfigRequest self = new DeleteLiveAudioAuditNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAudioAuditNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
