// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcubeMiniAppsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ListMiniResult")
    @Validation(required = true)
    public ListMcubeMiniAppsResponseListMiniResult listMiniResult;

    public static ListMcubeMiniAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniAppsResponse self = new ListMcubeMiniAppsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMcubeMiniAppsResponseListMiniResultMiniProgramList extends TeaModel {
        @NameInMap("AppCode")
        @Validation(required = true)
        public String appCode;

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

        public static ListMcubeMiniAppsResponseListMiniResultMiniProgramList build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniAppsResponseListMiniResultMiniProgramList self = new ListMcubeMiniAppsResponseListMiniResultMiniProgramList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMcubeMiniAppsResponseListMiniResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("MiniProgramList")
        @Validation(required = true)
        public java.util.List<ListMcubeMiniAppsResponseListMiniResultMiniProgramList> miniProgramList;

        public static ListMcubeMiniAppsResponseListMiniResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniAppsResponseListMiniResult self = new ListMcubeMiniAppsResponseListMiniResult();
            return TeaModel.build(map, self);
        }

    }

}
