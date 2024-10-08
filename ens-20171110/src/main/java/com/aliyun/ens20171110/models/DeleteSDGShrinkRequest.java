// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSDGShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the SDGs that you want to delete.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SDGId")
    public String SDGIdShrink;

    public static DeleteSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSDGShrinkRequest self = new DeleteSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSDGShrinkRequest setSDGIdShrink(String SDGIdShrink) {
        this.SDGIdShrink = SDGIdShrink;
        return this;
    }
    public String getSDGIdShrink() {
        return this.SDGIdShrink;
    }

}
