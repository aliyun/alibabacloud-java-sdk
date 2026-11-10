// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProviderDocumentResponseBody extends TeaModel {
    /**
     * <p>The Terraform provider resource document.</p>
     */
    @NameInMap("document")
    public String document;

    /**
     * <p>The Terraform provider version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.206.0</p>
     */
    @NameInMap("providerVersion")
    public String providerVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD478792-6952-5A1C-9F57-78932BF0FAC6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The Terraform resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud_route_table</p>
     */
    @NameInMap("terraformResourceType")
    public String terraformResourceType;

    public static GetProviderDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProviderDocumentResponseBody self = new GetProviderDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProviderDocumentResponseBody setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public GetProviderDocumentResponseBody setProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion;
        return this;
    }
    public String getProviderVersion() {
        return this.providerVersion;
    }

    public GetProviderDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProviderDocumentResponseBody setTerraformResourceType(String terraformResourceType) {
        this.terraformResourceType = terraformResourceType;
        return this;
    }
    public String getTerraformResourceType() {
        return this.terraformResourceType;
    }

}
