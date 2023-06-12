// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RegisterLineageRelationShrinkRequest extends TeaModel {
    @NameInMap("LineageRelationRegisterVO")
    public String lineageRelationRegisterVOShrink;

    public static RegisterLineageRelationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterLineageRelationShrinkRequest self = new RegisterLineageRelationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RegisterLineageRelationShrinkRequest setLineageRelationRegisterVOShrink(String lineageRelationRegisterVOShrink) {
        this.lineageRelationRegisterVOShrink = lineageRelationRegisterVOShrink;
        return this;
    }
    public String getLineageRelationRegisterVOShrink() {
        return this.lineageRelationRegisterVOShrink;
    }

}
