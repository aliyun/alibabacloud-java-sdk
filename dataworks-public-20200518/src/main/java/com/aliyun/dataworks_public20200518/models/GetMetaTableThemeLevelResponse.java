// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableThemeLevelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Entity")
    @Validation(required = true)
    public GetMetaTableThemeLevelResponseEntity entity;

    public static GetMetaTableThemeLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableThemeLevelResponse self = new GetMetaTableThemeLevelResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableThemeLevelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableThemeLevelResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableThemeLevelResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableThemeLevelResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableThemeLevelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableThemeLevelResponse setEntity(GetMetaTableThemeLevelResponseEntity entity) {
        this.entity = entity;
        return this;
    }
    public GetMetaTableThemeLevelResponseEntity getEntity() {
        return this.entity;
    }

    public static class GetMetaTableThemeLevelResponseEntityTheme extends TeaModel {
        @NameInMap("ThemeId")
        @Validation(required = true)
        public Long themeId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Level")
        @Validation(required = true)
        public Integer level;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        public static GetMetaTableThemeLevelResponseEntityTheme build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseEntityTheme self = new GetMetaTableThemeLevelResponseEntityTheme();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseEntityTheme setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public GetMetaTableThemeLevelResponseEntityTheme setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaTableThemeLevelResponseEntityTheme setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetMetaTableThemeLevelResponseEntityTheme setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class GetMetaTableThemeLevelResponseEntityLevel extends TeaModel {
        @NameInMap("LevelId")
        @Validation(required = true)
        public Long levelId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static GetMetaTableThemeLevelResponseEntityLevel build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseEntityLevel self = new GetMetaTableThemeLevelResponseEntityLevel();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseEntityLevel setLevelId(Long levelId) {
            this.levelId = levelId;
            return this;
        }
        public Long getLevelId() {
            return this.levelId;
        }

        public GetMetaTableThemeLevelResponseEntityLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaTableThemeLevelResponseEntityLevel setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetMetaTableThemeLevelResponseEntityLevel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetMetaTableThemeLevelResponseEntity extends TeaModel {
        @NameInMap("Theme")
        @Validation(required = true)
        public java.util.List<GetMetaTableThemeLevelResponseEntityTheme> theme;

        @NameInMap("Level")
        @Validation(required = true)
        public java.util.List<GetMetaTableThemeLevelResponseEntityLevel> level;

        public static GetMetaTableThemeLevelResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableThemeLevelResponseEntity self = new GetMetaTableThemeLevelResponseEntity();
            return TeaModel.build(map, self);
        }

        public GetMetaTableThemeLevelResponseEntity setTheme(java.util.List<GetMetaTableThemeLevelResponseEntityTheme> theme) {
            this.theme = theme;
            return this;
        }
        public java.util.List<GetMetaTableThemeLevelResponseEntityTheme> getTheme() {
            return this.theme;
        }

        public GetMetaTableThemeLevelResponseEntity setLevel(java.util.List<GetMetaTableThemeLevelResponseEntityLevel> level) {
            this.level = level;
            return this;
        }
        public java.util.List<GetMetaTableThemeLevelResponseEntityLevel> getLevel() {
            return this.level;
        }

    }

}
