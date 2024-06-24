// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailV2Headers extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>Dj2laAwE00</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static FlightOrderDetailV2Headers build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderDetailV2Headers self = new FlightOrderDetailV2Headers();
        return TeaModel.build(map, self);
    }

    public FlightOrderDetailV2Headers setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public FlightOrderDetailV2Headers setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
