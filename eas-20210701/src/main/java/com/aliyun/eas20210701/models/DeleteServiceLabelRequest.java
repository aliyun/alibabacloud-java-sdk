// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceLabelRequest extends TeaModel {
    /**
     * <p>The keys of the service labels that you want to delete. This parameter is deprecated. Use the LabelKeys parameter instead.</p>
     */
    @NameInMap("Keys")
    @Deprecated
    public java.util.List<String> keys;

    /**
     * <p>The keys of the service labels that you want to delete.</p>
     */
    @NameInMap("LabelKeys")
    public java.util.List<String> labelKeys;

    public static DeleteServiceLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLabelRequest self = new DeleteServiceLabelRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DeleteServiceLabelRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public DeleteServiceLabelRequest setLabelKeys(java.util.List<String> labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public java.util.List<String> getLabelKeys() {
        return this.labelKeys;
    }

}
