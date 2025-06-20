// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineTypesRequest extends TeaModel {
    /**
     * <p>The name of the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("Name")
    public String name;

    public static ListMachineTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMachineTypesRequest self = new ListMachineTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListMachineTypesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
