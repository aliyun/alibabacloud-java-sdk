// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserProduceOperateLogsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUserProduceOperateLogsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0DCBE2FF-2DFC-56DC-9A15-BDF27B7FFB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListUserProduceOperateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProduceOperateLogsResponseBody self = new ListUserProduceOperateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProduceOperateLogsResponseBody setData(java.util.List<ListUserProduceOperateLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserProduceOperateLogsResponseBodyData> getData() {
        return this.data;
    }

    public ListUserProduceOperateLogsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserProduceOperateLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserProduceOperateLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProduceOperateLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserProduceOperateLogsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListUserProduceOperateLogsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListUserProduceOperateLogsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>P20210928095324000002</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BizStatus")
        public Integer bizStatus;

        /**
         * <strong>example:</strong>
         * <p>esp.wangwen</p>
         */
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Note")
        public String note;

        @NameInMap("OperateName")
        public String operateName;

        /**
         * <strong>example:</strong>
         * <p>1695324000002</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("OperateUserType")
        public String operateUserType;

        /**
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("ToBizStatus")
        public Integer toBizStatus;

        public static ListUserProduceOperateLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserProduceOperateLogsResponseBodyData self = new ListUserProduceOperateLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserProduceOperateLogsResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUserProduceOperateLogsResponseBodyData setBizStatus(Integer bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public Integer getBizStatus() {
            return this.bizStatus;
        }

        public ListUserProduceOperateLogsResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListUserProduceOperateLogsResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListUserProduceOperateLogsResponseBodyData setOperateName(String operateName) {
            this.operateName = operateName;
            return this;
        }
        public String getOperateName() {
            return this.operateName;
        }

        public ListUserProduceOperateLogsResponseBodyData setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public ListUserProduceOperateLogsResponseBodyData setOperateUserType(String operateUserType) {
            this.operateUserType = operateUserType;
            return this;
        }
        public String getOperateUserType() {
            return this.operateUserType;
        }

        public ListUserProduceOperateLogsResponseBodyData setToBizStatus(Integer toBizStatus) {
            this.toBizStatus = toBizStatus;
            return this;
        }
        public Integer getToBizStatus() {
            return this.toBizStatus;
        }

    }

}
