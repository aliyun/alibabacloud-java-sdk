// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingResponseBody extends TeaModel {
    // 图片裁剪结果
    @NameInMap("Croppings")
    public java.util.List<CroppingSuggestion> croppings;

    // 请求唯一ID
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageCroppingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCroppingResponseBody self = new DetectImageCroppingResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageCroppingResponseBody setCroppings(java.util.List<CroppingSuggestion> croppings) {
        this.croppings = croppings;
        return this;
    }
    public java.util.List<CroppingSuggestion> getCroppings() {
        return this.croppings;
    }

    public DetectImageCroppingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
