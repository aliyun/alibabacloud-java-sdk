// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class ClassifyingRubbishRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static ClassifyingRubbishRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyingRubbishRequest self = new ClassifyingRubbishRequest();
        return TeaModel.build(map, self);
    }

}
