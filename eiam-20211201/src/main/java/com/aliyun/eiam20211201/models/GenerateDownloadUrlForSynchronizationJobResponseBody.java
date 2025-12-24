// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateDownloadUrlForSynchronizationJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://test.oss.aliyuncs.com/idaas_ly77wa2oexrciw5v672vxxxx/tmp/eiam_user_export_1766469463365.csv">https://test.oss.aliyuncs.com/idaas_ly77wa2oexrciw5v672vxxxx/tmp/eiam_user_export_1766469463365.csv</a></p>
     */
    @NameInMap("FileDownloadUrl")
    public String fileDownloadUrl;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateDownloadUrlForSynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadUrlForSynchronizationJobResponseBody self = new GenerateDownloadUrlForSynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDownloadUrlForSynchronizationJobResponseBody setFileDownloadUrl(String fileDownloadUrl) {
        this.fileDownloadUrl = fileDownloadUrl;
        return this;
    }
    public String getFileDownloadUrl() {
        return this.fileDownloadUrl;
    }

    public GenerateDownloadUrlForSynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
