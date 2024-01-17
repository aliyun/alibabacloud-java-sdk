// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCorpAccomplishmentTasksResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetCorpAccomplishmentTasksResponseBodyData> data;

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

    public static GetCorpAccomplishmentTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCorpAccomplishmentTasksResponseBody self = new GetCorpAccomplishmentTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCorpAccomplishmentTasksResponseBody setData(java.util.List<GetCorpAccomplishmentTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCorpAccomplishmentTasksResponseBodyData> getData() {
        return this.data;
    }

    public GetCorpAccomplishmentTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetCorpAccomplishmentTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCorpAccomplishmentTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetCorpAccomplishmentTasksResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetCorpAccomplishmentTasksResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetCorpAccomplishmentTasksResponseBodyData extends TeaModel {
        @NameInMap("ActiveTimeGMT")
        public String activeTimeGMT;

        @NameInMap("ActualActionerId")
        public String actualActionerId;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("FinishTimeGMT")
        public String finishTimeGMT;

        @NameInMap("OriginatorEmail")
        public String originatorEmail;

        @NameInMap("OriginatorId")
        public String originatorId;

        @NameInMap("OriginatorName")
        public String originatorName;

        @NameInMap("OriginatorNameInEnglish")
        public String originatorNameInEnglish;

        @NameInMap("OriginatorNickName")
        public String originatorNickName;

        @NameInMap("OriginatorNickNameInEnglish")
        public String originatorNickNameInEnglish;

        @NameInMap("OriginatorPhoto")
        public String originatorPhoto;

        @NameInMap("OutResult")
        public String outResult;

        @NameInMap("OutResultName")
        public String outResultName;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("Title")
        public String title;

        public static GetCorpAccomplishmentTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCorpAccomplishmentTasksResponseBodyData self = new GetCorpAccomplishmentTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCorpAccomplishmentTasksResponseBodyData setActiveTimeGMT(String activeTimeGMT) {
            this.activeTimeGMT = activeTimeGMT;
            return this;
        }
        public String getActiveTimeGMT() {
            return this.activeTimeGMT;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setActualActionerId(String actualActionerId) {
            this.actualActionerId = actualActionerId;
            return this;
        }
        public String getActualActionerId() {
            return this.actualActionerId;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setFinishTimeGMT(String finishTimeGMT) {
            this.finishTimeGMT = finishTimeGMT;
            return this;
        }
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOriginatorEmail(String originatorEmail) {
            this.originatorEmail = originatorEmail;
            return this;
        }
        public String getOriginatorEmail() {
            return this.originatorEmail;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOriginatorId(String originatorId) {
            this.originatorId = originatorId;
            return this;
        }
        public String getOriginatorId() {
            return this.originatorId;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOriginatorName(String originatorName) {
            this.originatorName = originatorName;
            return this;
        }
        public String getOriginatorName() {
            return this.originatorName;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOriginatorNameInEnglish(String originatorNameInEnglish) {
            this.originatorNameInEnglish = originatorNameInEnglish;
            return this;
        }
        public String getOriginatorNameInEnglish() {
            return this.originatorNameInEnglish;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOriginatorNickName(String originatorNickName) {
            this.originatorNickName = originatorNickName;
            return this;
        }
        public String getOriginatorNickName() {
            return this.originatorNickName;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOriginatorNickNameInEnglish(String originatorNickNameInEnglish) {
            this.originatorNickNameInEnglish = originatorNickNameInEnglish;
            return this;
        }
        public String getOriginatorNickNameInEnglish() {
            return this.originatorNickNameInEnglish;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOriginatorPhoto(String originatorPhoto) {
            this.originatorPhoto = originatorPhoto;
            return this;
        }
        public String getOriginatorPhoto() {
            return this.originatorPhoto;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOutResult(String outResult) {
            this.outResult = outResult;
            return this;
        }
        public String getOutResult() {
            return this.outResult;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setOutResultName(String outResultName) {
            this.outResultName = outResultName;
            return this;
        }
        public String getOutResultName() {
            return this.outResultName;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetCorpAccomplishmentTasksResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
