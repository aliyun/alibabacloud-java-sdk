// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCorpAccomplishmentTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("data")
    public java.util.List<GetCorpAccomplishmentTasksResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("ActiveTimeGMT")
        public String activeTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ActualActionerId")
        public String actualActionerId;

        /**
         * <strong>example:</strong>
         * <p>APP_XCxxx</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("FinishTimeGMT")
        public String finishTimeGMT;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123456@li.com">123456@li.com</a></p>
         */
        @NameInMap("OriginatorEmail")
        public String originatorEmail;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OriginatorId")
        public String originatorId;

        /**
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("OriginatorName")
        public String originatorName;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("OriginatorNameInEnglish")
        public String originatorNameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>昵称</p>
         */
        @NameInMap("OriginatorNickName")
        public String originatorNickName;

        /**
         * <strong>example:</strong>
         * <p>english nick</p>
         */
        @NameInMap("OriginatorNickNameInEnglish")
        public String originatorNickNameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>originatorPhotoexample</p>
         */
        @NameInMap("OriginatorPhoto")
        public String originatorPhoto;

        /**
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("OutResult")
        public String outResult;

        /**
         * <strong>example:</strong>
         * <p>结果名称</p>
         */
        @NameInMap("OutResultName")
        public String outResultName;

        /**
         * <strong>example:</strong>
         * <p>instancexxxx</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
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
