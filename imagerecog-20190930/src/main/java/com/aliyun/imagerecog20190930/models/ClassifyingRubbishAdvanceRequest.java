// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class ClassifyingRubbishAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static ClassifyingRubbishAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyingRubbishAdvanceRequest self = new ClassifyingRubbishAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
