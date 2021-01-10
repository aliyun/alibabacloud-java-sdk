// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsSignRequest extends TeaModel {
    @NameInMap("SignId")
    public String signId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsSignRequest self = new DescribeSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmsSignRequest setSignId(String signId) {
        this.signId = signId;
        return this;
    }
    public String getSignId() {
        return this.signId;
    }

    public DescribeSmsSignRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
