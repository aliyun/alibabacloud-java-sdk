// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListBroadcastAudiosByIdRequest extends TeaModel {
    @NameInMap("audioIds")
    public java.util.List<String> audioIds;

    public static ListBroadcastAudiosByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBroadcastAudiosByIdRequest self = new ListBroadcastAudiosByIdRequest();
        return TeaModel.build(map, self);
    }

    public ListBroadcastAudiosByIdRequest setAudioIds(java.util.List<String> audioIds) {
        this.audioIds = audioIds;
        return this;
    }
    public java.util.List<String> getAudioIds() {
        return this.audioIds;
    }

}
