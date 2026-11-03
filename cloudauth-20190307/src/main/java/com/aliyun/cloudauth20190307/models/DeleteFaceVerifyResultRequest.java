// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteFaceVerifyResultRequest extends TeaModel {
    /**
     * <p>The unique identifier for ID Verification.</p>
     * 
     * <strong>example:</strong>
     * <p>shae18209d29ce4e8ba252caae98ab15</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>Specifies whether the deletion relies on the data retrieved from the corresponding verification process. Valid values:</p>
     * <ul>
     * <li>Y: Yes. To successfully delete the related data, you must have obtained the processing result by calling the DescribeFaceVerify operation.</li>
     * <li>N: No. This is the default value. You can directly set this parameter to N when you use the server-only API integration mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("DeleteAfterQuery")
    public String deleteAfterQuery;

    public static DeleteFaceVerifyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceVerifyResultRequest self = new DeleteFaceVerifyResultRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceVerifyResultRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DeleteFaceVerifyResultRequest setDeleteAfterQuery(String deleteAfterQuery) {
        this.deleteAfterQuery = deleteAfterQuery;
        return this;
    }
    public String getDeleteAfterQuery() {
        return this.deleteAfterQuery;
    }

}
