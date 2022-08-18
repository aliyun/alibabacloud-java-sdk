// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheRemainQuotaRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeIspFlushCacheRemainQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheRemainQuotaRequest self = new DescribeIspFlushCacheRemainQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheRemainQuotaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
