// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckCreateGadOrderResultResponseBody extends TeaModel {
    /**
     * <p>The dynamic error code. This parameter will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>present environment is not support,so skip.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The instance ID of the GAD instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-bp1i99e8l7913****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PreCheckItems")
    public DescribePreCheckCreateGadOrderResultResponseBodyPreCheckItems preCheckItems;

    /**
     * <p>The overall precheck result.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("PreCheckResult")
    public Boolean preCheckResult;

    /**
     * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>92E1E99D-5224-4AD3-8C94-23A3516B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The ID of the precheck task.</p>
     * 
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
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

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
