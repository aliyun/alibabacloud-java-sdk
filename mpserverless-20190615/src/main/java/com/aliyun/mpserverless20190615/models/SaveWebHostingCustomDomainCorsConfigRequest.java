// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWebHostingCustomDomainCorsConfigRequest extends TeaModel {
    @NameInMap("AccessControlAllowOrigin")
    public String accessControlAllowOrigin;

    @NameInMap("AccessOriginControl")
    public Boolean accessOriginControl;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EnableCors")
    public Boolean enableCors;

    @NameInMap("SpaceId")
    public String spaceId;

    public static SaveWebHostingCustomDomainCorsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWebHostingCustomDomainCorsConfigRequest self = new SaveWebHostingCustomDomainCorsConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveWebHostingCustomDomainCorsConfigRequest setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }
    public String getAccessControlAllowOrigin() {
        return this.accessControlAllowOrigin;
    }

    public SaveWebHostingCustomDomainCorsConfigRequest setAccessOriginControl(Boolean accessOriginControl) {
        this.accessOriginControl = accessOriginControl;
        return this;
    }
    public Boolean getAccessOriginControl() {
        return this.accessOriginControl;
    }

    public SaveWebHostingCustomDomainCorsConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveWebHostingCustomDomainCorsConfigRequest setEnableCors(Boolean enableCors) {
        this.enableCors = enableCors;
        return this;
    }
    public Boolean getEnableCors() {
        return this.enableCors;
    }

    public SaveWebHostingCustomDomainCorsConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
