// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DeleteSecurityEventMarkMissListRequest extends TeaModel {
    /**
     * <p>The list of alert whitelist rule IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static DeleteSecurityEventMarkMissListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityEventMarkMissListRequest self = new DeleteSecurityEventMarkMissListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityEventMarkMissListRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
