// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorShrinkRequest extends TeaModel {
    /**
     * <p>The members in the account group.</p>
     * <blockquote>
     * <p>You can leave this parameter empty to skip updating the member list. To update the member list, you must specify both <code>AccountId</code> and <code>AccountType</code>.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AggregatorAccounts")
    public String aggregatorAccountsShrink;

    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-dacf86d8314e00eb****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The name of the account group.</p>
     * <p>For more information about how to obtain the name of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test_Group</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>A client token that ensures the idempotence of the request. Generate a unique token for each request. The token can contain only ASCII characters and must be no more than 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     * <p>For more information about how to obtain the description of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>测试组</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the folder. You can enter multiple folder IDs. Separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>fd-brHdgv****,fd-brHdgk****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The tags of the resource. This parameter is deprecated and no longer takes effect. Ignore this parameter.</p>
     * <p>You can attach up to 20 tags.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public String tagShrink;

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

    public UpdateAggregatorShrinkRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    @Deprecated
    public UpdateAggregatorShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
