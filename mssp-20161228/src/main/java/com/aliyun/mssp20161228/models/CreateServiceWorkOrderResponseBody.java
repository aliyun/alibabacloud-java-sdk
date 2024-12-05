// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class CreateServiceWorkOrderResponseBody extends TeaModel {
    /**
     * <p>Interface status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public CreateServiceWorkOrderResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The prompt message of the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7DC44321-7AAE-51CD-8E5F-CEB968569042</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateServiceWorkOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceWorkOrderResponseBody self = new CreateServiceWorkOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceWorkOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceWorkOrderResponseBody setData(CreateServiceWorkOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceWorkOrderResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceWorkOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateServiceWorkOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceWorkOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceWorkOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateServiceWorkOrderResponseBodyData extends TeaModel {
        /**
         * <p>Completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-07 16:45:01</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-04T02:19:55Z</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>426556</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Customer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1477832102462645</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>24-03-11 00:00:00</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>1978941</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Owner.</p>
         * 
         * <strong>example:</strong>
         * <p>426556</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21 15:25:25</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Work order details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;questionDetail&quot;:&quot;测试工单&quot;,&quot;answerDetail&quot;:&quot;&quot;}</p>
         */
        @NameInMap("WorkOrderDetail")
        public String workOrderDetail;

        /**
         * <p>Work order name.</p>
         * 
         * <strong>example:</strong>
         * <p>安全月报交付任务</p>
         */
        @NameInMap("WorkOrderName")
        public String workOrderName;

        /**
         * <p>Work order source.</p>
         * 
         * <strong>example:</strong>
         * <p>工单迁移</p>
         */
        @NameInMap("WorkOrderSource")
        public String workOrderSource;

        /**
         * <p>Work order status.</p>
         * 
         * <strong>example:</strong>
         * <p>UNPROCESSED</p>
         */
        @NameInMap("WorkOrderStatus")
        public String workOrderStatus;

        /**
         * <p>Work order type.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTH_REPORT</p>
         */
        @NameInMap("WorkOrderType")
        public String workOrderType;

        public static CreateServiceWorkOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceWorkOrderResponseBodyData self = new CreateServiceWorkOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceWorkOrderResponseBodyData setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public CreateServiceWorkOrderResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateServiceWorkOrderResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateServiceWorkOrderResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public CreateServiceWorkOrderResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateServiceWorkOrderResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateServiceWorkOrderResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public CreateServiceWorkOrderResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CreateServiceWorkOrderResponseBodyData setWorkOrderDetail(String workOrderDetail) {
            this.workOrderDetail = workOrderDetail;
            return this;
        }
        public String getWorkOrderDetail() {
            return this.workOrderDetail;
        }

        public CreateServiceWorkOrderResponseBodyData setWorkOrderName(String workOrderName) {
            this.workOrderName = workOrderName;
            return this;
        }
        public String getWorkOrderName() {
            return this.workOrderName;
        }

        public CreateServiceWorkOrderResponseBodyData setWorkOrderSource(String workOrderSource) {
            this.workOrderSource = workOrderSource;
            return this;
        }
        public String getWorkOrderSource() {
            return this.workOrderSource;
        }

        public CreateServiceWorkOrderResponseBodyData setWorkOrderStatus(String workOrderStatus) {
            this.workOrderStatus = workOrderStatus;
            return this;
        }
        public String getWorkOrderStatus() {
            return this.workOrderStatus;
        }

        public CreateServiceWorkOrderResponseBodyData setWorkOrderType(String workOrderType) {
            this.workOrderType = workOrderType;
            return this;
        }
        public String getWorkOrderType() {
            return this.workOrderType;
        }

    }

}
