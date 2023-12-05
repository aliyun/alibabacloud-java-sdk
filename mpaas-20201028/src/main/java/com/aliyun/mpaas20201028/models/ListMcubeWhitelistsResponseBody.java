// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeWhitelistsResponseBody extends TeaModel {
    @NameInMap("ListWhitelistResult")
    public ListMcubeWhitelistsResponseBodyListWhitelistResult listWhitelistResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeWhitelistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeWhitelistsResponseBody self = new ListMcubeWhitelistsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeWhitelistsResponseBody setListWhitelistResult(ListMcubeWhitelistsResponseBodyListWhitelistResult listWhitelistResult) {
        this.listWhitelistResult = listWhitelistResult;
        return this;
    }
    public ListMcubeWhitelistsResponseBodyListWhitelistResult getListWhitelistResult() {
        return this.listWhitelistResult;
    }

    public ListMcubeWhitelistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeWhitelistsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeWhitelistsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("WhiteListCount")
        public Long whiteListCount;

        @NameInMap("WhiteListName")
        public String whiteListName;

        @NameInMap("WhitelistType")
        public String whitelistType;

        public static ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists self = new ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists();
            return TeaModel.build(map, self);
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists setWhiteListCount(Long whiteListCount) {
            this.whiteListCount = whiteListCount;
            return this;
        }
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists setWhiteListName(String whiteListName) {
            this.whiteListName = whiteListName;
            return this;
        }
        public String getWhiteListName() {
            return this.whiteListName;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists setWhitelistType(String whitelistType) {
            this.whitelistType = whitelistType;
            return this;
        }
        public String getWhitelistType() {
            return this.whitelistType;
        }

    }

    public static class ListMcubeWhitelistsResponseBodyListWhitelistResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Whitelists")
        public java.util.List<ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists> whitelists;

        public static ListMcubeWhitelistsResponseBodyListWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeWhitelistsResponseBodyListWhitelistResult self = new ListMcubeWhitelistsResponseBodyListWhitelistResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListMcubeWhitelistsResponseBodyListWhitelistResult setWhitelists(java.util.List<ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists> whitelists) {
            this.whitelists = whitelists;
            return this;
        }
        public java.util.List<ListMcubeWhitelistsResponseBodyListWhitelistResultWhitelists> getWhitelists() {
            return this.whitelists;
        }

    }

}
