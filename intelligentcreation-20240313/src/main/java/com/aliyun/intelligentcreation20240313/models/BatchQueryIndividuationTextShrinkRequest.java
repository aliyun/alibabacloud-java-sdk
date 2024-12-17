// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchQueryIndividuationTextShrinkRequest extends TeaModel {
    @NameInMap("textIdList")
    public String textIdListShrink;

    public static BatchQueryIndividuationTextShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryIndividuationTextShrinkRequest self = new BatchQueryIndividuationTextShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryIndividuationTextShrinkRequest setTextIdListShrink(String textIdListShrink) {
        this.textIdListShrink = textIdListShrink;
        return this;
    }
    public String getTextIdListShrink() {
        return this.textIdListShrink;
    }

}
