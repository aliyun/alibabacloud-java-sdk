// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeSkillRequest extends TeaModel {
    /**
     * <p>Historical version number</p>
     * 
     * <strong>example:</strong>
     * <p>1770386951147366810</p>
     */
    @NameInMap("version")
    public String version;

    public static GetDigitalEmployeeSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeSkillRequest self = new GetDigitalEmployeeSkillRequest();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeSkillRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
