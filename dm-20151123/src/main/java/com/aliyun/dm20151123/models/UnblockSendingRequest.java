// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UnblockSendingRequest extends TeaModel {
    /**
     * <p>Blacklisted recipient\&quot;s email address</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:recipient@example.com">recipient@example.com</a></p>
     */
    @NameInMap("BlockEmail")
    public String blockEmail;

    /**
     * <p>Blacklist type</p>
     * <ul>
     * <li>UNSUB: Unsubscribe</li>
     * <li>REPORT: Report</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSUB</p>
     */
    @NameInMap("BlockType")
    public String blockType;

    /**
     * <p>Sender\&quot;s email address</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:sender@example.com">sender@example.com</a></p>
     */
    @NameInMap("SenderEmail")
    public String senderEmail;

    public static UnblockSendingRequest build(java.util.Map<String, ?> map) throws Exception {
        UnblockSendingRequest self = new UnblockSendingRequest();
        return TeaModel.build(map, self);
    }

    public UnblockSendingRequest setBlockEmail(String blockEmail) {
        this.blockEmail = blockEmail;
        return this;
    }
    public String getBlockEmail() {
        return this.blockEmail;
    }

    public UnblockSendingRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }
    public String getBlockType() {
        return this.blockType;
    }

    public UnblockSendingRequest setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
        return this;
    }
    public String getSenderEmail() {
        return this.senderEmail;
    }

}
