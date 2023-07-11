// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserRasterDatasRequest extends TeaModel {
    @NameInMap("DataIds")
    public java.util.List<String> dataIds;

    public static DeleteUserRasterDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRasterDatasRequest self = new DeleteUserRasterDatasRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRasterDatasRequest setDataIds(java.util.List<String> dataIds) {
        this.dataIds = dataIds;
        return this;
    }
    public java.util.List<String> getDataIds() {
        return this.dataIds;
    }

}
