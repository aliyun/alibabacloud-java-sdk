// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGeoInfoRequest extends TeaModel {
    /**
     * <p>The language of the information to return. Valid values:</p>
     * <br>
     * <p>*   cn: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Language")
    public String language;

    public static DescribeDcdnWafGeoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGeoInfoRequest self = new DescribeDcdnWafGeoInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGeoInfoRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
