// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class QuerySyncStatusByAliUidRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    public static QuerySyncStatusByAliUidRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncStatusByAliUidRequest self = new QuerySyncStatusByAliUidRequest();
        return TeaModel.build(map, self);
    }

    public QuerySyncStatusByAliUidRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

}
