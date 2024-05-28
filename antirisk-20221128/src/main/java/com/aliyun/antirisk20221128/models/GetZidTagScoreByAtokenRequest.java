// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetZidTagScoreByAtokenRequest extends TeaModel {
    /**
     * <p>atoken</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("atoken")
    public String atoken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    public static GetZidTagScoreByAtokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetZidTagScoreByAtokenRequest self = new GetZidTagScoreByAtokenRequest();
        return TeaModel.build(map, self);
    }

    public GetZidTagScoreByAtokenRequest setAtoken(String atoken) {
        this.atoken = atoken;
        return this;
    }
    public String getAtoken() {
        return this.atoken;
    }

    public GetZidTagScoreByAtokenRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
