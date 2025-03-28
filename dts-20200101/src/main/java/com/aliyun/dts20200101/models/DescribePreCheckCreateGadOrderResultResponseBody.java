// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckCreateGadOrderResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>present environment is not support,so skip.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>gad-bp1i99e8l7913****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PreCheckItems")
    public DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems preCheckItems;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("PreCheckResult")
    public Boolean preCheckResult;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>92E1E99D-5224-4AD3-8C94-23A3516B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>11****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribePreCheckCreateGadOrderResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckCreateGadOrderResultResponseBody self = new DescribePreCheckCreateGadOrderResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setPreCheckItems(DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems preCheckItems) {
        this.preCheckItems = preCheckItems;
        return this;
    }
    public DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems getPreCheckItems() {
        return this.preCheckItems;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setPreCheckResult(Boolean preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public Boolean getPreCheckResult() {
        return this.preCheckResult;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribePreCheckCreateGadOrderResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CHECK_MASTER_DB_STATUS</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems self = new DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems extends TeaModel {
        @NameInMap("PreCheckItems")
        public java.util.List<DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems> preCheckItems;

        public static DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems self = new DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems setPreCheckItems(java.util.List<DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems> preCheckItems) {
            this.preCheckItems = preCheckItems;
            return this;
        }
        public java.util.List<DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItemsPreCheckItems> getPreCheckItems() {
            return this.preCheckItems;
        }

    }

}
