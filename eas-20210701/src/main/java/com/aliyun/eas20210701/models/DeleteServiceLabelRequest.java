// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceLabelRequest extends TeaModel {
    /**
     * <p>The service tags that you want to delete.</p>
     */
    @NameInMap("Keys")
    public java.util.List<String> keys;

    public static DeleteServiceLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLabelRequest self = new DeleteServiceLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLabelRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

}
