// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportCertificateAdvanceRequest extends TeaModel {
    /**
     * <p>The certificate file to upload. Upload method: Upload the file by creating an InputStream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CertificateFile")
    public java.io.InputStream certificateFileObject;

    /**
     * <p>The description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a file</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The certificate file name. In a project workspace, certificate file names must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca1.crt</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the workspace to which the certificate file belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>106560</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ImportCertificateAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCertificateAdvanceRequest self = new ImportCertificateAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ImportCertificateAdvanceRequest setCertificateFileObject(java.io.InputStream certificateFileObject) {
        this.certificateFileObject = certificateFileObject;
        return this;
    }
    public java.io.InputStream getCertificateFileObject() {
        return this.certificateFileObject;
    }

    public ImportCertificateAdvanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportCertificateAdvanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportCertificateAdvanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
