// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class TerminateSqlStatementRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static TerminateSqlStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateSqlStatementRequest self = new TerminateSqlStatementRequest();
        return TeaModel.build(map, self);
    }

    public TerminateSqlStatementRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
