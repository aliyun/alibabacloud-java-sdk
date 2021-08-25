// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class FillAgAccountActionRequest extends TeaModel {
    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Type")
    public String type;

    public static FillAgAccountActionRequest build(java.util.Map<String, ?> map) throws Exception {
        FillAgAccountActionRequest self = new FillAgAccountActionRequest();
        return TeaModel.build(map, self);
    }

    public FillAgAccountActionRequest setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public FillAgAccountActionRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public FillAgAccountActionRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public FillAgAccountActionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
