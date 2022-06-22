// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwGetAllFlowRulesForPushRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static SentinelClusterV2AliyunAgwGetAllFlowRulesForPushRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwGetAllFlowRulesForPushRequest self = new SentinelClusterV2AliyunAgwGetAllFlowRulesForPushRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
