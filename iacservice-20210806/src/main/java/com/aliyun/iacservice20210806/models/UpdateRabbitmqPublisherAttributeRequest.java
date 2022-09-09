// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRabbitmqPublisherAttributeRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("exchangeName")
    public String exchangeName;

    @NameInMap("exchangeType")
    public String exchangeType;

    @NameInMap("name")
    public String name;

    public static UpdateRabbitmqPublisherAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRabbitmqPublisherAttributeRequest self = new UpdateRabbitmqPublisherAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRabbitmqPublisherAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRabbitmqPublisherAttributeRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public UpdateRabbitmqPublisherAttributeRequest setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public UpdateRabbitmqPublisherAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
