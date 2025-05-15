// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListWorkloadsRequest extends TeaModel {
    /**
     * <p>Scope</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static ListWorkloadsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkloadsRequest self = new ListWorkloadsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkloadsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
