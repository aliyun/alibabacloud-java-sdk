// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 层级
    @NameInMap("Sort")
    public java.util.List<UpdateSpaceModelRequestSort> sort;

    // 资源uuid
    @NameInMap("SpaceModelId")
    public String spaceModelId;

    // 物理空间类型
    @NameInMap("SpaceType")
    public String spaceType;

    public static UpdateSpaceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceModelRequest self = new UpdateSpaceModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceModelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSpaceModelRequest setSort(java.util.List<UpdateSpaceModelRequestSort> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.List<UpdateSpaceModelRequestSort> getSort() {
        return this.sort;
    }

    public UpdateSpaceModelRequest setSpaceModelId(String spaceModelId) {
        this.spaceModelId = spaceModelId;
        return this;
    }
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    public UpdateSpaceModelRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public static class UpdateSpaceModelRequestSort extends TeaModel {
        // 层级
        @NameInMap("Level")
        public Long level;

        // 层级名称
        @NameInMap("LevelName")
        public String levelName;

        public static UpdateSpaceModelRequestSort build(java.util.Map<String, ?> map) throws Exception {
            UpdateSpaceModelRequestSort self = new UpdateSpaceModelRequestSort();
            return TeaModel.build(map, self);
        }

        public UpdateSpaceModelRequestSort setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public UpdateSpaceModelRequestSort setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

}
