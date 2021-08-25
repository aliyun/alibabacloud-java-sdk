// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorShrinkRequest extends TeaModel {
    @NameInMap("AggregatorName")
    public String aggregatorName;

    @NameInMap("Description")
    public String description;

    @NameInMap("AggregatorAccounts")
    public String aggregatorAccountsShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AggregatorType")
    public String aggregatorType;

    public static CreateAggregatorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregatorShrinkRequest self = new CreateAggregatorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregatorShrinkRequest setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
        return this;
    }
    public String getAggregatorName() {
        return this.aggregatorName;
    }

    public CreateAggregatorShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregatorShrinkRequest setAggregatorAccountsShrink(String aggregatorAccountsShrink) {
        this.aggregatorAccountsShrink = aggregatorAccountsShrink;
        return this;
    }
    public String getAggregatorAccountsShrink() {
        return this.aggregatorAccountsShrink;
    }

    public CreateAggregatorShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregatorShrinkRequest setAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
        return this;
    }
    public String getAggregatorType() {
        return this.aggregatorType;
    }

}
