// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportCorpNumbersRequest extends TeaModel {
    /**
     * <p>The city.</p>
     * 
     * <strong>example:</strong>
     * <p>西安</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The enterprise name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx公司</p>
     */
    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>The list of numbers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;029xxxxxx\&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>The line information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx通信-陕西线路</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The province.</p>
     * 
     * <strong>example:</strong>
     * <p>陕西</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The business tags.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
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
