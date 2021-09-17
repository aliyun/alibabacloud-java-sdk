// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPhoneNoAByTrackNoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("trackNo")
    public String trackNo;

    @NameInMap("CabinetNo")
    public String cabinetNo;

    @NameInMap("PhoneNoX")
    public String phoneNoX;

    public static QueryPhoneNoAByTrackNoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNoAByTrackNoRequest self = new QueryPhoneNoAByTrackNoRequest();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNoAByTrackNoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryPhoneNoAByTrackNoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryPhoneNoAByTrackNoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryPhoneNoAByTrackNoRequest setTrackNo(String trackNo) {
        this.trackNo = trackNo;
        return this;
    }
    public String getTrackNo() {
        return this.trackNo;
    }

    public QueryPhoneNoAByTrackNoRequest setCabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo;
        return this;
    }
    public String getCabinetNo() {
        return this.cabinetNo;
    }

    public QueryPhoneNoAByTrackNoRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

}
