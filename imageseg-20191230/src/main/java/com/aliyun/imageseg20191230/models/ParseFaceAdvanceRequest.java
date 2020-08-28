// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ParseFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static ParseFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseFaceAdvanceRequest self = new ParseFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
