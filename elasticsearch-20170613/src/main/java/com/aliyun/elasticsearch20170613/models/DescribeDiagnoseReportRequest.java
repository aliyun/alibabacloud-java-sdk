// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportRequest extends TeaModel {
    @NameInMap("lang")
    public String lang;

    public static DescribeDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportRequest self = new DescribeDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
