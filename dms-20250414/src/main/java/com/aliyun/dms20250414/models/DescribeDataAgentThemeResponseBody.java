// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentThemeResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DescribeDataAgentThemeResponseBodyData data;

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

    public static DescribeDataAgentThemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentThemeResponseBody self = new DescribeDataAgentThemeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentThemeResponseBody setData(DescribeDataAgentThemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataAgentThemeResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataAgentThemeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDataAgentThemeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDataAgentThemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataAgentThemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDataAgentThemeResponseBodyData extends TeaModel {
        /**
         * <p>The common scenarios. Valid values: report, infographic, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-15T08:30:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The description of the theme.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly report</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The modification time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-20T10:15:30Z</p>
         */
        @NameInMap("ModifiedAt")
        public String modifiedAt;

        /**
         * <p>The theme tracing information. This field is currently not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>6d1e3f9a-<strong><strong>-</strong></strong>-****-2b8c4e6f0a1d</p>
         */
        @NameInMap("ReferTo")
        public String referTo;

        /**
         * <p>The source of the theme. Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ThemeFrom")
        public String themeFrom;

        /**
         * <p>The business ID of the theme.</p>
         * 
         * <strong>example:</strong>
         * <p>0f8b2c1d***********9a3e5f7b1c2d</p>
         */
        @NameInMap("ThemeId")
        public String themeId;

        /**
         * <p>The display name of the theme.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly report</p>
         */
        @NameInMap("ThemeName")
        public String themeName;

        /**
         * <p>The theme stage. Valid values:</p>
         * <ul>
         * <li>design: design.md only.</li>
         * <li>template: complete and renderable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        @NameInMap("ThemeType")
        public String themeType;

        public static DescribeDataAgentThemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentThemeResponseBodyData self = new DescribeDataAgentThemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentThemeResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDataAgentThemeResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeDataAgentThemeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataAgentThemeResponseBodyData setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public DescribeDataAgentThemeResponseBodyData setReferTo(String referTo) {
            this.referTo = referTo;
            return this;
        }
        public String getReferTo() {
            return this.referTo;
        }

        public DescribeDataAgentThemeResponseBodyData setThemeFrom(String themeFrom) {
            this.themeFrom = themeFrom;
            return this;
        }
        public String getThemeFrom() {
            return this.themeFrom;
        }

        public DescribeDataAgentThemeResponseBodyData setThemeId(String themeId) {
            this.themeId = themeId;
            return this;
        }
        public String getThemeId() {
            return this.themeId;
        }

        public DescribeDataAgentThemeResponseBodyData setThemeName(String themeName) {
            this.themeName = themeName;
            return this;
        }
        public String getThemeName() {
            return this.themeName;
        }

        public DescribeDataAgentThemeResponseBodyData setThemeType(String themeType) {
            this.themeType = themeType;
            return this;
        }
        public String getThemeType() {
            return this.themeType;
        }

    }

}
