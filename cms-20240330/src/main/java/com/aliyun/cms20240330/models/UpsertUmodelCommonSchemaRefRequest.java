// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpsertUmodelCommonSchemaRefRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>card-service-daily01</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1.0</p>
     */
    @NameInMap("version")
    public String version;

    public static UpsertUmodelCommonSchemaRefRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertUmodelCommonSchemaRefRequest self = new UpsertUmodelCommonSchemaRefRequest();
        return TeaModel.build(map, self);
    }

    public UpsertUmodelCommonSchemaRefRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UpsertUmodelCommonSchemaRefRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
