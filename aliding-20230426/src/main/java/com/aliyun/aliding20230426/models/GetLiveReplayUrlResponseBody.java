// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetLiveReplayUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx">https://xxxxxxxx</a></p>
     */
    @NameInMap("replayUrl")
    public String replayUrl;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetLiveReplayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveReplayUrlResponseBody self = new GetLiveReplayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveReplayUrlResponseBody setReplayUrl(String replayUrl) {
        this.replayUrl = replayUrl;
        return this;
    }
    public String getReplayUrl() {
        return this.replayUrl;
    }

    public GetLiveReplayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveReplayUrlResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetLiveReplayUrlResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
