// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateFileImportTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/idaas_ly77wa2oexrciw5v672vxxxx/tmp/eiam_v2_user_import_1766469463365.csv">https://test.oss-cn-hangzhou.aliyuncs.com/idaas_ly77wa2oexrciw5v672vxxxx/tmp/eiam_v2_user_import_1766469463365.csv</a></p>
     */
    @NameInMap("FileDownloadUrl")
    public String fileDownloadUrl;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateFileImportTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileImportTemplateResponseBody self = new GenerateFileImportTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateFileImportTemplateResponseBody setFileDownloadUrl(String fileDownloadUrl) {
        this.fileDownloadUrl = fileDownloadUrl;
        return this;
    }
    public String getFileDownloadUrl() {
        return this.fileDownloadUrl;
    }

    public GenerateFileImportTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
