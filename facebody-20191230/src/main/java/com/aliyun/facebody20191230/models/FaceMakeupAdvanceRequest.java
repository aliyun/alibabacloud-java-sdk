// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceMakeupAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("MakeupType")
    @Validation(required = true)
    public String makeupType;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("Strength")
    @Validation(required = true)
    public Float strength;

    public static FaceMakeupAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceMakeupAdvanceRequest self = new FaceMakeupAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public FaceMakeupAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public FaceMakeupAdvanceRequest setMakeupType(String makeupType) {
        this.makeupType = makeupType;
        return this;
    }
    public String getMakeupType() {
        return this.makeupType;
    }

    public FaceMakeupAdvanceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public FaceMakeupAdvanceRequest setStrength(Float strength) {
        this.strength = strength;
        return this;
    }
    public Float getStrength() {
        return this.strength;
    }

}
