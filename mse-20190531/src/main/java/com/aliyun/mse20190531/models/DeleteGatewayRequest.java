// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to delete the SLB instance purchased for the gateway when you delete the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteSlb")
    public Boolean deleteSlb;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-0fe488252dc44d55a9dd57875193a1d7</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static DeleteGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRequest self = new DeleteGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteGatewayRequest setDeleteSlb(Boolean deleteSlb) {
        this.deleteSlb = deleteSlb;
        return this;
    }
    public Boolean getDeleteSlb() {
        return this.deleteSlb;
    }

    public DeleteGatewayRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
