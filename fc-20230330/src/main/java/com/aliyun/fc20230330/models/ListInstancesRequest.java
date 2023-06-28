// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("withAllActive")
    public Boolean withAllActive;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListInstancesRequest setWithAllActive(Boolean withAllActive) {
        this.withAllActive = withAllActive;
        return this;
    }
    public Boolean getWithAllActive() {
        return this.withAllActive;
    }

}
