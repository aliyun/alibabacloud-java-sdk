// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceMakeupRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("MakeupType")
    @Validation(required = true)
    public String makeupType;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("Strength")
    @Validation(required = true)
    public Float strength;

    public static FaceMakeupRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceMakeupRequest self = new FaceMakeupRequest();
        return TeaModel.build(map, self);
    }

    public FaceMakeupRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public FaceMakeupRequest setMakeupType(String makeupType) {
        this.makeupType = makeupType;
        return this;
    }
    public String getMakeupType() {
        return this.makeupType;
    }

    public FaceMakeupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public FaceMakeupRequest setStrength(Float strength) {
        this.strength = strength;
        return this;
    }
    public Float getStrength() {
        return this.strength;
    }

}
