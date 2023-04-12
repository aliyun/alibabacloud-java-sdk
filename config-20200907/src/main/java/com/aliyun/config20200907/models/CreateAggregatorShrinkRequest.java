// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorShrinkRequest extends TeaModel {
    /**
     * <p>The information about the member accounts in the account group. Example:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>[{</p>
     * <p>	"accountId": 171322098523****,</p>
     * <p>	"accountType":"ResourceDirectory",</p>
     * <p>                "accountName":"Alice"</p>
     * <p>}, {</p>
     * <p>	"accountId": 100532098349****,</p>
     * <p>	"accountType":"ResourceDirectory",</p>
     * <p>                "accountName":"Tom"</p>
     * <p>}]</p>
     * <p>```</p>
     * <br>
     * <p>>  If the `AggregatorType` parameter is set to `RD`, this parameter can be left empty because all accounts in the resource directory are automatically added to the global account group.</p>
     */
    @NameInMap("AggregatorAccounts")
    public String aggregatorAccountsShrink;

    /**
     * <p>The name of the account group.</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The type of the account group. Valid values:</p>
     * <br>
     * <p>*   RD: global account group.</p>
     * <p>*   CUSTOM: custom account group. This is the default value.</p>
     */
    @NameInMap("AggregatorType")
    public String aggregatorType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The `ClientToken` value can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     */
    @NameInMap("Description")
    public String description;

    public static CreateAggregatorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregatorShrinkRequest self = new CreateAggregatorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregatorShrinkRequest setAggregatorAccountsShrink(String aggregatorAccountsShrink) {
        this.aggregatorAccountsShrink = aggregatorAccountsShrink;
        return this;
    }
    public String getAggregatorAccountsShrink() {
        return this.aggregatorAccountsShrink;
    }

    public CreateAggregatorShrinkRequest setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
        return this;
    }
    public String getAggregatorName() {
        return this.aggregatorName;
    }

    public CreateAggregatorShrinkRequest setAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
        return this;
    }
    public String getAggregatorType() {
        return this.aggregatorType;
    }

    public CreateAggregatorShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregatorShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
