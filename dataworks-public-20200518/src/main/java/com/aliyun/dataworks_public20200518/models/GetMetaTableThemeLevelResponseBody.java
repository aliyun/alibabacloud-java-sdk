// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableThemeLevelResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Entity")
    public GetMetaTableThemeLevelResponseBodyEntity entity;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can troubleshoot errors based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableThemeLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableThemeLevelResponseBody self = new GetMetaTableThemeLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableThemeLevelResponseBody setEntity(GetMetaTableThemeLevelResponseBodyEntity entity) {
        this.entity = entity;
        return this;
    }
    public GetMetaTableThemeLevelResponseBodyEntity getEntity() {
        return this.entity;
    }

    public GetMetaTableThemeLevelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableThemeLevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableThemeLevelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableThemeLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableThemeLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableThemeLevelResponseBodyEntityLevel extends TeaModel {
        /**
         * <p>The description of the table level.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the table level.</p>
         */
        @NameInMap("LevelId")
        public Long levelId;

        /**
         * <p>The name of the table level.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the table level. Valid values:</p>
         * <br>
         * <p>*   1: indicates the logical level.</p>
         * <p>*   2: indicates the physical level.</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static GetMetaTableThemeLevelResponseBodyEntityLevel build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseBodyEntityLevel self = new GetMetaTableThemeLevelResponseBodyEntityLevel();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setLevelId(Long levelId) {
            this.levelId = levelId;
            return this;
        }
        public Long getLevelId() {
            return this.levelId;
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class GetMetaTableThemeLevelResponseBodyEntityTheme extends TeaModel {
        /**
         * <p>The level of the table folder. Valid values:</p>
         * <br>
         * <p>*   1: indicates a table folder of level 1.</p>
         * <p>*   2: indicates a table folder of level 2.</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The name of the table folder.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent table folder.</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The ID of the table folder.</p>
         */
        @NameInMap("ThemeId")
        public Long themeId;

        public static GetMetaTableThemeLevelResponseBodyEntityTheme build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseBodyEntityTheme self = new GetMetaTableThemeLevelResponseBodyEntityTheme();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

    }

    public static class GetMetaTableThemeLevelResponseBodyEntity extends TeaModel {
        /**
         * <p>The information about the table level.</p>
         */
        @NameInMap("Level")
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityLevel> level;

        /**
         * <p>The information about the table folder.</p>
         */
        @NameInMap("Theme")
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityTheme> theme;

        public static GetMetaTableThemeLevelResponseBodyEntity build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseBodyEntity self = new GetMetaTableThemeLevelResponseBodyEntity();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseBodyEntity setLevel(java.util.List<GetMetaTableThemeLevelResponseBodyEntityLevel> level) {
            this.level = level;
            return this;
        }
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityLevel> getLevel() {
            return this.level;
        }

        public GetMetaTableThemeLevelResponseBodyEntity setTheme(java.util.List<GetMetaTableThemeLevelResponseBodyEntityTheme> theme) {
            this.theme = theme;
            return this;
        }
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityTheme> getTheme() {
            return this.theme;
        }

    }

}
