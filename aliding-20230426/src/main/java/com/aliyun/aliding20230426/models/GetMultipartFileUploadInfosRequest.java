// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultipartFileUploadInfosRequest extends TeaModel {
    @NameInMap("Option")
    public GetMultipartFileUploadInfosRequestOption option;

    @NameInMap("PartNumbers")
    public java.util.List<Integer> partNumbers;

    @NameInMap("TenantContext")
    public GetMultipartFileUploadInfosRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>hwHPAAAAAipHxxxxx</p>
     */
    @NameInMap("UploadKey")
    public String uploadKey;

    public static GetMultipartFileUploadInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultipartFileUploadInfosRequest self = new GetMultipartFileUploadInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetMultipartFileUploadInfosRequest setOption(GetMultipartFileUploadInfosRequestOption option) {
        this.option = option;
        return this;
    }
    public GetMultipartFileUploadInfosRequestOption getOption() {
        return this.option;
    }

    public GetMultipartFileUploadInfosRequest setPartNumbers(java.util.List<Integer> partNumbers) {
        this.partNumbers = partNumbers;
        return this;
    }
    public java.util.List<Integer> getPartNumbers() {
        return this.partNumbers;
    }

    public GetMultipartFileUploadInfosRequest setTenantContext(GetMultipartFileUploadInfosRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetMultipartFileUploadInfosRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetMultipartFileUploadInfosRequest setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
        return this;
    }
    public String getUploadKey() {
        return this.uploadKey;
    }

    public static class GetMultipartFileUploadInfosRequestOption extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PreferIntranet")
        public Boolean preferIntranet;

        public static GetMultipartFileUploadInfosRequestOption build(java.util.Map<String, ?> map) throws Exception {
            GetMultipartFileUploadInfosRequestOption self = new GetMultipartFileUploadInfosRequestOption();
            return TeaModel.build(map, self);
        }

        public GetMultipartFileUploadInfosRequestOption setPreferIntranet(Boolean preferIntranet) {
            this.preferIntranet = preferIntranet;
            return this;
        }
        public Boolean getPreferIntranet() {
            return this.preferIntranet;
        }

    }

    public static class GetMultipartFileUploadInfosRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetMultipartFileUploadInfosRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultipartFileUploadInfosRequestTenantContext self = new GetMultipartFileUploadInfosRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetMultipartFileUploadInfosRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
