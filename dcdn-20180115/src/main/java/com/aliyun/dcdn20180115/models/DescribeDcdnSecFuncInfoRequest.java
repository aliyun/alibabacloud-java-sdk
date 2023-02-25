// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecFuncInfoRequest extends TeaModel {
    /**
     * <p>The language. Valid values: en and zh. Default value: en.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the drop-down list. Valid values: RobotRuleName and RobotObject.</p>
     */
    @NameInMap("SecFuncType")
    public String secFuncType;

    public static DescribeDcdnSecFuncInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecFuncInfoRequest self = new DescribeDcdnSecFuncInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecFuncInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDcdnSecFuncInfoRequest setSecFuncType(String secFuncType) {
        this.secFuncType = secFuncType;
        return this;
    }
    public String getSecFuncType() {
        return this.secFuncType;
    }

}
