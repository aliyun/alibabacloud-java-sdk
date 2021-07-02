// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneScreenCutServiceSendScreenCutToEmailRequest extends TeaModel {
    // param0
    @NameInMap("ReceiverMailList")
    public java.util.List<String> receiverMailList;

    // param1
    @NameInMap("PicUrls")
    public java.util.List<String> picUrls;

    // param2
    @NameInMap("EmailTitle")
    public String emailTitle;

    public static RemoteWneScreenCutServiceSendScreenCutToEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneScreenCutServiceSendScreenCutToEmailRequest self = new RemoteWneScreenCutServiceSendScreenCutToEmailRequest();
        return TeaModel.build(map, self);
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailRequest setReceiverMailList(java.util.List<String> receiverMailList) {
        this.receiverMailList = receiverMailList;
        return this;
    }
    public java.util.List<String> getReceiverMailList() {
        return this.receiverMailList;
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailRequest setPicUrls(java.util.List<String> picUrls) {
        this.picUrls = picUrls;
        return this;
    }
    public java.util.List<String> getPicUrls() {
        return this.picUrls;
    }

    public RemoteWneScreenCutServiceSendScreenCutToEmailRequest setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
        return this;
    }
    public String getEmailTitle() {
        return this.emailTitle;
    }

}
