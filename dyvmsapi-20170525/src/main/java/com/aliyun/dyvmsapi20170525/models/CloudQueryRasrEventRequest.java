// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryRasrEventRequest extends TeaModel {
    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>通话唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uniq_1-162046xxxx.12</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    public static CloudQueryRasrEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryRasrEventRequest self = new CloudQueryRasrEventRequest();
        return TeaModel.build(map, self);
    }

    public CloudQueryRasrEventRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudQueryRasrEventRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
