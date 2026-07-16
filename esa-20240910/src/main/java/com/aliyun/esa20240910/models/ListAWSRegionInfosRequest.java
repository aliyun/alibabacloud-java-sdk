// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListAWSRegionInfosRequest extends TeaModel {
    /**
     * <p>The name of the metadata to query.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static ListAWSRegionInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAWSRegionInfosRequest self = new ListAWSRegionInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListAWSRegionInfosRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
