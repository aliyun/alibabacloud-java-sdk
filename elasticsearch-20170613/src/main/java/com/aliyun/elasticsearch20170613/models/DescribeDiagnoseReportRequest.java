// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportRequest extends TeaModel {
    /**
     * <p>The language of the intelligent diagnostic report. Default value: the browser language. Valid values:</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh: Simplified Chinese</li>
     * <li>zt: Traditional Chinese</li>
     * <li>es: Spanish</li>
     * <li>fr: French</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
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
