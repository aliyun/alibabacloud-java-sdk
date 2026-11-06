// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAndBindAppResponseBody extends TeaModel {
    /**
     * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned by the operation.</p>
     */
    @NameInMap("Data")
    public CreateAndBindAppResponseBodyData data;

    /**
     * <p>The error or result message. This field describes the cause when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. Provide this value when you troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is processed successfully. A value of true indicates that the request is processed successfully. To determine whether an asynchronous task is completed, query the task status separately.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAndBindAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndBindAppResponseBody self = new CreateAndBindAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndBindAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAndBindAppResponseBody setData(CreateAndBindAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAndBindAppResponseBodyData getData() {
        return this.data;
    }

    public CreateAndBindAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAndBindAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAndBindAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAndBindAppResponseBodyData extends TeaModel {
        /**
         * <p>The application ID, which is used to query the application or dissociate the image later.</p>
         * 
         * <strong>example:</strong>
         * <p>app-bp1example****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application version ID, which is used to locate a specified version of the application. This field is not the image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apv-bp1example****</p>
         */
        @NameInMap("AppVersionId")
        public String appVersionId;

        /**
         * <p>The image ID, which is used to query or modify the image later.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1example****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image version ID, which is used to query or manage a specified version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-bp1example****</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static CreateAndBindAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAndBindAppResponseBodyData self = new CreateAndBindAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAndBindAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAndBindAppResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public CreateAndBindAppResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateAndBindAppResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
