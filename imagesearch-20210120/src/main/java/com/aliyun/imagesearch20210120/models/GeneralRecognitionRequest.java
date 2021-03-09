// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class GeneralRecognitionRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PicContent")
    public String picContent;

    public static GeneralRecognitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneralRecognitionRequest self = new GeneralRecognitionRequest();
        return TeaModel.build(map, self);
    }

    public GeneralRecognitionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GeneralRecognitionRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

}
