// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSemantemeSearchSaveRequest extends TeaModel {
    @NameInMap("path")
    public String path;

    @NameInMap("semanteme")
    public String semanteme;

    @NameInMap("sourceOss")
    public OpenapiSemantemeSearchSaveRequestSourceOss sourceOss;

    @NameInMap("tenantCode")
    public String tenantCode;

    @NameInMap("topN")
    public Integer topN;

    @NameInMap("workspaceCode")
    public String workspaceCode;

    public static OpenapiSemantemeSearchSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSemantemeSearchSaveRequest self = new OpenapiSemantemeSearchSaveRequest();
        return TeaModel.build(map, self);
    }

    public OpenapiSemantemeSearchSaveRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public OpenapiSemantemeSearchSaveRequest setSemanteme(String semanteme) {
        this.semanteme = semanteme;
        return this;
    }
    public String getSemanteme() {
        return this.semanteme;
    }

    public OpenapiSemantemeSearchSaveRequest setSourceOss(OpenapiSemantemeSearchSaveRequestSourceOss sourceOss) {
        this.sourceOss = sourceOss;
        return this;
    }
    public OpenapiSemantemeSearchSaveRequestSourceOss getSourceOss() {
        return this.sourceOss;
    }

    public OpenapiSemantemeSearchSaveRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public OpenapiSemantemeSearchSaveRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public OpenapiSemantemeSearchSaveRequest setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }
    public String getWorkspaceCode() {
        return this.workspaceCode;
    }

    public static class OpenapiSemantemeSearchSaveRequestSourceOss extends TeaModel {
        @NameInMap("accessId")
        public String accessId;

        @NameInMap("accessKey")
        public String accessKey;

        @NameInMap("bucket")
        public String bucket;

        @NameInMap("endpoint")
        public String endpoint;

        public static OpenapiSemantemeSearchSaveRequestSourceOss build(java.util.Map<String, ?> map) throws Exception {
            OpenapiSemantemeSearchSaveRequestSourceOss self = new OpenapiSemantemeSearchSaveRequestSourceOss();
            return TeaModel.build(map, self);
        }

        public OpenapiSemantemeSearchSaveRequestSourceOss setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public OpenapiSemantemeSearchSaveRequestSourceOss setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public OpenapiSemantemeSearchSaveRequestSourceOss setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public OpenapiSemantemeSearchSaveRequestSourceOss setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

}
