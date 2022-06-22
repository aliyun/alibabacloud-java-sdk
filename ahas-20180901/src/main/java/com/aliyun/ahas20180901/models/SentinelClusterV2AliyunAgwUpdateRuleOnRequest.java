// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOnRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    public static SentinelClusterV2AliyunAgwUpdateRuleOnRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOnRequest self = new SentinelClusterV2AliyunAgwUpdateRuleOnRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
