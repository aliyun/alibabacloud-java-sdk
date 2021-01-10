// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainTranscodeName")
    public String domainTranscodeName;

    public static DescribeLiveStreamTranscodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeInfoRequest self = new DescribeLiveStreamTranscodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamTranscodeInfoRequest setDomainTranscodeName(String domainTranscodeName) {
        this.domainTranscodeName = domainTranscodeName;
        return this;
    }
    public String getDomainTranscodeName() {
        return this.domainTranscodeName;
    }

}
