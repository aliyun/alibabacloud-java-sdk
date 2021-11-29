// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeBlockedRegionsRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeBlockedRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockedRegionsRequest self = new DescribeBlockedRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockedRegionsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeBlockedRegionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
