// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiDocumentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102101</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetDataServiceApiDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiDocumentRequest self = new GetDataServiceApiDocumentRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiDocumentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDataServiceApiDocumentRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDataServiceApiDocumentRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
