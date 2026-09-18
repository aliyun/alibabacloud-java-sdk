// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetTransitMetaRequest extends TeaModel {
    /**
     * <p>The validity period of the temporary download URL, in milliseconds. The value must be an integer greater than or equal to 1000 and is rounded down to the nearest whole second. If <code>ExpireMs</code> is not specified, the default validity period is <code>900000</code> milliseconds (15 minutes). A download URL is generated only when <code>Network</code> is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>900000</p>
     */
    @NameInMap("ExpireMs")
    public Long expireMs;

    /**
     * <p>The opaque object path returned by <code>CreateTransitUploadPolicy</code>. Specify at least one of this parameter and <code>TransitId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-bundle/tenant-demo/user-demo/20260904120000_code-review.zip</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The network type for the download URL. Valid values: <code>public</code> and <code>internal</code>. If this parameter is not specified, no download URL is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The Transit ID. Specify at least one of this parameter and <code>FilePath</code>. If both are specified, this parameter takes precedence.</p>
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
