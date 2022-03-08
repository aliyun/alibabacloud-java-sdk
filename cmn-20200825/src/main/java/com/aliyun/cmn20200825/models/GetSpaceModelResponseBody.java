// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 物理空间模型
    @NameInMap("SpaceModel")
    public GetSpaceModelResponseBodySpaceModel spaceModel;

    public static GetSpaceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelResponseBody self = new GetSpaceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpaceModelResponseBody setSpaceModel(GetSpaceModelResponseBodySpaceModel spaceModel) {
        this.spaceModel = spaceModel;
        return this;
    }
    public GetSpaceModelResponseBodySpaceModel getSpaceModel() {
        return this.spaceModel;
    }

    public static class GetSpaceModelResponseBodySpaceModelSort extends TeaModel {
        // 层级
        @NameInMap("Level")
        public Long level;

        // 层级名称
        @NameInMap("LevelName")
        public String levelName;

        public static GetSpaceModelResponseBodySpaceModelSort build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceModelResponseBodySpaceModelSort self = new GetSpaceModelResponseBodySpaceModelSort();
            return TeaModel.build(map, self);
        }

        public GetSpaceModelResponseBodySpaceModelSort setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetSpaceModelResponseBodySpaceModelSort setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

    public static class GetSpaceModelResponseBodySpaceModel extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 模型实例
        @NameInMap("Sort")
        public java.util.List<GetSpaceModelResponseBodySpaceModelSort> sort;

        // 物理空间模型id
        @NameInMap("SpaceModelId")
        public String spaceModelId;

        // 物理空间类型
        @NameInMap("SpaceType")
        public String spaceType;

        // 模型状态
        @NameInMap("Status")
        public String status;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetSpaceModelResponseBodySpaceModel build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceModelResponseBodySpaceModel self = new GetSpaceModelResponseBodySpaceModel();
            return TeaModel.build(map, self);
        }

        public GetSpaceModelResponseBodySpaceModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSpaceModelResponseBodySpaceModel setSort(java.util.List<GetSpaceModelResponseBodySpaceModelSort> sort) {
            this.sort = sort;
            return this;
        }
        public java.util.List<GetSpaceModelResponseBodySpaceModelSort> getSort() {
            return this.sort;
        }

        public GetSpaceModelResponseBodySpaceModel setSpaceModelId(String spaceModelId) {
            this.spaceModelId = spaceModelId;
            return this;
        }
        public String getSpaceModelId() {
            return this.spaceModelId;
        }

        public GetSpaceModelResponseBodySpaceModel setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public GetSpaceModelResponseBodySpaceModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSpaceModelResponseBodySpaceModel setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
