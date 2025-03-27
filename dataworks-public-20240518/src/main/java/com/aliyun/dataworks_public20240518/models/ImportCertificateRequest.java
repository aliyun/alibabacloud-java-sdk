// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CertificateFile")
    public String certificateFile;

    /**
     * <strong>example:</strong>
     * <p>This is a file</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca1.crt</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>106560</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ImportCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCertificateRequest self = new ImportCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ImportCertificateRequest setCertificateFile(String certificateFile) {
        this.certificateFile = certificateFile;
        return this;
    }
    public String getCertificateFile() {
        return this.certificateFile;
    }

    public ImportCertificateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportCertificateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
