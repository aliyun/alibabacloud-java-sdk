// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddZooKeeperSaslUserResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5B170A0D-2C5D-4CF8-B808-03966B86****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddZooKeeperSaslUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddZooKeeperSaslUserResponseBody self = new AddZooKeeperSaslUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AddZooKeeperSaslUserResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AddZooKeeperSaslUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
