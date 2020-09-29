// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSkinDiseaseRequest extends TeaModel {
    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    @NameInMap("OrgId")
    @Validation(required = true)
    public String orgId;

    @NameInMap("OrgName")
    @Validation(required = true)
    public String orgName;

    public static DetectSkinDiseaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectSkinDiseaseRequest self = new DetectSkinDiseaseRequest();
        return TeaModel.build(map, self);
    }

    public DetectSkinDiseaseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DetectSkinDiseaseRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectSkinDiseaseRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

}
