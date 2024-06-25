// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class DetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public DetailsResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>389b2d0a-37e2-406d-b576-1fc0827be46a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1686279332221</p>
     */
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
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("BatchId")
        public Long batchId;

        /**
         * <p>呼叫状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CallDesc")
        public String callDesc;

        /**
         * <p>外呼ID</p>
         * 
         * <strong>example:</strong>
         * <p>28dd74a4-30ec-43c0-9bec-272924c51eeb</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallStatus")
        public Long callStatus;

        /**
         * <p>外呼类型</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("CallType")
        public Long callType;

        /**
         * <p>导入时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-25 15:19:02</p>
         */
        @NameInMap("ImportTime")
        public String importTime;

        /**
         * <p>拦截原因</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("InterceptReason")
        public String interceptReason;

        /**
         * <p>外呼号码</p>
         * 
         * <strong>example:</strong>
         * <p>188******454</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>号码状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("NumberDesc")
        public String numberDesc;

        /**
         * <p>外呼号码MD5</p>
         * 
         * <strong>example:</strong>
         * <p>cbe1b40f76f2cca4735954886b706ffa</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        /**
         * <p>号码状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NumberStatus")
        public Long numberStatus;

        /**
         * <p>用户自定义标签</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
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

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>94</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>71.8132</p>
         */
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
