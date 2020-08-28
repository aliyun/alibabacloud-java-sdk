// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("NumBoxes")
    public Integer numBoxes;

    public static IntelligentCompositionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionAdvanceRequest self = new IntelligentCompositionAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
