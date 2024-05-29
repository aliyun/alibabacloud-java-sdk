// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListTextThemesRequest extends TeaModel {
    @NameInMap("industry")
    public String industry;

    public static ListTextThemesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextThemesRequest self = new ListTextThemesRequest();
        return TeaModel.build(map, self);
    }

    public ListTextThemesRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
