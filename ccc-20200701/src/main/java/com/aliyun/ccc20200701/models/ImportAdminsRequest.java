// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportAdminsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A list of UIDs for Alibaba Cloud RAM accounts. The value must be a string-encoded JSON array. The array supports up to 20 UIDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;26972543893791****&quot;]</p>
     */
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
