// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class PositionStructBody extends TeaModel {
    @NameInMap("ErrorCount")
    public String errorCount;

    @NameInMap("Height")
    public String height;

    @NameInMap("Index")
    public String index;

    @NameInMap("LastError")
    public String lastError;

    @NameInMap("Type")
    public String type;

    public static PositionStructBody build(java.util.Map<String, ?> map) throws Exception {
        PositionStructBody self = new PositionStructBody();
        return TeaModel.build(map, self);
    }

    public PositionStructBody setErrorCount(String errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public String getErrorCount() {
        return this.errorCount;
    }

    public PositionStructBody setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public PositionStructBody setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public PositionStructBody setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public PositionStructBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
