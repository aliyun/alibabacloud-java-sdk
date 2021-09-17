// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetByForeignIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ForeignId")
    public String foreignId;

    @NameInMap("SourceId")
    public Long sourceId;

    public static GetByForeignIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetByForeignIdRequest self = new GetByForeignIdRequest();
        return TeaModel.build(map, self);
    }

    public GetByForeignIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetByForeignIdRequest setForeignId(String foreignId) {
        this.foreignId = foreignId;
        return this;
    }
    public String getForeignId() {
        return this.foreignId;
    }

    public GetByForeignIdRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

}
