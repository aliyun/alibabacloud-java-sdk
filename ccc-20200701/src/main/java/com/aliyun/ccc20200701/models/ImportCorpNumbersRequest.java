// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportCorpNumbersRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Provider")
    public String provider;

    @NameInMap("Province")
    public String province;

    @NameInMap("TagList")
    public String tagList;

    public static ImportCorpNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCorpNumbersRequest self = new ImportCorpNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ImportCorpNumbersRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ImportCorpNumbersRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ImportCorpNumbersRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public ImportCorpNumbersRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ImportCorpNumbersRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ImportCorpNumbersRequest setTagList(String tagList) {
        this.tagList = tagList;
        return this;
    }
    public String getTagList() {
        return this.tagList;
    }

}
