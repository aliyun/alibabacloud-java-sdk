// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgPlatformQueryProjectsAndSchemaFromMetaRequest extends TeaModel {
    /**
     * <p>The type of the compute engine. Valid values:</p>
     * <ul>
     * <li>ODPS.ODPS</li>
     * <li>EMR</li>
     * <li>HOLO.POSTGRES</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR</p>
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
