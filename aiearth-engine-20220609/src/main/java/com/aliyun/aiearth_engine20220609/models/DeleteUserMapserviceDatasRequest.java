// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserMapserviceDatasRequest extends TeaModel {
    @NameInMap("DataIds")
    public java.util.List<String> dataIds;

    public static DeleteUserMapserviceDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserMapserviceDatasRequest self = new DeleteUserMapserviceDatasRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserMapserviceDatasRequest setDataIds(java.util.List<String> dataIds) {
        this.dataIds = dataIds;
        return this;
    }
    public java.util.List<String> getDataIds() {
        return this.dataIds;
    }

}
