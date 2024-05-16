// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class OpenCdnServiceRequest extends TeaModel {
    /**
     * <p>The metering method of Alibaba Cloud CDN. A value of **PayByTraffic** indicates that the metering method is pay-by-data-transfer.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static OpenCdnServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCdnServiceRequest self = new OpenCdnServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenCdnServiceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public OpenCdnServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenCdnServiceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
