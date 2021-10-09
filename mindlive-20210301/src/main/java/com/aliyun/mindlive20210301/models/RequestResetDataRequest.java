// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestResetDataRequest extends TeaModel {
    @NameInMap("LiveSource")
    public String liveSource;

    public static RequestResetDataRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestResetDataRequest self = new RequestResetDataRequest();
        return TeaModel.build(map, self);
    }

    public RequestResetDataRequest setLiveSource(String liveSource) {
        this.liveSource = liveSource;
        return this;
    }
    public String getLiveSource() {
        return this.liveSource;
    }

}
