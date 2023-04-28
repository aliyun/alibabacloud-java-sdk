// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewaySlbRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DeleteSlb")
    public Boolean deleteSlb;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public String id;

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
