// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListExternalSAMLIdPCertificatesRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static ListExternalSAMLIdPCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExternalSAMLIdPCertificatesRequest self = new ListExternalSAMLIdPCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListExternalSAMLIdPCertificatesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
