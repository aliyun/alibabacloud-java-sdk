// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecMetaDataComponentNameRequest extends TeaModel {
    /**
     * <p>The datasource name to check. The system performs an exact match against non-deleted datasources under the current tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>test_ds318_hangzhou_0428</p>
     */
    @NameInMap("dsName")
    public String dsName;

    public static ExecMetaDataComponentNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecMetaDataComponentNameRequest self = new ExecMetaDataComponentNameRequest();
        return TeaModel.build(map, self);
    }

    public ExecMetaDataComponentNameRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

}
