// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BuilderImageByParentResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is returned when the request fails. A successful response may not contain this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ExceedBuilderQuota</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned by this operation.</p>
     */
    @NameInMap("Data")
    public BuilderImageByParentResponseBodyData data;

    /**
     * <p>The error or result message. This parameter describes the cause when the request fails. A successful response may not contain this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>The maximum number of builders is reached.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is processed successfully. A value of true indicates that the request is processed successfully. To check whether the asynchronous task is completed, you must query the task status separately.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BuilderImageByParentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuilderImageByParentResponseBody self = new BuilderImageByParentResponseBody();
        return TeaModel.build(map, self);
    }

    public BuilderImageByParentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BuilderImageByParentResponseBody setData(BuilderImageByParentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BuilderImageByParentResponseBodyData getData() {
        return this.data;
    }

    public BuilderImageByParentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BuilderImageByParentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuilderImageByParentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BuilderImageByParentResponseBodyData extends TeaModel {
        /**
         * <p>The image ID, which is used for subsequent queries or modifications of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1example****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The task ID, which can be used to call GetTask to query the task status.</p>
         * 
         * <strong>example:</strong>
         * <p>tid-bp1example****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The image version ID, which is used to query or manage the specified version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-bp1example****</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static BuilderImageByParentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BuilderImageByParentResponseBodyData self = new BuilderImageByParentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BuilderImageByParentResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public BuilderImageByParentResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public BuilderImageByParentResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
