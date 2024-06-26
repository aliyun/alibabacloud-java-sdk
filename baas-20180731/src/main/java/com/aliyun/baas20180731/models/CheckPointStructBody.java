// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CheckPointStructBody extends TeaModel {
    @NameInMap("ErrorCount")
    public String errorCount;

    @NameInMap("Height")
    public String height;

    @NameInMap("Index")
    public String index;

    @NameInMap("LastError")
    public String lastError;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("Type")
    public String type;

    public static CheckPointStructBody build(java.util.Map<String, ?> map) throws Exception {
        CheckPointStructBody self = new CheckPointStructBody();
        return TeaModel.build(map, self);
    }

    public CheckPointStructBody setErrorCount(String errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public String getErrorCount() {
        return this.errorCount;
    }

    public CheckPointStructBody setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public CheckPointStructBody setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public CheckPointStructBody setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public CheckPointStructBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public CheckPointStructBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
