// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ExportMappCenterAppConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ExportMappCenterAppConfigResult")
    @Validation(required = true)
    public ExportMappCenterAppConfigResponseExportMappCenterAppConfigResult exportMappCenterAppConfigResult;

    public static ExportMappCenterAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMappCenterAppConfigResponse self = new ExportMappCenterAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public static class ExportMappCenterAppConfigResponseExportMappCenterAppConfigResult extends TeaModel {
        @NameInMap("ConfigDownloadUrl")
        @Validation(required = true)
        public String configDownloadUrl;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static ExportMappCenterAppConfigResponseExportMappCenterAppConfigResult build(java.util.Map<String, ?> map) throws Exception {
            ExportMappCenterAppConfigResponseExportMappCenterAppConfigResult self = new ExportMappCenterAppConfigResponseExportMappCenterAppConfigResult();
            return TeaModel.build(map, self);
        }

    }

}
