// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetRealTimeRiskInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("atoken")
    public String atoken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    @NameInMap("extra")
    public String extra;

    public static GetRealTimeRiskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealTimeRiskInfoRequest self = new GetRealTimeRiskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetRealTimeRiskInfoRequest setAtoken(String atoken) {
        this.atoken = atoken;
        return this;
    }
    public String getAtoken() {
        return this.atoken;
    }

    public GetRealTimeRiskInfoRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetRealTimeRiskInfoRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
