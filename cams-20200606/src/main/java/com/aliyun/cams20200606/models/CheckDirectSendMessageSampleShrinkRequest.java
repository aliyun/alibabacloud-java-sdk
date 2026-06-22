// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckDirectSendMessageSampleShrinkRequest extends TeaModel {
    /**
     * <p>The SpaceId of an ISV sub-customer or the instance ID of a direct customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-xx**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The body of an interactive message.</p>
     */
    @NameInMap("Interactive")
    public String interactiveShrink;

    /**
     * <p>The body of a text message.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;text&quot;: &quot;This is a direct send message&quot;}</p>
     */
    @NameInMap("Text")
    public String textShrink;

    /**
     * <p>The type of the direct message content. Valid values:</p>
     * <ul>
     * <li><p>interactive</p>
     * </li>
     * <li><p>text</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>interactive</p>
     */
    @NameInMap("Type")
    public String type;

    public static CheckDirectSendMessageSampleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDirectSendMessageSampleShrinkRequest self = new CheckDirectSendMessageSampleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckDirectSendMessageSampleShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CheckDirectSendMessageSampleShrinkRequest setInteractiveShrink(String interactiveShrink) {
        this.interactiveShrink = interactiveShrink;
        return this;
    }
    public String getInteractiveShrink() {
        return this.interactiveShrink;
    }

    public CheckDirectSendMessageSampleShrinkRequest setTextShrink(String textShrink) {
        this.textShrink = textShrink;
        return this;
    }
    public String getTextShrink() {
        return this.textShrink;
    }

    public CheckDirectSendMessageSampleShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
