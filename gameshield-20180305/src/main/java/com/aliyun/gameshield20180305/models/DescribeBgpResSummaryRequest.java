// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBgpResSummaryRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    public static DescribeBgpResSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpResSummaryRequest self = new DescribeBgpResSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBgpResSummaryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeBgpResSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
