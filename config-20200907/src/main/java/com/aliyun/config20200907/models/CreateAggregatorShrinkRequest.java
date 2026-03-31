// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorShrinkRequest extends TeaModel {
    /**
     * <p>The information about the member accounts in the account group. Example:</p>
     * <pre><code>[{
     *     &quot;accountId&quot;: 171322098523****,
     *     &quot;accountType&quot;:&quot;ResourceDirectory&quot;,
     *                 &quot;accountName&quot;:&quot;Alice&quot;
     * }, {
     *     &quot;accountId&quot;: 100532098349****,
     *     &quot;accountType&quot;:&quot;ResourceDirectory&quot;,
     *                 &quot;accountName&quot;:&quot;Tom&quot;
     * }]
     * </code></pre>
     * <blockquote>
     * <p> If <code>AggregatorType</code> is set to <code>RD</code> or <code>FOLDER</code>, this parameter can be left empty, which indicates that all accounts in the resource directory are added to the global account group.</p>
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
     * <p>Test_Group</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The type of the account group. Valid values:</p>
     * <ul>
     * <li>RD: global account group.</li>
     * <li>FOLDER: account group of the folder.</li>
     * <li>CUSTOM (default): custom account group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("AggregatorType")
    public String aggregatorType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>Aggregator description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the folder to which the account group is attached. You must specify this parameter if <code>AggregatorType</code> is set to <code>FOLDER</code>. Multiple resource folder IDs should be separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>fd-brHdgv****,fd-brHdgk****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
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
