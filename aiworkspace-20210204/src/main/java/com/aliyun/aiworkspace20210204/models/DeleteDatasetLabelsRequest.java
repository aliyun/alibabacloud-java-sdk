// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetLabelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    public static DeleteDatasetLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetLabelsRequest self = new DeleteDatasetLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

}
