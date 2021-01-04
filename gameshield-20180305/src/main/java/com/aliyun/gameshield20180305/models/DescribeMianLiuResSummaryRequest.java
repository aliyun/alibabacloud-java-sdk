// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeMianLiuResSummaryRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    public static DescribeMianLiuResSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMianLiuResSummaryRequest self = new DescribeMianLiuResSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMianLiuResSummaryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeMianLiuResSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
