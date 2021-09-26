// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableThemeLevelResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Entity")
    public GetMetaTableThemeLevelResponseBodyEntity entity;

    public static GetMetaTableThemeLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableThemeLevelResponseBody self = new GetMetaTableThemeLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableThemeLevelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableThemeLevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public GetMetaTableThemeLevelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableThemeLevelResponseBody setEntity(GetMetaTableThemeLevelResponseBodyEntity entity) {
        this.entity = entity;
        return this;
    }
    public GetMetaTableThemeLevelResponseBodyEntity getEntity() {
        return this.entity;
    }

    public static class GetMetaTableThemeLevelResponseBodyEntityTheme extends TeaModel {
        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Level")
        public Integer level;

        public static GetMetaTableThemeLevelResponseBodyEntityTheme build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseBodyEntityTheme self = new GetMetaTableThemeLevelResponseBodyEntityTheme();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public GetMetaTableThemeLevelResponseBodyEntityTheme setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class GetMetaTableThemeLevelResponseBodyEntityLevel extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("LevelId")
        public Long levelId;

        public static GetMetaTableThemeLevelResponseBodyEntityLevel build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseBodyEntityLevel self = new GetMetaTableThemeLevelResponseBodyEntityLevel();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaTableThemeLevelResponseBodyEntityLevel setLevelId(Long levelId) {
            this.levelId = levelId;
            return this;
        }
        public Long getLevelId() {
            return this.levelId;
        }

    }

    public static class GetMetaTableThemeLevelResponseBodyEntity extends TeaModel {
        @NameInMap("Theme")
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityTheme> theme;

        @NameInMap("Level")
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityLevel> level;

        public static GetMetaTableThemeLevelResponseBodyEntity build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseBodyEntity self = new GetMetaTableThemeLevelResponseBodyEntity();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseBodyEntity setTheme(java.util.List<GetMetaTableThemeLevelResponseBodyEntityTheme> theme) {
            this.theme = theme;
            return this;
        }
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityTheme> getTheme() {
            return this.theme;
        }

        public GetMetaTableThemeLevelResponseBodyEntity setLevel(java.util.List<GetMetaTableThemeLevelResponseBodyEntityLevel> level) {
            this.level = level;
            return this;
        }
        public java.util.List<GetMetaTableThemeLevelResponseBodyEntityLevel> getLevel() {
            return this.level;
        }

    }

}
