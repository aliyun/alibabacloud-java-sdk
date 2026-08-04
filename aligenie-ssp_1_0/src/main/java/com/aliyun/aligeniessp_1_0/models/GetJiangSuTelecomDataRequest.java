// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetJiangSuTelecomDataRequest extends TeaModel {
    /**
     * <p>Date in the format yyyy-MM-dd. This refers to the data timestamp when the data becomes available, not the date when the data was generated. Data is always produced on a T+1 basis.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-09</p>
     */
    @NameInMap("Date")
    public String date;

    public static GetJiangSuTelecomDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJiangSuTelecomDataRequest self = new GetJiangSuTelecomDataRequest();
        return TeaModel.build(map, self);
    }

    public GetJiangSuTelecomDataRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
