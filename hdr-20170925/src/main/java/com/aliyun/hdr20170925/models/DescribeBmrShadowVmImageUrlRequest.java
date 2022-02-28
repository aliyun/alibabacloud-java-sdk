// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeBmrShadowVmImageUrlRequest extends TeaModel {
    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("ImageVersion")
    public String imageVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeBmrShadowVmImageUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBmrShadowVmImageUrlRequest self = new DescribeBmrShadowVmImageUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBmrShadowVmImageUrlRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public DescribeBmrShadowVmImageUrlRequest setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }
    public String getImageVersion() {
        return this.imageVersion;
    }

    public DescribeBmrShadowVmImageUrlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
