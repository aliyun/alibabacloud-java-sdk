// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorShrinkRequest extends TeaModel {
    /**
     * <p>The member accounts of the account group.</p>
     * <blockquote>
     * <ul>
     * <li><p>If you set <code>AggregatorType</code> to \`RD, you can leave this parameter empty. This indicates that all members in the resource directory are added to the global account group.</p>
     * </li>
     * <li><p>If you set <code>AggregatorType</code> to <code>FOLDER</code>, you can leave this parameter empty. This indicates that all members in a specific folder in the resource directory are added to the folder account group.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AggregatorAccounts")
    public String aggregatorAccountsShrink;

    /**
     * <p>The name of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Example_Aggregator</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The type of the account group. Valid values:</p>
     * <ul>
     * <li><p>RD: global account group.</p>
     * </li>
     * <li><p>FOLDER: folder account group. You must also set the <code>FolderId</code> parameter. For more information about how to obtain a folder ID, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
     * </li>
     * <li><p>CUSTOM (default): custom account group. You must also set the <code>AccountId</code> and <code>AccountType</code> parameters for <code>AggregatorAccounts</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("AggregatorType")
    public String aggregatorType;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You must make sure that the token is unique for different requests. The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     * 
     * <strong>example:</strong>
     * <p>Example aggregator used to demonstrate how to create an aggregator.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the attached folder. You can specify multiple folder IDs. Separate the IDs with commas (,).</p>
     * <p>This parameter is required if you set <code>AggregatorType</code> to <code>FOLDER</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-brHdgv****,fd-brHdgk****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can attach a maximum of 20 tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

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

    public CreateAggregatorShrinkRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public CreateAggregatorShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
