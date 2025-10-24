// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ActiveInteractionCreateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_1.jpg">https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_1.jpg</a></p>
     */
    @NameInMap("image")
    public String image;

    public static ActiveInteractionCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveInteractionCreateRequest self = new ActiveInteractionCreateRequest();
        return TeaModel.build(map, self);
    }

    public ActiveInteractionCreateRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
