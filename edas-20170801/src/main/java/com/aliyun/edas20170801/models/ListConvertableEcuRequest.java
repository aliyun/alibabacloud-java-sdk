// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConvertableEcuRequest extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    public static ListConvertableEcuRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConvertableEcuRequest self = new ListConvertableEcuRequest();
        return TeaModel.build(map, self);
    }

    public ListConvertableEcuRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
