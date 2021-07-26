// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class SpaceModel extends TeaModel {
    // 资源名称
    @NameInMap("SpaceModelName")
    public String spaceModelName;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 资源一级ID
    @NameInMap("SpaceModelId")
    public String spaceModelId;

    // 物理空间类型
    @NameInMap("SpaceType")
    public String spaceType;

    // 层级
    @NameInMap("Sort")
    public SpaceModelSort sort;

    // 物理空间模型
    @NameInMap("SpaceModel")
    public SpaceModelSpaceModel spaceModel;

    // 物理空间id
    @NameInMap("SpaceId")
    public String spaceId;

    // 物理空间实例
    @NameInMap("Instance")
    public String instance;

    // 状态
    @NameInMap("Status")
    public String status;

    // 操作类型
    @NameInMap("OperateType")
    public String operateType;

    public static SpaceModel build(java.util.Map<String, ?> map) throws Exception {
        SpaceModel self = new SpaceModel();
        return TeaModel.build(map, self);
    }

    public SpaceModel setSpaceModelName(String spaceModelName) {
        this.spaceModelName = spaceModelName;
        return this;
    }
    public String getSpaceModelName() {
        return this.spaceModelName;
    }

    public SpaceModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SpaceModel setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    public SpaceModel setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public SpaceModel setSort(SpaceModelSort sort) {
        this.sort = sort;
        return this;
    }
    public SpaceModelSort getSort() {
        return this.sort;
    }

    public SpaceModel setSpaceModel(SpaceModelSpaceModel spaceModel) {
        this.spaceModel = spaceModel;
        return this;
    }
    public SpaceModelSpaceModel getSpaceModel() {
        return this.spaceModel;
    }

    public SpaceModel setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SpaceModel setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public SpaceModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SpaceModel setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public static class SpaceModelSort extends TeaModel {
        // 分层名称
        @NameInMap("LevelName")
        public String levelName;

        // 层次
        @NameInMap("Level")
        public Long level;

        public static SpaceModelSort build(java.util.Map<String, ?> map) throws Exception {
            SpaceModelSort self = new SpaceModelSort();
            return TeaModel.build(map, self);
        }

        public SpaceModelSort setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public SpaceModelSort setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

    }

    public static class SpaceModelSpaceModelSort extends TeaModel {
        // 层级
        @NameInMap("Level")
        public Long level;

        // 层级名称
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
        // 物理空间模型id
        @NameInMap("SpaceModelId")
        public String spaceModelId;

        // 模型状态
        @NameInMap("Status")
        public String status;

        // 物理空间类型
        @NameInMap("SpaceType")
        public String spaceType;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 模型实例
        @NameInMap("Sort")
        public SpaceModelSpaceModelSort sort;

        public static SpaceModelSpaceModel build(java.util.Map<String, ?> map) throws Exception {
            SpaceModelSpaceModel self = new SpaceModelSpaceModel();
            return TeaModel.build(map, self);
        }

        public SpaceModelSpaceModel setSpaceModelId(String spaceModelId) {
            this.spaceModelId = spaceModelId;
            return this;
        }
        public String getSpaceModelId() {
            return this.spaceModelId;
        }

        public SpaceModelSpaceModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SpaceModelSpaceModel setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public SpaceModelSpaceModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SpaceModelSpaceModel setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SpaceModelSpaceModel setSort(SpaceModelSpaceModelSort sort) {
            this.sort = sort;
            return this;
        }
        public SpaceModelSpaceModelSort getSort() {
            return this.sort;
        }

    }

}
