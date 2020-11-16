// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLiveStreamTranscodeStreamNumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeStreamNumRequest self = new DescribeLiveStreamTranscodeStreamNumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeStreamNumRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
