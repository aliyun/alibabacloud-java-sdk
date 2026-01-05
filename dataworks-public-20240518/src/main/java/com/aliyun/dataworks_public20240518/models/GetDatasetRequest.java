// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDatasetRequest extends TeaModel {
    /**
     * <p>The dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-dataset:3pXXXb8o0ngr07njhps1</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetRequest self = new GetDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
