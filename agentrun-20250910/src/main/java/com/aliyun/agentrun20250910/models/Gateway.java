// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Gateway extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("internetUrl")
    public String internetUrl;

    @NameInMap("intranetUrl")
    public String intranetUrl;

    @NameInMap("name")
    public String name;

    @NameInMap("status")
    public String status;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static Gateway build(java.util.Map<String, ?> map) throws Exception {
        Gateway self = new Gateway();
        return TeaModel.build(map, self);
    }

    public Gateway setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Gateway setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public Gateway setInternetUrl(String internetUrl) {
        this.internetUrl = internetUrl;
        return this;
    }
    public String getInternetUrl() {
        return this.internetUrl;
    }

    public Gateway setIntranetUrl(String intranetUrl) {
        this.intranetUrl = intranetUrl;
        return this;
    }
    public String getIntranetUrl() {
        return this.intranetUrl;
    }

    public Gateway setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Gateway setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Gateway setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
