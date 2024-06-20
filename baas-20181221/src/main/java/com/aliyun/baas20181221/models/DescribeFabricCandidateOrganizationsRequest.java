// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricCandidateOrganizationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    public static DescribeFabricCandidateOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricCandidateOrganizationsRequest self = new DescribeFabricCandidateOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricCandidateOrganizationsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
