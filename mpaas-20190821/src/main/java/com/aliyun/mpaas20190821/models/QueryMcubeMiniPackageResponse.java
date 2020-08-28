// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("QueryMiniPackageResult")
    @Validation(required = true)
    public QueryMcubeMiniPackageResponseQueryMiniPackageResult queryMiniPackageResult;

    public static QueryMcubeMiniPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniPackageResponse self = new QueryMcubeMiniPackageResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMcubeMiniPackageResponseQueryMiniPackageResultMiniPackageInfo extends TeaModel {
        @NameInMap("AppCode")
        @Validation(required = true)
        public String appCode;

        @NameInMap("AutoInstall")
        @Validation(required = true)
        public Long autoInstall;

        @NameInMap("ClientVersionMax")
        @Validation(required = true)
        public String clientVersionMax;

        @NameInMap("ClientVersionMin")
        @Validation(required = true)
        public String clientVersionMin;

        @NameInMap("DownloadUrl")
        @Validation(required = true)
        public String downloadUrl;

        @NameInMap("ExtendInfo")
        @Validation(required = true)
        public String extendInfo;

        @NameInMap("ExtraData")
        @Validation(required = true)
        public String extraData;

        @NameInMap("FallbackBaseUrl")
        @Validation(required = true)
        public String fallbackBaseUrl;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("H5Id")
        @Validation(required = true)
        public String h5Id;

        @NameInMap("H5Name")
        @Validation(required = true)
        public String h5Name;

        @NameInMap("H5Version")
        @Validation(required = true)
        public String h5Version;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("InstallType")
        @Validation(required = true)
        public Long installType;

        @NameInMap("MainUrl")
        @Validation(required = true)
        public String mainUrl;

        @NameInMap("Memo")
        @Validation(required = true)
        public String memo;

        @NameInMap("PackageType")
        @Validation(required = true)
        public Long packageType;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("PublishPeriod")
        @Validation(required = true)
        public Long publishPeriod;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public Long resourceType;

        @NameInMap("Status")
        @Validation(required = true)
        public Long status;

        public static QueryMcubeMiniPackageResponseQueryMiniPackageResultMiniPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniPackageResponseQueryMiniPackageResultMiniPackageInfo self = new QueryMcubeMiniPackageResponseQueryMiniPackageResultMiniPackageInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMcubeMiniPackageResponseQueryMiniPackageResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("MiniPackageInfo")
        @Validation(required = true)
        public QueryMcubeMiniPackageResponseQueryMiniPackageResultMiniPackageInfo miniPackageInfo;

        public static QueryMcubeMiniPackageResponseQueryMiniPackageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniPackageResponseQueryMiniPackageResult self = new QueryMcubeMiniPackageResponseQueryMiniPackageResult();
            return TeaModel.build(map, self);
        }

    }

}
