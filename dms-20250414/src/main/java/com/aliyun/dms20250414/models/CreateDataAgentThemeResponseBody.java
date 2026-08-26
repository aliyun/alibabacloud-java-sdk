// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentThemeResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public CreateDataAgentThemeResponseBodyData data;

    /**
     * <p>The error code returned when the request is abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataAgentThemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentThemeResponseBody self = new CreateDataAgentThemeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentThemeResponseBody setData(CreateDataAgentThemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAgentThemeResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAgentThemeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataAgentThemeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAgentThemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAgentThemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataAgentThemeResponseBodyData extends TeaModel {
        /**
         * <p>The OSS key of the theme file (dart/{uid}/{theme_id}/theme.zip, verified to exist before being stored in the database).</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The business identifier of the theme.</p>
         * 
         * <strong>example:</strong>
         * <p>0f8b2c1d************9a3e5f7b1c2d</p>
         */
        @NameInMap("ThemeId")
        public String themeId;

        public static CreateDataAgentThemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentThemeResponseBodyData self = new CreateDataAgentThemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentThemeResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public CreateDataAgentThemeResponseBodyData setThemeId(String themeId) {
            this.themeId = themeId;
            return this;
        }
        public String getThemeId() {
            return this.themeId;
        }

    }

}
