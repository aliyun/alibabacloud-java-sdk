// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelVersionLabelsRequest extends TeaModel {
    /**
     * <p>The keys of the labels that you want to delete. Separate multiple keys with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    public static DeleteModelVersionLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelVersionLabelsRequest self = new DeleteModelVersionLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelVersionLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

}
