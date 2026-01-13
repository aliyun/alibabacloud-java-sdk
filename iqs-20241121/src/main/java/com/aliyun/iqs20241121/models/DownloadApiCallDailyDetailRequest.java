// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadApiCallDailyDetailRequest extends TeaModel {
    @NameInMap("body")
    public DownloadApiCallDailyDetailCmd body;

    public static DownloadApiCallDailyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadApiCallDailyDetailRequest self = new DownloadApiCallDailyDetailRequest();
        return TeaModel.build(map, self);
    }

    public DownloadApiCallDailyDetailRequest setBody(DownloadApiCallDailyDetailCmd body) {
        this.body = body;
        return this;
    }
    public DownloadApiCallDailyDetailCmd getBody() {
        return this.body;
    }

}
