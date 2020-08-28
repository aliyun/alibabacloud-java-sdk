// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class UploadMcubeMiniPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("UploadMiniPackageResult")
    @Validation(required = true)
    public UploadMcubeMiniPackageResponseUploadMiniPackageResult uploadMiniPackageResult;

    public static UploadMcubeMiniPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeMiniPackageResponse self = new UploadMcubeMiniPackageResponse();
        return TeaModel.build(map, self);
    }

    public static class UploadMcubeMiniPackageResponseUploadMiniPackageResultReturnPackageResult extends TeaModel {
        @NameInMap("DebugUrl")
        @Validation(required = true)
        public String debugUrl;

        @NameInMap("PackageId")
        @Validation(required = true)
        public String packageId;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        public static UploadMcubeMiniPackageResponseUploadMiniPackageResultReturnPackageResult build(java.util.Map<String, ?> map) throws Exception {
            UploadMcubeMiniPackageResponseUploadMiniPackageResultReturnPackageResult self = new UploadMcubeMiniPackageResponseUploadMiniPackageResultReturnPackageResult();
            return TeaModel.build(map, self);
        }

    }

    public static class UploadMcubeMiniPackageResponseUploadMiniPackageResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("ReturnPackageResult")
        @Validation(required = true)
        public UploadMcubeMiniPackageResponseUploadMiniPackageResultReturnPackageResult returnPackageResult;

        public static UploadMcubeMiniPackageResponseUploadMiniPackageResult build(java.util.Map<String, ?> map) throws Exception {
            UploadMcubeMiniPackageResponseUploadMiniPackageResult self = new UploadMcubeMiniPackageResponseUploadMiniPackageResult();
            return TeaModel.build(map, self);
        }

    }

}
