// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateProtocolMountTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the export directory for the protocol service.</p>
     */
    @NameInMap("ExportId")
    public String exportId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProtocolMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProtocolMountTargetResponseBody self = new CreateProtocolMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProtocolMountTargetResponseBody setExportId(String exportId) {
        this.exportId = exportId;
        return this;
    }
    public String getExportId() {
        return this.exportId;
    }

    public CreateProtocolMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
