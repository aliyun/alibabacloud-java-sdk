// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOffBatchRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("Lang")
    public String lang;

    public static SentinelClusterV2AliyunAgwUpdateRuleOffBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOffBatchRequest self = new SentinelClusterV2AliyunAgwUpdateRuleOffBatchRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffBatchRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOffBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
