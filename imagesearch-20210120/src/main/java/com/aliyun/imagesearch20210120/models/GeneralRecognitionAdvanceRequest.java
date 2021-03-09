// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class GeneralRecognitionAdvanceRequest extends TeaModel {
    @NameInMap("PicContentObject")
    @Validation(required = true)
    public java.io.InputStream picContentObject;

    @NameInMap("InstanceName")
    public String instanceName;

    public static GeneralRecognitionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneralRecognitionAdvanceRequest self = new GeneralRecognitionAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GeneralRecognitionAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public GeneralRecognitionAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
