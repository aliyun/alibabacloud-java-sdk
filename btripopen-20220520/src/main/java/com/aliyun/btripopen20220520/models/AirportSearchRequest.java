// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AirportSearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    public Integer type;

    public static AirportSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        AirportSearchRequest self = new AirportSearchRequest();
        return TeaModel.build(map, self);
    }

    public AirportSearchRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public AirportSearchRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
