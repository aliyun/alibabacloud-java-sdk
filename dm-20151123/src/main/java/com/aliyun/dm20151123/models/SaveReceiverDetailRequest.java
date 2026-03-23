// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SaveReceiverDetailRequest extends TeaModel {
    /**
     * <p>The recipient\&quot;s email address and template parameters, in an array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;Email&quot;: &quot;<a href="mailto:example@alimail.com">example@alimail.com</a>&quot;,&quot;CustomData&quot;: {&quot;name&quot;:&quot;Tom&quot;,&quot;age&quot;:&quot;30&quot;}}]</p>
     */
    @NameInMap("CustomDetail")
    public String customDetail;

    /**
     * <p>The recipient details. You can upload up to 500 recipients in a single request. The value is a string in a JSON array format. Each object in the array represents a recipient. For example: \<code>[{ },{ },{ }...]\\</code>. The format for each recipient object is \<code>[{&quot;b&quot;:&quot;birthday&quot;,&quot;e&quot;:&quot;xxx\\@example.net&quot;,&quot;g&quot;:&quot;gender&quot;,&quot;m&quot;:&quot;mobile&quot;,&quot;n&quot;:&quot;nickname&quot;,&quot;u&quot;:&quot;name&quot;}]\\</code>. If you add a duplicate recipient address, the system returns \<code>&quot;ErrorCount&quot;: 1\\</code>.</p>
     * <p>The format is \<code>[{ },{ },{ }...]\\</code>. The format of the content within each \<code>{}\\</code> is as follows:</p>
     * <p>[{&quot;b&quot;:&quot;birthday&quot;,&quot;e&quot;:&quot;xxx\@example.net&quot;,&quot;g&quot;:&quot;gender&quot;,&quot;m&quot;:&quot;mobile&quot;,&quot;n&quot;:&quot;nickname&quot;,&quot;u&quot;:&quot;name&quot;}]. Pass the value as a string, not a list.</p>
     * <p>Inserting a duplicate recipient address returns &quot;ErrorCount&quot;: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;b&quot;:&quot;birthday&quot;,&quot;e&quot;:&quot;<a href="mailto:xxx@alibaba-inc.com">xxx@alibaba-inc.com</a>&quot;,&quot;g&quot;:&quot;gender&quot;,&quot;m&quot;:&quot;mobile&quot;,&quot;n&quot;:&quot;nickname&quot;,&quot;u&quot;:&quot;name&quot;}]</p>
     */
    @NameInMap("Detail")
    public String detail;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the recipient list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34642</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SaveReceiverDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveReceiverDetailRequest self = new SaveReceiverDetailRequest();
        return TeaModel.build(map, self);
    }

    public SaveReceiverDetailRequest setCustomDetail(String customDetail) {
        this.customDetail = customDetail;
        return this;
    }
    public String getCustomDetail() {
        return this.customDetail;
    }

    public SaveReceiverDetailRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public SaveReceiverDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SaveReceiverDetailRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public SaveReceiverDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SaveReceiverDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
