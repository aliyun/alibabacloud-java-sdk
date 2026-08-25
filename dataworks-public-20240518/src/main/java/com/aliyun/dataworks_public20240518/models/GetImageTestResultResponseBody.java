// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetImageTestResultResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
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
    public Boolean success;

    /**
     * <p>The details of the image test result.</p>
     */
    @NameInMap("TestResult")
    public GetImageTestResultResponseBodyTestResult testResult;

    public static GetImageTestResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageTestResultResponseBody self = new GetImageTestResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageTestResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageTestResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetImageTestResultResponseBody setTestResult(GetImageTestResultResponseBodyTestResult testResult) {
        this.testResult = testResult;
        return this;
    }
    public GetImageTestResultResponseBodyTestResult getTestResult() {
        return this.testResult;
    }

    public static class GetImageTestResultResponseBodyTestResult extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom_image_xxxx_xxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The test result message.</p>
         * 
         * <strong>example:</strong>
         * <p>test finished</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The operation time, represented as a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The image publish status. Valid values:</p>
         * <ul>
         * <li>Untest: Not tested.</li>
         * <li>Testing: Testing in progress.</li>
         * <li>TestFailed: Test failed.</li>
         * <li>Unpublished: Not published.</li>
         * <li>Publishing: Publishing in progress.</li>
         * <li>Published: Published.</li>
         * <li>PublishFailed: Publish failed.</li>
         * <li>Building: Building in progress.</li>
         * <li>BuildSuccess: Build succeeded.</li>
         * <li>BuildFailed: Build failed.</li>
         * <li>Accelerating: Acceleration in progress.</li>
         * <li>AccelerateSuccess: Acceleration succeeded.</li>
         * <li>AccelerateFailed: Acceleration failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unpublished</p>
         */
        @NameInMap("PublishStage")
        public String publishStage;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_****</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The test process status. Valid values:</p>
         * <ul>
         * <li>running: Running.</li>
         * <li>completed: Completed.</li>
         * <li>failed: Failed.</li>
         * <li>cancelled: Cancelled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetImageTestResultResponseBodyTestResult build(java.util.Map<String, ?> map) throws Exception {
            GetImageTestResultResponseBodyTestResult self = new GetImageTestResultResponseBodyTestResult();
            return TeaModel.build(map, self);
        }

        public GetImageTestResultResponseBodyTestResult setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageTestResultResponseBodyTestResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetImageTestResultResponseBodyTestResult setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public GetImageTestResultResponseBodyTestResult setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public GetImageTestResultResponseBodyTestResult setPublishStage(String publishStage) {
            this.publishStage = publishStage;
            return this;
        }
        public String getPublishStage() {
            return this.publishStage;
        }

        public GetImageTestResultResponseBodyTestResult setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetImageTestResultResponseBodyTestResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
