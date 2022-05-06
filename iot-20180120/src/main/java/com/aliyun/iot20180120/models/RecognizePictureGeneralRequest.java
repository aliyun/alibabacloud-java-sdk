// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RecognizePictureGeneralRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    public static RecognizePictureGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePictureGeneralRequest self = new RecognizePictureGeneralRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePictureGeneralRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
