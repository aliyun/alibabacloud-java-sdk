// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumMembersRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("Location")
    public String location;

    public static DescribeFabricConsortiumMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumMembersRequest self = new DescribeFabricConsortiumMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumMembersRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeFabricConsortiumMembersRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
