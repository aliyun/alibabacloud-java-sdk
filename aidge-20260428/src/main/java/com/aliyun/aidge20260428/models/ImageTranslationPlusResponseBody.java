// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationPlusResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submit status of the asynchronous task.</p>
     */
    @NameInMap("Data")
    public ImageTranslationPlusResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageTranslationPlusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationPlusResponseBody self = new ImageTranslationPlusResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageTranslationPlusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageTranslationPlusResponseBody setData(ImageTranslationPlusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageTranslationPlusResponseBodyData getData() {
        return this.data;
    }

    public ImageTranslationPlusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageTranslationPlusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageTranslationPlusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageTranslationPlusResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID. Use the queryTaskResult API to poll for results.</p>
         * 
         * <strong>example:</strong>
         * <p>task-abc123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImageTranslationPlusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageTranslationPlusResponseBodyData self = new ImageTranslationPlusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageTranslationPlusResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
