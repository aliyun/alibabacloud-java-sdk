// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeHandGestureAdvanceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GestureType")
    public String gestureType;

    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RecognizeHandGestureAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHandGestureAdvanceRequest self = new RecognizeHandGestureAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeHandGestureAdvanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RecognizeHandGestureAdvanceRequest setGestureType(String gestureType) {
        this.gestureType = gestureType;
        return this;
    }
    public String getGestureType() {
        return this.gestureType;
    }

    public RecognizeHandGestureAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
