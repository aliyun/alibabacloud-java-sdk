// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageSegmentationAdvanceRequest extends TeaModel {
    @NameInMap("PicContentObject")
    @Validation(required = true)
    public java.io.InputStream picContentObject;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("ReturnPicFormat")
    public String returnPicFormat;

    @NameInMap("ReturnPicType")
    public String returnPicType;

    public static ImageSegmentationAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageSegmentationAdvanceRequest self = new ImageSegmentationAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ImageSegmentationAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public ImageSegmentationAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ImageSegmentationAdvanceRequest setReturnPicFormat(String returnPicFormat) {
        this.returnPicFormat = returnPicFormat;
        return this;
    }
    public String getReturnPicFormat() {
        return this.returnPicFormat;
    }

    public ImageSegmentationAdvanceRequest setReturnPicType(String returnPicType) {
        this.returnPicType = returnPicType;
        return this;
    }
    public String getReturnPicType() {
        return this.returnPicType;
    }

}
