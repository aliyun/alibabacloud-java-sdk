// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRabbitmqPublisherRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("exchangeName")
    public String exchangeName;

    @NameInMap("exchangeType")
    public String exchangeType;

    @NameInMap("hostName")
    public String hostName;

    @NameInMap("name")
    public String name;

    @NameInMap("password")
    public String password;

    @NameInMap("port")
    public Long port;

    @NameInMap("userName")
    public String userName;

    @NameInMap("virtualHost")
    public String virtualHost;

    public static CreateRabbitmqPublisherRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRabbitmqPublisherRequest self = new CreateRabbitmqPublisherRequest();
        return TeaModel.build(map, self);
    }

    public CreateRabbitmqPublisherRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRabbitmqPublisherRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRabbitmqPublisherRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public CreateRabbitmqPublisherRequest setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public CreateRabbitmqPublisherRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateRabbitmqPublisherRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRabbitmqPublisherRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRabbitmqPublisherRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public CreateRabbitmqPublisherRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateRabbitmqPublisherRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
