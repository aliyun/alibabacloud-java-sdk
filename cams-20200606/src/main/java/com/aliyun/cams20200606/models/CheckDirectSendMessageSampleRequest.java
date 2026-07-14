// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckDirectSendMessageSampleRequest extends TeaModel {
    /**
     * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-xx**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The message body of the interactive type.</p>
     */
    @NameInMap("Interactive")
    public java.util.Map<String, ?> interactive;

    /**
     * <p>The message body of the text content.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;text&quot;: &quot;This is a direct send message&quot;}</p>
     */
    @NameInMap("Text")
    public java.util.Map<String, ?> text;

    /**
     * <p>The direct-send content type. Valid values:</p>
     * <ul>
     * <li>interactive</li>
     * <li>text</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>interactive</p>
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
