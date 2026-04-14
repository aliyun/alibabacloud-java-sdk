// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckDirectSendMessageSampleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-xx**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("Interactive")
    public java.util.Map<String, ?> interactive;

    /**
     * <strong>example:</strong>
     * <p>{&quot;text&quot;: &quot;This is a direct send message&quot;}</p>
     */
    @NameInMap("Text")
    public java.util.Map<String, ?> text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Type")
    public String type;

    public static CheckDirectSendMessageSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDirectSendMessageSampleRequest self = new CheckDirectSendMessageSampleRequest();
        return TeaModel.build(map, self);
    }

    public CheckDirectSendMessageSampleRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CheckDirectSendMessageSampleRequest setInteractive(java.util.Map<String, ?> interactive) {
        this.interactive = interactive;
        return this;
    }
    public java.util.Map<String, ?> getInteractive() {
        return this.interactive;
    }

    public CheckDirectSendMessageSampleRequest setText(java.util.Map<String, ?> text) {
        this.text = text;
        return this;
    }
    public java.util.Map<String, ?> getText() {
        return this.text;
    }

    public CheckDirectSendMessageSampleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
