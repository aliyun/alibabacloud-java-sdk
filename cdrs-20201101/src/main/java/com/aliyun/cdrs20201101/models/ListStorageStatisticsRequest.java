// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListStorageStatisticsRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    public static ListStorageStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStorageStatisticsRequest self = new ListStorageStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListStorageStatisticsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
