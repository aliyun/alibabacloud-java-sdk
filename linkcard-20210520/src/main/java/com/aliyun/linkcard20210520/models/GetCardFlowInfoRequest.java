// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardFlowInfoRequest extends TeaModel {
    @NameInMap("DateList")
    public java.util.List<String> dateList;

    @NameInMap("Iccid")
    public String iccid;

    public static GetCardFlowInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardFlowInfoRequest self = new GetCardFlowInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCardFlowInfoRequest setDateList(java.util.List<String> dateList) {
        this.dateList = dateList;
        return this;
    }
    public java.util.List<String> getDateList() {
        return this.dateList;
    }

    public GetCardFlowInfoRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
