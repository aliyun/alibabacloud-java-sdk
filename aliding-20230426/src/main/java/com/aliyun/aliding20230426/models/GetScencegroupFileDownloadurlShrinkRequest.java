// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScencegroupFileDownloadurlShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc*****xyz</p>
     */
    @NameInMap("DownloadCode")
    public String downloadCode;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetScencegroupFileDownloadurlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScencegroupFileDownloadurlShrinkRequest self = new GetScencegroupFileDownloadurlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetScencegroupFileDownloadurlShrinkRequest setDownloadCode(String downloadCode) {
        this.downloadCode = downloadCode;
        return this;
    }
    public String getDownloadCode() {
        return this.downloadCode;
    }

    public GetScencegroupFileDownloadurlShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
