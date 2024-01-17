// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNotifyMeResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetNotifyMeResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetNotifyMeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNotifyMeResponseBody self = new GetNotifyMeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNotifyMeResponseBody setData(java.util.List<GetNotifyMeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNotifyMeResponseBodyData> getData() {
        return this.data;
    }

    public GetNotifyMeResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetNotifyMeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNotifyMeResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetNotifyMeResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetNotifyMeResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetNotifyMeResponseBodyData extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("CreatorUserId")
        public String creatorUserId;

        @NameInMap("FormInstanceId")
        public String formInstanceId;

        @NameInMap("InstStatus")
        public String instStatus;

        @NameInMap("MobileUrl")
        public String mobileUrl;

        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        public static GetNotifyMeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNotifyMeResponseBodyData self = new GetNotifyMeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNotifyMeResponseBodyData setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetNotifyMeResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetNotifyMeResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetNotifyMeResponseBodyData setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public GetNotifyMeResponseBodyData setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public GetNotifyMeResponseBodyData setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public GetNotifyMeResponseBodyData setInstStatus(String instStatus) {
            this.instStatus = instStatus;
            return this;
        }
        public String getInstStatus() {
            return this.instStatus;
        }

        public GetNotifyMeResponseBodyData setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public GetNotifyMeResponseBodyData setModifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

    }

}
