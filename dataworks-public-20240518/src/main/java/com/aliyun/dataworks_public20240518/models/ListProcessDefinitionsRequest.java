// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProcessDefinitionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListProcessDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProcessDefinitionsRequest self = new ListProcessDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProcessDefinitionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
