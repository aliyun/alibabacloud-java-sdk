// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetBasicStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static GetBasicStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicStatisticsRequest self = new GetBasicStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicStatisticsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
