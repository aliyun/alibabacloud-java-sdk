// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceNavigatorInstancesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListCustomizedVoiceNavigatorInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoiceNavigatorInstancesRequest self = new ListCustomizedVoiceNavigatorInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoiceNavigatorInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
