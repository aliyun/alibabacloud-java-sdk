// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMediaSettleInfoResponseBody extends TeaModel {
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
    public QueryMediaSettleInfoResponseBodyModel model;

    public static QueryMediaSettleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaSettleInfoResponseBody self = new QueryMediaSettleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaSettleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMediaSettleInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMediaSettleInfoResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMediaSettleInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMediaSettleInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMediaSettleInfoResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMediaSettleInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryMediaSettleInfoResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMediaSettleInfoResponseBody setModel(QueryMediaSettleInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryMediaSettleInfoResponseBodyModel getModel() {
        return this.model;
    }

    public static class QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("MediaSettleAmount")
        public String mediaSettleAmount;

        @NameInMap("SettleNo")
        public String settleNo;

        @NameInMap("SettleStatus")
        public String settleStatus;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("MediaSettleDetailId")
        public String mediaSettleDetailId;

        @NameInMap("ModifiedDate")
        public String modifiedDate;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("ExtInfo")
        public String extInfo;

        public static QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList self = new QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList();
            return TeaModel.build(map, self);
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setMediaSettleAmount(String mediaSettleAmount) {
            this.mediaSettleAmount = mediaSettleAmount;
            return this;
        }
        public String getMediaSettleAmount() {
            return this.mediaSettleAmount;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setSettleNo(String settleNo) {
            this.settleNo = settleNo;
            return this;
        }
        public String getSettleNo() {
            return this.settleNo;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setMediaSettleDetailId(String mediaSettleDetailId) {
            this.mediaSettleDetailId = mediaSettleDetailId;
            return this;
        }
        public String getMediaSettleDetailId() {
            return this.mediaSettleDetailId;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

    }

    public static class QueryMediaSettleInfoResponseBodyModel extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("MediaSettleInfoList")
        public java.util.List<QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList> mediaSettleInfoList;

        public static QueryMediaSettleInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaSettleInfoResponseBodyModel self = new QueryMediaSettleInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryMediaSettleInfoResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMediaSettleInfoResponseBodyModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryMediaSettleInfoResponseBodyModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryMediaSettleInfoResponseBodyModel setMediaSettleInfoList(java.util.List<QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList> mediaSettleInfoList) {
            this.mediaSettleInfoList = mediaSettleInfoList;
            return this;
        }
        public java.util.List<QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList> getMediaSettleInfoList() {
            return this.mediaSettleInfoList;
        }

    }

}
