// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kubenest20220525.models;

import com.aliyun.tea.*;

public class ListAppInfoRequest extends TeaModel {
    @NameInMap("labels")
    public String labels;

    public static ListAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoRequest self = new ListAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInfoRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

}
