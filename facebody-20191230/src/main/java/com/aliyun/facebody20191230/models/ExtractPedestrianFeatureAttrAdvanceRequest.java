// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttrAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static ExtractPedestrianFeatureAttrAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttrAdvanceRequest self = new ExtractPedestrianFeatureAttrAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttrAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public ExtractPedestrianFeatureAttrAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ExtractPedestrianFeatureAttrAdvanceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
