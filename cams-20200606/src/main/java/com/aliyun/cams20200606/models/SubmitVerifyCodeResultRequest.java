// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SubmitVerifyCodeResultRequest extends TeaModel {
    /**
     * <p>The message ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202605012020***</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The verification result.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TRUE</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>The recipient number.</p>
     * 
     * <strong>example:</strong>
     * <p>86138000***</p>
     */
    @NameInMap("To")
    public String to;

    public static SubmitVerifyCodeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVerifyCodeResultRequest self = new SubmitVerifyCodeResultRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVerifyCodeResultRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SubmitVerifyCodeResultRequest setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public SubmitVerifyCodeResultRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
