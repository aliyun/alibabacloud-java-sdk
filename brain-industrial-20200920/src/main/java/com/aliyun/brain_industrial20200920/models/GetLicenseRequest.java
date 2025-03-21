// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetLicenseRequest extends TeaModel {
    /**
     * <p>ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>c31238fcb74e482588a72de90cd7dba3</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseRequest self = new GetLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetLicenseRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetLicenseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
