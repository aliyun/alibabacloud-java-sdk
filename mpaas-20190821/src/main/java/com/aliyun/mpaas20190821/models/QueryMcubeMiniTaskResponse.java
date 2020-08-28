// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("QueryMiniTaskResult")
    @Validation(required = true)
    public QueryMcubeMiniTaskResponseQueryMiniTaskResult queryMiniTaskResult;

    public static QueryMcubeMiniTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniTaskResponse self = new QueryMcubeMiniTaskResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMcubeMiniTaskResponseQueryMiniTaskResultMiniTaskInfo extends TeaModel {
        @NameInMap("AppCode")
        @Validation(required = true)
        public String appCode;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("GreyConfigInfo")
        @Validation(required = true)
        public String greyConfigInfo;

        @NameInMap("GreyEndtime")
        @Validation(required = true)
        public String greyEndtime;

        @NameInMap("GreyEndtimeData")
        @Validation(required = true)
        public String greyEndtimeData;

        @NameInMap("GreyNum")
        @Validation(required = true)
        public Long greyNum;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Memo")
        @Validation(required = true)
        public String memo;

        @NameInMap("PackageId")
        @Validation(required = true)
        public Long packageId;

        @NameInMap("Platform")
        @Validation(required = true)
        public String platform;

        @NameInMap("ProductVersion")
        @Validation(required = true)
        public String productVersion;

        @NameInMap("PublishMode")
        @Validation(required = true)
        public Long publishMode;

        @NameInMap("PublishType")
        @Validation(required = true)
        public Long publishType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public Long taskStatus;

        @NameInMap("WhitelistIds")
        @Validation(required = true)
        public String whitelistIds;

        public static QueryMcubeMiniTaskResponseQueryMiniTaskResultMiniTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniTaskResponseQueryMiniTaskResultMiniTaskInfo self = new QueryMcubeMiniTaskResponseQueryMiniTaskResultMiniTaskInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMcubeMiniTaskResponseQueryMiniTaskResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("MiniTaskInfo")
        @Validation(required = true)
        public QueryMcubeMiniTaskResponseQueryMiniTaskResultMiniTaskInfo miniTaskInfo;

        public static QueryMcubeMiniTaskResponseQueryMiniTaskResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniTaskResponseQueryMiniTaskResult self = new QueryMcubeMiniTaskResponseQueryMiniTaskResult();
            return TeaModel.build(map, self);
        }

    }

}
