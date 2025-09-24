// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListFeaturesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PaiConsole:IntegrateWithWorkspace</p>
     */
    @NameInMap("Names")
    public String names;

    public static ListFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeaturesRequest self = new ListFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListFeaturesRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

}
