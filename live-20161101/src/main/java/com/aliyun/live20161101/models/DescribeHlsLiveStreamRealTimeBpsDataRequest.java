// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeHlsLiveStreamRealTimeBpsDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Time")
    public String time;

    public static DescribeHlsLiveStreamRealTimeBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHlsLiveStreamRealTimeBpsDataRequest self = new DescribeHlsLiveStreamRealTimeBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHlsLiveStreamRealTimeBpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeHlsLiveStreamRealTimeBpsDataRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
