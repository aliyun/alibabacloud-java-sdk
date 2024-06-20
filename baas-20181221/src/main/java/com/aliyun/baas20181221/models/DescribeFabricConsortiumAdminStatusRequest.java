// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumAdminStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    public static DescribeFabricConsortiumAdminStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumAdminStatusRequest self = new DescribeFabricConsortiumAdminStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumAdminStatusRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
