// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class SpaceModel extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Instance")
    public String instance;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Sort")
    public SpaceModelSort sort;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SpaceModel")
    public SpaceModelSpaceModel spaceModel;

    @NameInMap("SpaceModelId")
    public String spaceModelId;

    @NameInMap("SpaceModelName")
    public String spaceModelName;

    @NameInMap("SpaceType")
    public String spaceType;

    @NameInMap("Status")
    public String status;

    public static SpaceModel build(java.util.Map<String, ?> map) throws Exception {
        SpaceModel self = new SpaceModel();
        return TeaModel.build(map, self);
    }

    public SpaceModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SpaceModel setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public SpaceModel setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SpaceModel setSort(SpaceModelSort sort) {
        this.sort = sort;
        return this;
    }
    public SpaceModelSort getSort() {
        return this.sort;
    }

    public SpaceModel setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SpaceModel setSpaceModel(SpaceModelSpaceModel spaceModel) {
        this.spaceModel = spaceModel;
        return this;
    }
    public SpaceModelSpaceModel getSpaceModel() {
        return this.spaceModel;
    }

    public SpaceModel setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    public SpaceModel setSpaceModelName(String spaceModelName) {
        this.spaceModelName = spaceModelName;
        return this;
    }
    public String getSpaceModelName() {
        return this.spaceModelName;
    }

    public SpaceModel setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public SpaceModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class SpaceModelSort extends TeaModel {
        @NameInMap("Level")
        public Long level;

        @NameInMap("LevelName")
        public String levelName;

        public static SpaceModelSort build(java.util.Map<String, ?> map) throws Exception {
            SpaceModelSort self = new SpaceModelSort();
            return TeaModel.build(map, self);
        }

        public SpaceModelSort setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public SpaceModelSort setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

    public static class SpaceModelSpaceModelSort extends TeaModel {
        @NameInMap("Level")
        public Long level;

        @NameInMap("LevleName")
        public String levleName;

        public static SpaceModelSpaceModelSort build(java.util.Map<String, ?> map) throws Exception {
            SpaceModelSpaceModelSort self = new SpaceModelSpaceModelSort();
            return TeaModel.build(map, self);
        }

        public SpaceModelSpaceModelSort setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public SpaceModelSpaceModelSort setLevleName(String levleName) {
            this.levleName = levleName;
            return this;
        }
        public String getLevleName() {
            return this.levleName;
        }

    }

    public static class SpaceModelSpaceModel extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Sort")
        public SpaceModelSpaceModelSort sort;

        @NameInMap("SpaceModelId")
        public String spaceModelId;

        @NameInMap("SpaceType")
        public String spaceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static SpaceModelSpaceModel build(java.util.Map<String, ?> map) throws Exception {
            SpaceModelSpaceModel self = new SpaceModelSpaceModel();
            return TeaModel.build(map, self);
        }

        public SpaceModelSpaceModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SpaceModelSpaceModel setSort(SpaceModelSpaceModelSort sort) {
            this.sort = sort;
            return this;
        }
        public SpaceModelSpaceModelSort getSort() {
            return this.sort;
        }

        public SpaceModelSpaceModel setSpaceModelId(String spaceModelId) {
            this.spaceModelId = spaceModelId;
            return this;
        }
        public String getSpaceModelId() {
            return this.spaceModelId;
        }

        public SpaceModelSpaceModel setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public SpaceModelSpaceModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SpaceModelSpaceModel setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
