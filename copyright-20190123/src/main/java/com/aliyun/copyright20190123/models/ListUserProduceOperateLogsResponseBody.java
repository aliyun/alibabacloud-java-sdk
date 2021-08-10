// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListUserProduceOperateLogsResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public java.util.List<ListUserProduceOperateLogsResponseBodyData> data;

    public static ListUserProduceOperateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProduceOperateLogsResponseBody self = new ListUserProduceOperateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProduceOperateLogsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
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

    public ListUserProduceOperateLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserProduceOperateLogsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public ListUserProduceOperateLogsResponseBody setData(java.util.List<ListUserProduceOperateLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserProduceOperateLogsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListUserProduceOperateLogsResponseBodyData extends TeaModel {
        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("OperateUserType")
        public String operateUserType;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Note")
        public String note;

        @NameInMap("OperateName")
        public String operateName;

        @NameInMap("BizStatus")
        public Integer bizStatus;

        @NameInMap("ToBizStatus")
        public Integer toBizStatus;

        @NameInMap("BizType")
        public String bizType;

        public static ListUserProduceOperateLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserProduceOperateLogsResponseBodyData self = new ListUserProduceOperateLogsResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListUserProduceOperateLogsResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
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

        public ListUserProduceOperateLogsResponseBodyData setBizStatus(Integer bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public Integer getBizStatus() {
            return this.bizStatus;
        }

        public ListUserProduceOperateLogsResponseBodyData setToBizStatus(Integer toBizStatus) {
            this.toBizStatus = toBizStatus;
            return this;
        }
        public Integer getToBizStatus() {
            return this.toBizStatus;
        }

        public ListUserProduceOperateLogsResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

}
