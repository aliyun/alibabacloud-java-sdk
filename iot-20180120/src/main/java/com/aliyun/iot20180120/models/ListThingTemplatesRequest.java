// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingTemplatesRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static ListThingTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListThingTemplatesRequest self = new ListThingTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListThingTemplatesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
