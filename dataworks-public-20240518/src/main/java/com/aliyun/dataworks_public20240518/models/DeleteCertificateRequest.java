// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the workspace to which the certificate file belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>106560</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequest self = new DeleteCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteCertificateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
