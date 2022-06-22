// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOnBatchRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("Lang")
    public String lang;

    public static SentinelClusterV2AliyunAgwUpdateRuleOnBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOnBatchRequest self = new SentinelClusterV2AliyunAgwUpdateRuleOnBatchRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
