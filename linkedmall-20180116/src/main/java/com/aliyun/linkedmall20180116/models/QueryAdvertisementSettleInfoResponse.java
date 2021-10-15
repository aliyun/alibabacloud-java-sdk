// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAdvertisementSettleInfoResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public QueryAdvertisementSettleInfoResponseModel model;

    public static QueryAdvertisementSettleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvertisementSettleInfoResponse self = new QueryAdvertisementSettleInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdvertisementSettleInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAdvertisementSettleInfoResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryAdvertisementSettleInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAdvertisementSettleInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAdvertisementSettleInfoResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryAdvertisementSettleInfoResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryAdvertisementSettleInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAdvertisementSettleInfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAdvertisementSettleInfoResponse setModel(QueryAdvertisementSettleInfoResponseModel model) {
        this.model = model;
        return this;
    }
    public QueryAdvertisementSettleInfoResponseModel getModel() {
        return this.model;
    }

    public static class QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList extends TeaModel {
        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("ModifiedDate")
        @Validation(required = true)
        public String modifiedDate;

        @NameInMap("AdvertiseSettleDetailId")
        @Validation(required = true)
        public String advertiseSettleDetailId;

        @NameInMap("AdvertiseName")
        @Validation(required = true)
        public String advertiseName;

        @NameInMap("SettleNo")
        @Validation(required = true)
        public String settleNo;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("SettleStatus")
        @Validation(required = true)
        public String settleStatus;

        @NameInMap("AdvertiseSettleAmount")
        @Validation(required = true)
        public String advertiseSettleAmount;

        @NameInMap("ChannelId")
        @Validation(required = true)
        public String channelId;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public String extInfo;

        @NameInMap("MediaSettleDetailId")
        @Validation(required = true)
        public String mediaSettleDetailId;

        public static QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList self = new QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList();
            return TeaModel.build(map, self);
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setAdvertiseSettleDetailId(String advertiseSettleDetailId) {
            this.advertiseSettleDetailId = advertiseSettleDetailId;
            return this;
        }
        public String getAdvertiseSettleDetailId() {
            return this.advertiseSettleDetailId;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setAdvertiseName(String advertiseName) {
            this.advertiseName = advertiseName;
            return this;
        }
        public String getAdvertiseName() {
            return this.advertiseName;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setSettleNo(String settleNo) {
            this.settleNo = settleNo;
            return this;
        }
        public String getSettleNo() {
            return this.settleNo;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setAdvertiseSettleAmount(String advertiseSettleAmount) {
            this.advertiseSettleAmount = advertiseSettleAmount;
            return this;
        }
        public String getAdvertiseSettleAmount() {
            return this.advertiseSettleAmount;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList setMediaSettleDetailId(String mediaSettleDetailId) {
            this.mediaSettleDetailId = mediaSettleDetailId;
            return this;
        }
        public String getMediaSettleDetailId() {
            return this.mediaSettleDetailId;
        }

    }

    public static class QueryAdvertisementSettleInfoResponseModel extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("AdvertiseSettleInfoList")
        @Validation(required = true)
        public java.util.List<QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList> advertiseSettleInfoList;

        public static QueryAdvertisementSettleInfoResponseModel build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvertisementSettleInfoResponseModel self = new QueryAdvertisementSettleInfoResponseModel();
            return TeaModel.build(map, self);
        }

        public QueryAdvertisementSettleInfoResponseModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAdvertisementSettleInfoResponseModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryAdvertisementSettleInfoResponseModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAdvertisementSettleInfoResponseModel setAdvertiseSettleInfoList(java.util.List<QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList> advertiseSettleInfoList) {
            this.advertiseSettleInfoList = advertiseSettleInfoList;
            return this;
        }
        public java.util.List<QueryAdvertisementSettleInfoResponseModelAdvertiseSettleInfoList> getAdvertiseSettleInfoList() {
            return this.advertiseSettleInfoList;
        }

    }

}
