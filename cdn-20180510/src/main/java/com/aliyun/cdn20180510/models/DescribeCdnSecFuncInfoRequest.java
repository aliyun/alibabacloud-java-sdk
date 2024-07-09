// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSecFuncInfoRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh: Chinese</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the security feature. Valid values:</p>
     * <ul>
     * <li>CipherSuiteGroupCustomize: custom cipher suite.</li>
     * <li>CipherSuiteGroupStrict: dustom cipher suite.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CipherSuiteGroupCustomize</p>
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
