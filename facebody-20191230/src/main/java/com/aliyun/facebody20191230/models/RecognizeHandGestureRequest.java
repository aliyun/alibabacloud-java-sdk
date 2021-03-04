// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeHandGestureRequest extends TeaModel {
    // A short description of struct
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("GestureType")
    public String gestureType;

    public static RecognizeHandGestureRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHandGestureRequest self = new RecognizeHandGestureRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeHandGestureRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RecognizeHandGestureRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeHandGestureRequest setGestureType(String gestureType) {
        this.gestureType = gestureType;
        return this;
    }
    public String getGestureType() {
        return this.gestureType;
    }

}
