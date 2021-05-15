// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMediaSettleInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public QueryMediaSettleInfoResponseModel model;

    public static QueryMediaSettleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaSettleInfoResponse self = new QueryMediaSettleInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaSettleInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMediaSettleInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMediaSettleInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMediaSettleInfoResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMediaSettleInfoResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMediaSettleInfoResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMediaSettleInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMediaSettleInfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryMediaSettleInfoResponse setModel(QueryMediaSettleInfoResponseModel model) {
        this.model = model;
        return this;
    }
    public QueryMediaSettleInfoResponseModel getModel() {
        return this.model;
    }

    public static class QueryMediaSettleInfoResponseModelMediaSettleInfoList extends TeaModel {
        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("ModifiedDate")
        @Validation(required = true)
        public String modifiedDate;

        @NameInMap("MediaSettleDetailId")
        @Validation(required = true)
        public String mediaSettleDetailId;

        @NameInMap("MediaName")
        @Validation(required = true)
        public String mediaName;

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

        @NameInMap("MediaSettleAmount")
        @Validation(required = true)
        public String mediaSettleAmount;

        @NameInMap("ChannelId")
        @Validation(required = true)
        public String channelId;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public String extInfo;

        public static QueryMediaSettleInfoResponseModelMediaSettleInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaSettleInfoResponseModelMediaSettleInfoList self = new QueryMediaSettleInfoResponseModelMediaSettleInfoList();
            return TeaModel.build(map, self);
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setMediaSettleDetailId(String mediaSettleDetailId) {
            this.mediaSettleDetailId = mediaSettleDetailId;
            return this;
        }
        public String getMediaSettleDetailId() {
            return this.mediaSettleDetailId;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setSettleNo(String settleNo) {
            this.settleNo = settleNo;
            return this;
        }
        public String getSettleNo() {
            return this.settleNo;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setMediaSettleAmount(String mediaSettleAmount) {
            this.mediaSettleAmount = mediaSettleAmount;
            return this;
        }
        public String getMediaSettleAmount() {
            return this.mediaSettleAmount;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryMediaSettleInfoResponseModelMediaSettleInfoList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

    }

    public static class QueryMediaSettleInfoResponseModel extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("MediaSettleInfoList")
        @Validation(required = true)
        public java.util.List<QueryMediaSettleInfoResponseModelMediaSettleInfoList> mediaSettleInfoList;

        public static QueryMediaSettleInfoResponseModel build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaSettleInfoResponseModel self = new QueryMediaSettleInfoResponseModel();
            return TeaModel.build(map, self);
        }

        public QueryMediaSettleInfoResponseModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMediaSettleInfoResponseModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryMediaSettleInfoResponseModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryMediaSettleInfoResponseModel setMediaSettleInfoList(java.util.List<QueryMediaSettleInfoResponseModelMediaSettleInfoList> mediaSettleInfoList) {
            this.mediaSettleInfoList = mediaSettleInfoList;
            return this;
        }
        public java.util.List<QueryMediaSettleInfoResponseModelMediaSettleInfoList> getMediaSettleInfoList() {
            return this.mediaSettleInfoList;
        }

    }

}
