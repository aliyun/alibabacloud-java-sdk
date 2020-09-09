// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectHipKeypointXRayRequest extends TeaModel {
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

    public static DetectHipKeypointXRayRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectHipKeypointXRayRequest self = new DetectHipKeypointXRayRequest();
        return TeaModel.build(map, self);
    }

    public DetectHipKeypointXRayRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetectHipKeypointXRayRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectHipKeypointXRayRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectHipKeypointXRayRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectHipKeypointXRayRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
