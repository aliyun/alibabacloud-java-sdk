// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcubeMiniTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ListMiniTaskResult")
    @Validation(required = true)
    public ListMcubeMiniTasksResponseListMiniTaskResult listMiniTaskResult;

    public static ListMcubeMiniTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniTasksResponse self = new ListMcubeMiniTasksResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMcubeMiniTasksResponseListMiniTaskResultMiniTaskList extends TeaModel {
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

        public static ListMcubeMiniTasksResponseListMiniTaskResultMiniTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniTasksResponseListMiniTaskResultMiniTaskList self = new ListMcubeMiniTasksResponseListMiniTaskResultMiniTaskList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMcubeMiniTasksResponseListMiniTaskResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("MiniTaskList")
        @Validation(required = true)
        public java.util.List<ListMcubeMiniTasksResponseListMiniTaskResultMiniTaskList> miniTaskList;

        public static ListMcubeMiniTasksResponseListMiniTaskResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniTasksResponseListMiniTaskResult self = new ListMcubeMiniTasksResponseListMiniTaskResult();
            return TeaModel.build(map, self);
        }

    }

}
