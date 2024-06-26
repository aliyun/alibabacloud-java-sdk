// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCandidateOrganizationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DescribeCandidateOrganizations</p>
     */
    @NameInMap("Location")
    public String location;

    public static DescribeCandidateOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCandidateOrganizationsRequest self = new DescribeCandidateOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCandidateOrganizationsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
