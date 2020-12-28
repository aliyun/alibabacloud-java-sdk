// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInstalledSoftwareRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListInstalledSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstalledSoftwareRequest self = new ListInstalledSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public ListInstalledSoftwareRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
