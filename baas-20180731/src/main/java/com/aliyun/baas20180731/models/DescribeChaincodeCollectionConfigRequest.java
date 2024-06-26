// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChaincodeCollectionConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("Location")
    public String location;

    public static DescribeChaincodeCollectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChaincodeCollectionConfigRequest self = new DescribeChaincodeCollectionConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChaincodeCollectionConfigRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public DescribeChaincodeCollectionConfigRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
