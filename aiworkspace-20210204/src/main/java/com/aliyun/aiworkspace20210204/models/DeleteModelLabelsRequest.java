// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelLabelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    public static DeleteModelLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelLabelsRequest self = new DeleteModelLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

}
