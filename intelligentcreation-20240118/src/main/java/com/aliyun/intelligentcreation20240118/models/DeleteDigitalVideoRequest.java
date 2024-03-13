// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DeleteDigitalVideoRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("videoId")
    public String videoId;

    public static DeleteDigitalVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDigitalVideoRequest self = new DeleteDigitalVideoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDigitalVideoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeleteDigitalVideoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
