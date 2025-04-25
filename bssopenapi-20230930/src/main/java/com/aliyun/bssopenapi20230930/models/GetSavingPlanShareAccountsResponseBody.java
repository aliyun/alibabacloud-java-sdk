// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanShareAccountsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetSavingPlanShareAccountsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSavingPlanShareAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanShareAccountsResponseBody self = new GetSavingPlanShareAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanShareAccountsResponseBody setData(java.util.List<GetSavingPlanShareAccountsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSavingPlanShareAccountsResponseBodyData> getData() {
        return this.data;
    }

    public GetSavingPlanShareAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSavingPlanShareAccountsResponseBodyDataShareTimeList extends TeaModel {
        @NameInMap("ShareEndTime")
        public String shareEndTime;

        @NameInMap("ShareStartTime")
        public String shareStartTime;

        public static GetSavingPlanShareAccountsResponseBodyDataShareTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanShareAccountsResponseBodyDataShareTimeList self = new GetSavingPlanShareAccountsResponseBodyDataShareTimeList();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanShareAccountsResponseBodyDataShareTimeList setShareEndTime(String shareEndTime) {
            this.shareEndTime = shareEndTime;
            return this;
        }
        public String getShareEndTime() {
            return this.shareEndTime;
        }

        public GetSavingPlanShareAccountsResponseBodyDataShareTimeList setShareStartTime(String shareStartTime) {
            this.shareStartTime = shareStartTime;
            return this;
        }
        public String getShareStartTime() {
            return this.shareStartTime;
        }

    }

    public static class GetSavingPlanShareAccountsResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("ShareTimeList")
        public java.util.List<GetSavingPlanShareAccountsResponseBodyDataShareTimeList> shareTimeList;

        public static GetSavingPlanShareAccountsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanShareAccountsResponseBodyData self = new GetSavingPlanShareAccountsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanShareAccountsResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetSavingPlanShareAccountsResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetSavingPlanShareAccountsResponseBodyData setShareTimeList(java.util.List<GetSavingPlanShareAccountsResponseBodyDataShareTimeList> shareTimeList) {
            this.shareTimeList = shareTimeList;
            return this;
        }
        public java.util.List<GetSavingPlanShareAccountsResponseBodyDataShareTimeList> getShareTimeList() {
            return this.shareTimeList;
        }

    }

}
