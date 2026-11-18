// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetTransitMetaRequest extends TeaModel {
    /**
     * <p>The validity period of the temporary download URL generated for the current request, in milliseconds. The value must be an integer no less than 1000 and is rounded down to the nearest second. If ExpireMs is omitted, the default validity period is 900000 milliseconds, which indicates 15 minutes. A download URL is generated only when Network is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>900000</p>
     */
    @NameInMap("ExpireMs")
    public Long expireMs;

    /**
     * <p>The opaque object path returned by CreateTransitUploadPolicy. Specify at least one of FilePath and TransitId.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-bundle/tenant-demo/user-demo/20260904120000_code-review.zip</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The network type used for the download URL. Valid values: public and internal. If this parameter is omitted, no download URL is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The transit ID. Specify at least one of TransitId and FilePath. If both are provided, TransitId takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>transit_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("TransitId")
    public String transitId;

    public static GetTransitMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransitMetaRequest self = new GetTransitMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetTransitMetaRequest setExpireMs(Long expireMs) {
        this.expireMs = expireMs;
        return this;
    }
    public Long getExpireMs() {
        return this.expireMs;
    }

    public GetTransitMetaRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public GetTransitMetaRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public GetTransitMetaRequest setTransitId(String transitId) {
        this.transitId = transitId;
        return this;
    }
    public String getTransitId() {
        return this.transitId;
    }

}
