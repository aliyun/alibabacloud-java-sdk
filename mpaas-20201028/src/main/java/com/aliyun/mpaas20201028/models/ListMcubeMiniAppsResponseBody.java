// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniAppsResponseBody extends TeaModel {
    @NameInMap("ListMiniResult")
    public ListMcubeMiniAppsResponseBodyListMiniResult listMiniResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeMiniAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniAppsResponseBody self = new ListMcubeMiniAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeMiniAppsResponseBody setListMiniResult(ListMcubeMiniAppsResponseBodyListMiniResult listMiniResult) {
        this.listMiniResult = listMiniResult;
        return this;
    }
    public ListMcubeMiniAppsResponseBodyListMiniResult getListMiniResult() {
        return this.listMiniResult;
    }

    public ListMcubeMiniAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeMiniAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeMiniAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        public static ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList self = new ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList();
            return TeaModel.build(map, self);
        }

        public ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

    }

    public static class ListMcubeMiniAppsResponseBodyListMiniResult extends TeaModel {
        @NameInMap("MiniProgramList")
        public java.util.List<ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList> miniProgramList;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListMcubeMiniAppsResponseBodyListMiniResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniAppsResponseBodyListMiniResult self = new ListMcubeMiniAppsResponseBodyListMiniResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeMiniAppsResponseBodyListMiniResult setMiniProgramList(java.util.List<ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList> miniProgramList) {
            this.miniProgramList = miniProgramList;
            return this;
        }
        public java.util.List<ListMcubeMiniAppsResponseBodyListMiniResultMiniProgramList> getMiniProgramList() {
            return this.miniProgramList;
        }

        public ListMcubeMiniAppsResponseBodyListMiniResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeMiniAppsResponseBodyListMiniResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
