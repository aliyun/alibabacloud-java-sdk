// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorShrinkRequest extends TeaModel {
    /**
     * <p>The information about the member accounts in the account group.</p>
     * <br>
     * <p>>  When you modify the configurations of an account group, this parameter can be left empty. In this case, the member account list is not updated. If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.</p>
     */
    @NameInMap("AggregatorAccounts")
    public String aggregatorAccountsShrink;

    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The name of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the name of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the description of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     */
    @NameInMap("Description")
    public String description;

    public static UpdateAggregatorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregatorShrinkRequest self = new UpdateAggregatorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregatorShrinkRequest setAggregatorAccountsShrink(String aggregatorAccountsShrink) {
        this.aggregatorAccountsShrink = aggregatorAccountsShrink;
        return this;
    }
    public String getAggregatorAccountsShrink() {
        return this.aggregatorAccountsShrink;
    }

    public UpdateAggregatorShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregatorShrinkRequest setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
        return this;
    }
    public String getAggregatorName() {
        return this.aggregatorName;
    }

    public UpdateAggregatorShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAggregatorShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
