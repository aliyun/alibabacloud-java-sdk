// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteIndividuationTextRequest extends TeaModel {
    @NameInMap("textIdList")
    public java.util.List<String> textIdList;

    public static DeleteIndividuationTextRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndividuationTextRequest self = new DeleteIndividuationTextRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIndividuationTextRequest setTextIdList(java.util.List<String> textIdList) {
        this.textIdList = textIdList;
        return this;
    }
    public java.util.List<String> getTextIdList() {
        return this.textIdList;
    }

}
