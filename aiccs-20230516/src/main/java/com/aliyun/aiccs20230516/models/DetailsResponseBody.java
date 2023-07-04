// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class DetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public DetailsResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static DetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailsResponseBody self = new DetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetailsResponseBody setModel(DetailsResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public DetailsResponseBodyModel getModel() {
        return this.model;
    }

    public DetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailsResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class DetailsResponseBodyModelList extends TeaModel {
        /**
         * <p>批次号</p>
         */
        @NameInMap("BatchId")
        public Long batchId;

        /**
         * <p>呼叫状态描述</p>
         */
        @NameInMap("CallDesc")
        public String callDesc;

        /**
         * <p>外呼ID</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫状态</p>
         */
        @NameInMap("CallStatus")
        public Long callStatus;

        /**
         * <p>外呼类型</p>
         */
        @NameInMap("CallType")
        public Long callType;

        /**
         * <p>导入时间</p>
         */
        @NameInMap("ImportTime")
        public String importTime;

        /**
         * <p>拦截原因</p>
         */
        @NameInMap("InterceptReason")
        public String interceptReason;

        /**
         * <p>外呼号码</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>号码状态描述</p>
         */
        @NameInMap("NumberDesc")
        public String numberDesc;

        /**
         * <p>外呼号码MD5</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        /**
         * <p>号码状态</p>
         */
        @NameInMap("NumberStatus")
        public Long numberStatus;

        /**
         * <p>用户自定义标签</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>任务ID</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static DetailsResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            DetailsResponseBodyModelList self = new DetailsResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public DetailsResponseBodyModelList setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public DetailsResponseBodyModelList setCallDesc(String callDesc) {
            this.callDesc = callDesc;
            return this;
        }
        public String getCallDesc() {
            return this.callDesc;
        }

        public DetailsResponseBodyModelList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public DetailsResponseBodyModelList setCallStatus(Long callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public Long getCallStatus() {
            return this.callStatus;
        }

        public DetailsResponseBodyModelList setCallType(Long callType) {
            this.callType = callType;
            return this;
        }
        public Long getCallType() {
            return this.callType;
        }

        public DetailsResponseBodyModelList setImportTime(String importTime) {
            this.importTime = importTime;
            return this;
        }
        public String getImportTime() {
            return this.importTime;
        }

        public DetailsResponseBodyModelList setInterceptReason(String interceptReason) {
            this.interceptReason = interceptReason;
            return this;
        }
        public String getInterceptReason() {
            return this.interceptReason;
        }

        public DetailsResponseBodyModelList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DetailsResponseBodyModelList setNumberDesc(String numberDesc) {
            this.numberDesc = numberDesc;
            return this;
        }
        public String getNumberDesc() {
            return this.numberDesc;
        }

        public DetailsResponseBodyModelList setNumberMD5(String numberMD5) {
            this.numberMD5 = numberMD5;
            return this;
        }
        public String getNumberMD5() {
            return this.numberMD5;
        }

        public DetailsResponseBodyModelList setNumberStatus(Long numberStatus) {
            this.numberStatus = numberStatus;
            return this;
        }
        public Long getNumberStatus() {
            return this.numberStatus;
        }

        public DetailsResponseBodyModelList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DetailsResponseBodyModelList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class DetailsResponseBodyModel extends TeaModel {
        @NameInMap("List")
        public java.util.List<DetailsResponseBodyModelList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Float totalPage;

        public static DetailsResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            DetailsResponseBodyModel self = new DetailsResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public DetailsResponseBodyModel setList(java.util.List<DetailsResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DetailsResponseBodyModelList> getList() {
            return this.list;
        }

        public DetailsResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public DetailsResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DetailsResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DetailsResponseBodyModel setTotalPage(Float totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Float getTotalPage() {
            return this.totalPage;
        }

    }

}
