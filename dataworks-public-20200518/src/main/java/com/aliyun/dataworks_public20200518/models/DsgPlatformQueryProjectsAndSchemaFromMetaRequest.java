// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgPlatformQueryProjectsAndSchemaFromMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EngineName")
    public String engineName;

    public static DsgPlatformQueryProjectsAndSchemaFromMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgPlatformQueryProjectsAndSchemaFromMetaRequest self = new DsgPlatformQueryProjectsAndSchemaFromMetaRequest();
        return TeaModel.build(map, self);
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaRequest setEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    public String getEngineName() {
        return this.engineName;
    }

}
