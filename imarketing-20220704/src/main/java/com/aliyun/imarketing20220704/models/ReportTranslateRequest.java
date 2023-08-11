// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ReportTranslateRequest extends TeaModel {
    @NameInMap("Impressionlink")
    public String impressionlink;

    public static ReportTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportTranslateRequest self = new ReportTranslateRequest();
        return TeaModel.build(map, self);
    }

    public ReportTranslateRequest setImpressionlink(String impressionlink) {
        this.impressionlink = impressionlink;
        return this;
    }
    public String getImpressionlink() {
        return this.impressionlink;
    }

}
