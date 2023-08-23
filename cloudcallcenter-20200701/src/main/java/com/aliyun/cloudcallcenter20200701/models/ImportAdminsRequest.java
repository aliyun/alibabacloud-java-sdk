// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ImportAdminsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RamIdList")
    public String ramIdList;

    public static ImportAdminsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAdminsRequest self = new ImportAdminsRequest();
        return TeaModel.build(map, self);
    }

    public ImportAdminsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportAdminsRequest setRamIdList(String ramIdList) {
        this.ramIdList = ramIdList;
        return this;
    }
    public String getRamIdList() {
        return this.ramIdList;
    }

}
