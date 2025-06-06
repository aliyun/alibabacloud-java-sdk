// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ImportEnterpriseAccelerateTargetsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eap-6457339b546c4cfb</p>
     */
    @NameInMap("EapId")
    public String eapId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://filename.xlsx">https://filename.xlsx</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    public static ImportEnterpriseAccelerateTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportEnterpriseAccelerateTargetsRequest self = new ImportEnterpriseAccelerateTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ImportEnterpriseAccelerateTargetsRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

    public ImportEnterpriseAccelerateTargetsRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
