// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeBatchSlsDispatchStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeBatchSlsDispatchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchSlsDispatchStatusRequest self = new DescribeBatchSlsDispatchStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBatchSlsDispatchStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
