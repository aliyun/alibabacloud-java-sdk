// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScencegroupFileDownloadurlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc*****xyz</p>
     */
    @NameInMap("DownloadCode")
    public String downloadCode;

    @NameInMap("TenantContext")
    public GetScencegroupFileDownloadurlRequestTenantContext tenantContext;

    public static GetScencegroupFileDownloadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScencegroupFileDownloadurlRequest self = new GetScencegroupFileDownloadurlRequest();
        return TeaModel.build(map, self);
    }

    public GetScencegroupFileDownloadurlRequest setDownloadCode(String downloadCode) {
        this.downloadCode = downloadCode;
        return this;
    }
    public String getDownloadCode() {
        return this.downloadCode;
    }

    public GetScencegroupFileDownloadurlRequest setTenantContext(GetScencegroupFileDownloadurlRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetScencegroupFileDownloadurlRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetScencegroupFileDownloadurlRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetScencegroupFileDownloadurlRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetScencegroupFileDownloadurlRequestTenantContext self = new GetScencegroupFileDownloadurlRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetScencegroupFileDownloadurlRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
