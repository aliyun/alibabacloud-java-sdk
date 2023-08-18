// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ExpandClusterRequest extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("model")
    public String model;

    @NameInMap("userVSwitch")
    public String userVSwitch;

    public static ExpandClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandClusterRequest self = new ExpandClusterRequest();
        return TeaModel.build(map, self);
    }

    public ExpandClusterRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ExpandClusterRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExpandClusterRequest setUserVSwitch(String userVSwitch) {
        this.userVSwitch = userVSwitch;
        return this;
    }
    public String getUserVSwitch() {
        return this.userVSwitch;
    }

}
