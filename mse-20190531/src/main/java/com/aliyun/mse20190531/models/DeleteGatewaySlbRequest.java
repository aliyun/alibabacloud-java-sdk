// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewaySlbRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to delete the SLB instance purchased for the gateway when you delete the gateway.</p>
     */
    @NameInMap("DeleteSlb")
    public Boolean deleteSlb;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the association record.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the SLB instance that needs to be deleted.</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    public static DeleteGatewaySlbRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySlbRequest self = new DeleteGatewaySlbRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySlbRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteGatewaySlbRequest setDeleteSlb(Boolean deleteSlb) {
        this.deleteSlb = deleteSlb;
        return this;
    }
    public Boolean getDeleteSlb() {
        return this.deleteSlb;
    }

    public DeleteGatewaySlbRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public DeleteGatewaySlbRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteGatewaySlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

}
