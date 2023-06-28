// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OutputFuncCode extends TeaModel {
    @NameInMap("checksum")
    public String checksum;

    @NameInMap("url")
    public String url;

    public static OutputFuncCode build(java.util.Map<String, ?> map) throws Exception {
        OutputFuncCode self = new OutputFuncCode();
        return TeaModel.build(map, self);
    }

    public OutputFuncCode setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public OutputFuncCode setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
