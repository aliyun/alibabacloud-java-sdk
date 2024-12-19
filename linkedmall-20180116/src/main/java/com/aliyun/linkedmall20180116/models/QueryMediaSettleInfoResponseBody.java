// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMediaSettleInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryMediaSettleInfoResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>FAED4911-3F7D-56C0-880F-C4755D4F26D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryMediaSettleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaSettleInfoResponseBody self = new QueryMediaSettleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaSettleInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMediaSettleInfoResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMediaSettleInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMediaSettleInfoResponseBody setModel(QueryMediaSettleInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryMediaSettleInfoResponseBodyModel getModel() {
        return this.model;
    }

    public QueryMediaSettleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMediaSettleInfoResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMediaSettleInfoResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMediaSettleInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMediaSettleInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>63839******79044</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>2021-08-01 00:00:00</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <strong>example:</strong>
         * <p>2021-08-01 01:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("MediaSettleAmount")
        public String mediaSettleAmount;

        @NameInMap("MediaSettleDetailId")
        public String mediaSettleDetailId;

        /**
         * <strong>example:</strong>
         * <p>2021-08-01 01:00:00</p>
         */
        @NameInMap("ModifiedDate")
        public String modifiedDate;

        /**
         * <strong>example:</strong>
         * <p>TEST000000</p>
         */
        @NameInMap("SettleNo")
        public String settleNo;

        /**
         * <strong>example:</strong>
         * <p>waitPayerConfirm</p>
         */
        @NameInMap("SettleStatus")
        public String settleStatus;

        /**
         * <strong>example:</strong>
         * <p>2021-08-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList self = new QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList();
            return TeaModel.build(map, self);
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setMediaSettleAmount(String mediaSettleAmount) {
            this.mediaSettleAmount = mediaSettleAmount;
            return this;
        }
        public String getMediaSettleAmount() {
            return this.mediaSettleAmount;
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

        public QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryMediaSettleInfoResponseBodyModel extends TeaModel {
        @NameInMap("MediaSettleInfoList")
        public java.util.List<QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList> mediaSettleInfoList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryMediaSettleInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaSettleInfoResponseBodyModel self = new QueryMediaSettleInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryMediaSettleInfoResponseBodyModel setMediaSettleInfoList(java.util.List<QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList> mediaSettleInfoList) {
            this.mediaSettleInfoList = mediaSettleInfoList;
            return this;
        }
        public java.util.List<QueryMediaSettleInfoResponseBodyModelMediaSettleInfoList> getMediaSettleInfoList() {
            return this.mediaSettleInfoList;
        }

        public QueryMediaSettleInfoResponseBodyModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryMediaSettleInfoResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMediaSettleInfoResponseBodyModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
