// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryFaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceRequest self = new QueryFaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
