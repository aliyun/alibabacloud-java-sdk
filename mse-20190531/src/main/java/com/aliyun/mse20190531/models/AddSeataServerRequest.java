// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSeataServerRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 集群名称
    @NameInMap("Name")
    public String name;

    @NameInMap("PrimaryUser")
    public String primaryUser;

    // 地域
    @NameInMap("Region")
    public String region;

    // 节点数量
    @NameInMap("Replica")
    public Integer replica;

    @NameInMap("SecurityGroup")
    public String securityGroup;

    // 专有网络ID
    @NameInMap("Vpc")
    public String vpc;

    @NameInMap("Vswitch")
    public String vswitch;

    public static AddSeataServerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSeataServerRequest self = new AddSeataServerRequest();
        return TeaModel.build(map, self);
    }

    public AddSeataServerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddSeataServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSeataServerRequest setPrimaryUser(String primaryUser) {
        this.primaryUser = primaryUser;
        return this;
    }
    public String getPrimaryUser() {
        return this.primaryUser;
    }

    public AddSeataServerRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddSeataServerRequest setReplica(Integer replica) {
        this.replica = replica;
        return this;
    }
    public Integer getReplica() {
        return this.replica;
    }

    public AddSeataServerRequest setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public AddSeataServerRequest setVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }
    public String getVpc() {
        return this.vpc;
    }

    public AddSeataServerRequest setVswitch(String vswitch) {
        this.vswitch = vswitch;
        return this;
    }
    public String getVswitch() {
        return this.vswitch;
    }

}
