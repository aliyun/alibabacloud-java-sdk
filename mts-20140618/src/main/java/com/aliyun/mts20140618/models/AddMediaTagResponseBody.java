// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaTagResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91B6CAB9-034C-4E4E-A40B-E7F5C81E1A2K</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddMediaTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaTagResponseBody self = new AddMediaTagResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
