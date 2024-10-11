// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListExtraDataSourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UserCustomDataSource ItemCustomDataSource BehaviorCustomDataSource SampleCustomDataSource</p>
     */
    @NameInMap("type")
    public String type;

    public static ListExtraDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExtraDataSourcesRequest self = new ListExtraDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListExtraDataSourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
