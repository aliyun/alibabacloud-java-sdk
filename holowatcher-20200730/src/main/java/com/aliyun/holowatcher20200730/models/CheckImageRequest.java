// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CheckImageRequest extends TeaModel {
    @NameInMap("ImagePath")
    public String imagePath;

    public static CheckImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckImageRequest self = new CheckImageRequest();
        return TeaModel.build(map, self);
    }

    public CheckImageRequest setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }
    public String getImagePath() {
        return this.imagePath;
    }

}
