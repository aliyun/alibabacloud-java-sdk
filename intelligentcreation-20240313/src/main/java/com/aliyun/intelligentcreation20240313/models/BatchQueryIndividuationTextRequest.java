// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchQueryIndividuationTextRequest extends TeaModel {
    @NameInMap("textIdList")
    public java.util.List<String> textIdList;

    public static BatchQueryIndividuationTextRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryIndividuationTextRequest self = new BatchQueryIndividuationTextRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryIndividuationTextRequest setTextIdList(java.util.List<String> textIdList) {
        this.textIdList = textIdList;
        return this;
    }
    public java.util.List<String> getTextIdList() {
        return this.textIdList;
    }

}
