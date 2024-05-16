// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSecFuncInfoRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * <br>
     * <p>*   en: English</p>
     * <p>*   zh: Chinese</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the security feature. Valid values:</p>
     * <br>
     * <p>*   CipherSuiteGroupCustomize: custom cipher suite.</p>
     * <p>*   CipherSuiteGroupStrict: dustom cipher suite.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecFuncType")
    public String secFuncType;

    public static DescribeCdnSecFuncInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSecFuncInfoRequest self = new DescribeCdnSecFuncInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSecFuncInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCdnSecFuncInfoRequest setSecFuncType(String secFuncType) {
        this.secFuncType = secFuncType;
        return this;
    }
    public String getSecFuncType() {
        return this.secFuncType;
    }

}
