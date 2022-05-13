// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateVGroupRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 集群名称
    @NameInMap("Name")
    public String name;

    // 用户ID
    @NameInMap("PrimaryUser")
    public String primaryUser;

    // 地域
    @NameInMap("Region")
    public String region;

    // 实例ID
    @NameInMap("SeataServerUniqueId")
    public String seataServerUniqueId;

    public static CreateVGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVGroupRequest self = new CreateVGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateVGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateVGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVGroupRequest setPrimaryUser(String primaryUser) {
        this.primaryUser = primaryUser;
        return this;
    }
    public String getPrimaryUser() {
        return this.primaryUser;
    }

    public CreateVGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateVGroupRequest setSeataServerUniqueId(String seataServerUniqueId) {
        this.seataServerUniqueId = seataServerUniqueId;
        return this;
    }
    public String getSeataServerUniqueId() {
        return this.seataServerUniqueId;
    }

}
