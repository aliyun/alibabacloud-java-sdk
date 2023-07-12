// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaisEiRequest extends TeaModel {
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    @NameInMap("EiInstanceType")
    public String eiInstanceType;

    @NameInMap("RegionId")
    public String regionId;

    public static AttachEaisEiRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEaisEiRequest self = new AttachEaisEiRequest();
        return TeaModel.build(map, self);
    }

    public AttachEaisEiRequest setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public AttachEaisEiRequest setEiInstanceId(String eiInstanceId) {
        this.eiInstanceId = eiInstanceId;
        return this;
    }
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    public AttachEaisEiRequest setEiInstanceType(String eiInstanceType) {
        this.eiInstanceType = eiInstanceType;
        return this;
    }
    public String getEiInstanceType() {
        return this.eiInstanceType;
    }

    public AttachEaisEiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
