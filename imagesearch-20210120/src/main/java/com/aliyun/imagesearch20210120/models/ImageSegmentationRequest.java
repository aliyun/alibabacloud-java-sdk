// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageSegmentationRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PicContent")
    public String picContent;

    @NameInMap("ReturnPicFormat")
    public String returnPicFormat;

    @NameInMap("ReturnPicType")
    public String returnPicType;

    public static ImageSegmentationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageSegmentationRequest self = new ImageSegmentationRequest();
        return TeaModel.build(map, self);
    }

    public ImageSegmentationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ImageSegmentationRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public ImageSegmentationRequest setReturnPicFormat(String returnPicFormat) {
        this.returnPicFormat = returnPicFormat;
        return this;
    }
    public String getReturnPicFormat() {
        return this.returnPicFormat;
    }

    public ImageSegmentationRequest setReturnPicType(String returnPicType) {
        this.returnPicType = returnPicType;
        return this;
    }
    public String getReturnPicType() {
        return this.returnPicType;
    }

}
