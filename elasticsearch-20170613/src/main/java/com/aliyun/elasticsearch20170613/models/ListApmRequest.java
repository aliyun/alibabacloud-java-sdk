// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListApmRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("esInstanceId")
    public String esInstanceId;

    public static ListApmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApmRequest self = new ListApmRequest();
        return TeaModel.build(map, self);
    }

    public ListApmRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListApmRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApmRequest setEsInstanceId(String esInstanceId) {
        this.esInstanceId = esInstanceId;
        return this;
    }
    public String getEsInstanceId() {
        return this.esInstanceId;
    }

}
