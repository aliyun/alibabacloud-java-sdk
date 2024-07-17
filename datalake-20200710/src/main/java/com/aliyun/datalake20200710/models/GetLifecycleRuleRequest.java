// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLifecycleRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LCRU-17E7192705C365C0</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>demo_catalog_id.demo_db_name.demo_table_name</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    public static GetLifecycleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLifecycleRuleRequest self = new GetLifecycleRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetLifecycleRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetLifecycleRuleRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

}
