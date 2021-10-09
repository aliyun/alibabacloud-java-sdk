// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportUserConfigRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Value")
    public String value;

    public static ReportUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUserConfigRequest self = new ReportUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public ReportUserConfigRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ReportUserConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
