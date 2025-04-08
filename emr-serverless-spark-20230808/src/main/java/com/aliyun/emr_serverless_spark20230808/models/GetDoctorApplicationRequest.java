// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetDoctorApplicationRequest extends TeaModel {
    /**
     * <p>The language of diagnostic information.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <p>The query time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01</p>
     */
    @NameInMap("queryTime")
    public String queryTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetDoctorApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorApplicationRequest self = new GetDoctorApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorApplicationRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetDoctorApplicationRequest setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

    public GetDoctorApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
