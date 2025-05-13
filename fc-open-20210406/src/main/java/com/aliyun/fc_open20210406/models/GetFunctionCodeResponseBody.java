// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionCodeResponseBody extends TeaModel {
    /**
     * <p>The CRC-64 value of the function code package.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("checksum")
    public String checksum;

    /**
     * <p>The URL of the function code package.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://func-code.oss-cn-shanghai.aliyuncs.com/1a2b3c4d5e6f">http://func-code.oss-cn-shanghai.aliyuncs.com/1a2b3c4d5e6f</a></p>
     */
    @NameInMap("url")
    public String url;

    public static GetFunctionCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCodeResponseBody self = new GetFunctionCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionCodeResponseBody setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public GetFunctionCodeResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
