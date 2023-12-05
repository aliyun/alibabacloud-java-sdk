// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaAppsResponseBody extends TeaModel {
    @NameInMap("ListMcubeNebulaAppsResult")
    public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult listMcubeNebulaAppsResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeNebulaAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeNebulaAppsResponseBody self = new ListMcubeNebulaAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeNebulaAppsResponseBody setListMcubeNebulaAppsResult(ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult listMcubeNebulaAppsResult) {
        this.listMcubeNebulaAppsResult = listMcubeNebulaAppsResult;
        return this;
    }
    public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult getListMcubeNebulaAppsResult() {
        return this.listMcubeNebulaAppsResult;
    }

    public ListMcubeNebulaAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeNebulaAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeNebulaAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos extends TeaModel {
        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        public static ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos self = new ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos();
            return TeaModel.build(map, self);
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

    }

    public static class ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("NebulaAppInfos")
        public java.util.List<ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos> nebulaAppInfos;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult self = new ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setNebulaAppInfos(java.util.List<ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos> nebulaAppInfos) {
            this.nebulaAppInfos = nebulaAppInfos;
            return this;
        }
        public java.util.List<ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResultNebulaAppInfos> getNebulaAppInfos() {
            return this.nebulaAppInfos;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMcubeNebulaAppsResponseBodyListMcubeNebulaAppsResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
