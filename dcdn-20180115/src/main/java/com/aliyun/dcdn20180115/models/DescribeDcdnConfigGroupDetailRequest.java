// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnConfigGroupDetailRequest extends TeaModel {
    @NameInMap("ConfigGroupId")
    public String configGroupId;

    @NameInMap("ConfigGroupName")
    public String configGroupName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnConfigGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnConfigGroupDetailRequest self = new DescribeDcdnConfigGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnConfigGroupDetailRequest setConfigGroupId(String configGroupId) {
        this.configGroupId = configGroupId;
        return this;
    }
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    public DescribeDcdnConfigGroupDetailRequest setConfigGroupName(String configGroupName) {
        this.configGroupName = configGroupName;
        return this;
    }
    public String getConfigGroupName() {
        return this.configGroupName;
    }

    public DescribeDcdnConfigGroupDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
