// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeKeypointXRayRequest extends TeaModel {
    @NameInMap("ImageUrl")
    @Validation(required = true)
    public String imageUrl;

    @NameInMap("DataFormat")
    @Validation(required = true)
    public String dataFormat;

    @NameInMap("OrgId")
    @Validation(required = true)
    public String orgId;

    @NameInMap("OrgName")
    @Validation(required = true)
    public String orgName;

    @NameInMap("TracerId")
    public String tracerId;

    public static DetectKneeKeypointXRayRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeKeypointXRayRequest self = new DetectKneeKeypointXRayRequest();
        return TeaModel.build(map, self);
    }

    public DetectKneeKeypointXRayRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetectKneeKeypointXRayRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectKneeKeypointXRayRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectKneeKeypointXRayRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectKneeKeypointXRayRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
