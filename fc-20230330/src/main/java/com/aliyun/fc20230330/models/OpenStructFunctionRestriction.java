// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OpenStructFunctionRestriction extends TeaModel {
    @NameInMap("disable")
    public Boolean disable;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("reason")
    public String reason;

    public static OpenStructFunctionRestriction build(java.util.Map<String, ?> map) throws Exception {
        OpenStructFunctionRestriction self = new OpenStructFunctionRestriction();
        return TeaModel.build(map, self);
    }

    public OpenStructFunctionRestriction setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }
    public Boolean getDisable() {
        return this.disable;
    }

    public OpenStructFunctionRestriction setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public OpenStructFunctionRestriction setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
