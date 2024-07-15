// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class OutputFuncCode extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("checksum")
    public String checksum;

    /**
     * <strong>example:</strong>
     * <p><a href="http://func-code.oss-cn-shanghai.aliyuncs.com/1a2b3c4d5e6f">http://func-code.oss-cn-shanghai.aliyuncs.com/1a2b3c4d5e6f</a></p>
     */
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
