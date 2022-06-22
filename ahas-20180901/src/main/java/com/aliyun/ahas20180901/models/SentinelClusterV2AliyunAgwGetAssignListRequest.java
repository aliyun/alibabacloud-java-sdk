// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwGetAssignListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static SentinelClusterV2AliyunAgwGetAssignListRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwGetAssignListRequest self = new SentinelClusterV2AliyunAgwGetAssignListRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwGetAssignListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
