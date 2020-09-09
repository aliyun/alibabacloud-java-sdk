// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectHipKeypointXRayAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

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

    public static DetectHipKeypointXRayAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectHipKeypointXRayAdvanceRequest self = new DetectHipKeypointXRayAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectHipKeypointXRayAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public DetectHipKeypointXRayAdvanceRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectHipKeypointXRayAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectHipKeypointXRayAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectHipKeypointXRayAdvanceRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
