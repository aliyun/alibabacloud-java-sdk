// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2IpsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The CIDR blocks of the POPs.</p>
     */
    @NameInMap("Vips")
    public java.util.List<String> vips;

    public static DescribeDcdnL2IpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2IpsResponseBody self = new DescribeDcdnL2IpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2IpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnL2IpsResponseBody setVips(java.util.List<String> vips) {
        this.vips = vips;
        return this;
    }
    public java.util.List<String> getVips() {
        return this.vips;
    }

}
