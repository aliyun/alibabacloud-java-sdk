// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaInfosRequest extends TeaModel {
    // 待注册的媒资在相应系统中的地址
    @NameInMap("InputURLs")
    public String inputURLs;

    // ICE 媒资ID
    @NameInMap("MediaIds")
    public String mediaIds;

    public static DeleteMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfosRequest self = new DeleteMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaInfosRequest setInputURLs(String inputURLs) {
        this.inputURLs = inputURLs;
        return this;
    }
    public String getInputURLs() {
        return this.inputURLs;
    }

    public DeleteMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
