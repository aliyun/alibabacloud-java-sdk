// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDRApplianceUrlRequest extends TeaModel {
    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDRApplianceUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDRApplianceUrlRequest self = new DescribeDRApplianceUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDRApplianceUrlRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeDRApplianceUrlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
