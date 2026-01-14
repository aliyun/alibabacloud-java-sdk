// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteBlackWhiteListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>430</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <strong>example:</strong>
     * <p>gw-9cdcf8e4f58144059e73ff4c5ef9****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteBlackWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackWhiteListRequest self = new DeleteBlackWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlackWhiteListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteBlackWhiteListRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public DeleteBlackWhiteListRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public DeleteBlackWhiteListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
