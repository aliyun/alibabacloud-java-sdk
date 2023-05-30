// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListEventSourcesRequest extends TeaModel {
    /**
     * <p>$.parameters[7].schema.example</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static ListEventSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventSourcesRequest self = new ListEventSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListEventSourcesRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
