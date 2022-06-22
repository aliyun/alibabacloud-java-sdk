// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryInspectItemRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("InspectId")
    public Long inspectId;

    @NameInMap("Lang")
    public String lang;

    public static QueryInspectItemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInspectItemRequest self = new QueryInspectItemRequest();
        return TeaModel.build(map, self);
    }

    public QueryInspectItemRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryInspectItemRequest setInspectId(Long inspectId) {
        this.inspectId = inspectId;
        return this;
    }
    public Long getInspectId() {
        return this.inspectId;
    }

    public QueryInspectItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
