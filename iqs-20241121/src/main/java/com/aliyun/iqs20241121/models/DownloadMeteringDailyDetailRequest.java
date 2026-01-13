// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadMeteringDailyDetailRequest extends TeaModel {
    @NameInMap("body")
    public DownloadMeteringDailyDetailCmd body;

    public static DownloadMeteringDailyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadMeteringDailyDetailRequest self = new DownloadMeteringDailyDetailRequest();
        return TeaModel.build(map, self);
    }

    public DownloadMeteringDailyDetailRequest setBody(DownloadMeteringDailyDetailCmd body) {
        this.body = body;
        return this;
    }
    public DownloadMeteringDailyDetailCmd getBody() {
        return this.body;
    }

}
