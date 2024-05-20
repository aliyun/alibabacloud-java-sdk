// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListDeleteListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Integer> ids;

    public static DsgWhiteListDeleteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListDeleteListRequest self = new DsgWhiteListDeleteListRequest();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListDeleteListRequest setIds(java.util.List<Integer> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

}
