// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RemoveZooKeeperSaslUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>56D9E600-6348-4260-B35F-583413F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveZooKeeperSaslUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveZooKeeperSaslUserResponseBody self = new RemoveZooKeeperSaslUserResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveZooKeeperSaslUserResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RemoveZooKeeperSaslUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
