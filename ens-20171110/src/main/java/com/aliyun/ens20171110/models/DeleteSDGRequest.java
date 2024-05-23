// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSDGRequest extends TeaModel {
    /**
     * <p>IDs of SDGs that you want to delete. You can delete a maximum of 10 SDGs at a time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SDGId")
    public java.util.List<String> SDGId;

    public static DeleteSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSDGRequest self = new DeleteSDGRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSDGRequest setSDGId(java.util.List<String> SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public java.util.List<String> getSDGId() {
        return this.SDGId;
    }

}
