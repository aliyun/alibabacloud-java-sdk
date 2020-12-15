// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListStructureStatisticsRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("BackCategory")
    @Validation(required = true)
    public String backCategory;

    public static ListStructureStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStructureStatisticsRequest self = new ListStructureStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListStructureStatisticsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListStructureStatisticsRequest setBackCategory(String backCategory) {
        this.backCategory = backCategory;
        return this;
    }
    public String getBackCategory() {
        return this.backCategory;
    }

}
