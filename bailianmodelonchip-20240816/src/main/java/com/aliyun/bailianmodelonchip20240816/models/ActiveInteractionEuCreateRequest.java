// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ActiveInteractionEuCreateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_12.jpg">https://linkscreen-daily.oss-cn-hangzhou.aliyuncs.com/mock/251023/a_person_12.jpg</a></p>
     */
    @NameInMap("image")
    public String image;

    public static ActiveInteractionEuCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveInteractionEuCreateRequest self = new ActiveInteractionEuCreateRequest();
        return TeaModel.build(map, self);
    }

    public ActiveInteractionEuCreateRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
