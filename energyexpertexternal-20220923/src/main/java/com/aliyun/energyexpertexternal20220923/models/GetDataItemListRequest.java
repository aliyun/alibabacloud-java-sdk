// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDataItemListRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

    public static GetDataItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataItemListRequest self = new GetDataItemListRequest();
        return TeaModel.build(map, self);
    }

    public GetDataItemListRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
