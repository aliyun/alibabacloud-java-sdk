// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBindDataRequest extends TeaModel {
    @NameInMap("LiveSource")
    public String liveSource;

    public static RequestBindDataRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestBindDataRequest self = new RequestBindDataRequest();
        return TeaModel.build(map, self);
    }

    public RequestBindDataRequest setLiveSource(String liveSource) {
        this.liveSource = liveSource;
        return this;
    }
    public String getLiveSource() {
        return this.liveSource;
    }

}
