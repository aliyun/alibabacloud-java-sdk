// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageByInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateImageByInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateImageByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageByInstanceResponseBody self = new CreateImageByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageByInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateImageByInstanceResponseBody setData(CreateImageByInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateImageByInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateImageByInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateImageByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageByInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateImageByInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>imgc-07hnjj5fp****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>tid-0abxi0lbih******</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>iv-0abxi0lbi*****</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static CreateImageByInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateImageByInstanceResponseBodyData self = new CreateImageByInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateImageByInstanceResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateImageByInstanceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateImageByInstanceResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
