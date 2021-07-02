// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest extends TeaModel {
    // param0
    @NameInMap("ReceiverMailList")
    public String receiverMailListShrink;

    // param1
    @NameInMap("PicUrls")
    public String picUrlsShrink;

    // param2
    @NameInMap("EmailTitle")
    public String emailTitle;

    public static RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest self = new RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest setReceiverMailListShrink(String receiverMailListShrink) {
        this.receiverMailListShrink = receiverMailListShrink;
        return this;
    }
    public String getReceiverMailListShrink() {
        return this.receiverMailListShrink;
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest setPicUrlsShrink(String picUrlsShrink) {
        this.picUrlsShrink = picUrlsShrink;
        return this;
    }
    public String getPicUrlsShrink() {
        return this.picUrlsShrink;
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailShrinkRequest setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
        return this;
    }
    public String getEmailTitle() {
        return this.emailTitle;
    }

}
