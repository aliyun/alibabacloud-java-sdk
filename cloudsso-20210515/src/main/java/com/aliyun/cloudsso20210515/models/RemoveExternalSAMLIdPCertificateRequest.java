// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemoveExternalSAMLIdPCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * <br>
     * <p>You can call the [ListExternalSAMLIdPCertificates](~~341629~~) operation to query the IDs of certificates.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static RemoveExternalSAMLIdPCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveExternalSAMLIdPCertificateRequest self = new RemoveExternalSAMLIdPCertificateRequest();
        return TeaModel.build(map, self);
    }

    public RemoveExternalSAMLIdPCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public RemoveExternalSAMLIdPCertificateRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
