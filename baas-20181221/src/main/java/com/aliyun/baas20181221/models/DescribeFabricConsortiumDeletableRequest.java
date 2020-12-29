// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumDeletableRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("Location")
    public String location;

    public static DescribeFabricConsortiumDeletableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumDeletableRequest self = new DescribeFabricConsortiumDeletableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumDeletableRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeFabricConsortiumDeletableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
