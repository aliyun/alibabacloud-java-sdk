// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class FunctionRestriction extends TeaModel {
    @NameInMap("disable")
    public Boolean disable;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("reason")
    public String reason;

    public static FunctionRestriction build(java.util.Map<String, ?> map) throws Exception {
        FunctionRestriction self = new FunctionRestriction();
        return TeaModel.build(map, self);
    }

    public FunctionRestriction setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }
    public Boolean getDisable() {
        return this.disable;
    }

    public FunctionRestriction setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public FunctionRestriction setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
