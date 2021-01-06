// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeXRayRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("OrgId")
    public String orgId;

    public static DetectKneeXRayRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeXRayRequest self = new DetectKneeXRayRequest();
        return TeaModel.build(map, self);
    }

    public DetectKneeXRayRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DetectKneeXRayRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectKneeXRayRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectKneeXRayRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
