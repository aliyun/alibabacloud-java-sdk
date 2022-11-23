// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ReportImpressionRequest extends TeaModel {
    @NameInMap("Impressionlink")
    public String impressionlink;

    public static ReportImpressionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportImpressionRequest self = new ReportImpressionRequest();
        return TeaModel.build(map, self);
    }

    public ReportImpressionRequest setImpressionlink(String impressionlink) {
        this.impressionlink = impressionlink;
        return this;
    }
    public String getImpressionlink() {
        return this.impressionlink;
    }

}
