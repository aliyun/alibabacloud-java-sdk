// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAdvertisementSettleInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Model")
    public QueryAdvertisementSettleInfoResponseBodyModel model;

    public static QueryAdvertisementSettleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvertisementSettleInfoResponseBody self = new QueryAdvertisementSettleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAdvertisementSettleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAdvertisementSettleInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAdvertisementSettleInfoResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryAdvertisementSettleInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAdvertisementSettleInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAdvertisementSettleInfoResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryAdvertisementSettleInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAdvertisementSettleInfoResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryAdvertisementSettleInfoResponseBody setModel(QueryAdvertisementSettleInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryAdvertisementSettleInfoResponseBodyModel getModel() {
        return this.model;
    }

    public static class QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList extends TeaModel {
        @NameInMap("AdvertiseSettleDetailId")
        public String advertiseSettleDetailId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("MediaSettleDetailId")
        public String mediaSettleDetailId;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SettleNo")
        public String settleNo;

        @NameInMap("AdvertiseSettleAmount")
        public String advertiseSettleAmount;

        @NameInMap("SettleStatus")
        public String settleStatus;

        @NameInMap("AdvertiseName")
        public String advertiseName;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ModifiedDate")
        public String modifiedDate;

        public static QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList self = new QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList();
            return TeaModel.build(map, self);
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setAdvertiseSettleDetailId(String advertiseSettleDetailId) {
            this.advertiseSettleDetailId = advertiseSettleDetailId;
            return this;
        }
        public String getAdvertiseSettleDetailId() {
            return this.advertiseSettleDetailId;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setMediaSettleDetailId(String mediaSettleDetailId) {
            this.mediaSettleDetailId = mediaSettleDetailId;
            return this;
        }
        public String getMediaSettleDetailId() {
            return this.mediaSettleDetailId;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setSettleNo(String settleNo) {
            this.settleNo = settleNo;
            return this;
        }
        public String getSettleNo() {
            return this.settleNo;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setAdvertiseSettleAmount(String advertiseSettleAmount) {
            this.advertiseSettleAmount = advertiseSettleAmount;
            return this;
        }
        public String getAdvertiseSettleAmount() {
            return this.advertiseSettleAmount;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setAdvertiseName(String advertiseName) {
            this.advertiseName = advertiseName;
            return this;
        }
        public String getAdvertiseName() {
            return this.advertiseName;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

    }

    public static class QueryAdvertisementSettleInfoResponseBodyModel extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("AdvertiseSettleInfoList")
        public java.util.List<QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList> advertiseSettleInfoList;

        public static QueryAdvertisementSettleInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvertisementSettleInfoResponseBodyModel self = new QueryAdvertisementSettleInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryAdvertisementSettleInfoResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAdvertisementSettleInfoResponseBodyModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryAdvertisementSettleInfoResponseBodyModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAdvertisementSettleInfoResponseBodyModel setAdvertiseSettleInfoList(java.util.List<QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList> advertiseSettleInfoList) {
            this.advertiseSettleInfoList = advertiseSettleInfoList;
            return this;
        }
        public java.util.List<QueryAdvertisementSettleInfoResponseBodyModelAdvertiseSettleInfoList> getAdvertiseSettleInfoList() {
            return this.advertiseSettleInfoList;
        }

    }

}
