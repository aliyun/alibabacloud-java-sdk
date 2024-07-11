// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateServerlessClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sh-bp1a969y7681****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>23232453233*****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <strong>example:</strong>
     * <p>3E19E345-101D-4014-946C-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServerlessClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServerlessClusterResponseBody self = new CreateServerlessClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServerlessClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateServerlessClusterResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateServerlessClusterResponseBody setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public CreateServerlessClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
