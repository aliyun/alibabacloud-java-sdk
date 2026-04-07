// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZooKeeperSaslUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-5bffa4e8630</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListZooKeeperSaslUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListZooKeeperSaslUserRequest self = new ListZooKeeperSaslUserRequest();
        return TeaModel.build(map, self);
    }

    public ListZooKeeperSaslUserRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListZooKeeperSaslUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
