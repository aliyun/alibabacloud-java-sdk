// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetLogviewDownloadUrlRequest extends TeaModel {
    /**
     * <p>Specifies whether to use the OSS VPC endpoint to generate the download link. Valid values:</p>
     * <ul>
     * <li>false: Uses the default OSS endpoint.</li>
     * <li>true: Uses the OSS VPC endpoint configured on the server. The download client must have network access to this endpoint.
     * Default value: false. If this parameter is set to true and no OSS VPC endpoint is configured on the server, link generation fails and does not automatically fall back.</li>
     * </ul>
     */
    @NameInMap("useVpcEndpoint")
    public Boolean useVpcEndpoint;

    public static GetLogviewDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogviewDownloadUrlRequest self = new GetLogviewDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetLogviewDownloadUrlRequest setUseVpcEndpoint(Boolean useVpcEndpoint) {
        this.useVpcEndpoint = useVpcEndpoint;
        return this;
    }
    public Boolean getUseVpcEndpoint() {
        return this.useVpcEndpoint;
    }

}
