// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetComponentVersionRequest extends TeaModel {
    @NameInMap("withoutChartContent")
    public Boolean withoutChartContent;

    public static GetComponentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComponentVersionRequest self = new GetComponentVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetComponentVersionRequest setWithoutChartContent(Boolean withoutChartContent) {
        this.withoutChartContent = withoutChartContent;
        return this;
    }
    public Boolean getWithoutChartContent() {
        return this.withoutChartContent;
    }

}
