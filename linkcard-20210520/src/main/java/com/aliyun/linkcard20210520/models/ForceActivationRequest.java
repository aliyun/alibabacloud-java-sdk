// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ForceActivationRequest extends TeaModel {
    @NameInMap("DateType")
    public String dateType;

    @NameInMap("Iccid")
    public String iccid;

    public static ForceActivationRequest build(java.util.Map<String, ?> map) throws Exception {
        ForceActivationRequest self = new ForceActivationRequest();
        return TeaModel.build(map, self);
    }

    public ForceActivationRequest setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public ForceActivationRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
