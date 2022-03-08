// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListSpaceModelsResponseBody extends TeaModel {
    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 数组，返回示例目录。
    @NameInMap("SpaceModel")
    public java.util.List<ListSpaceModelsResponseBodySpaceModel> spaceModel;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSpaceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpaceModelsResponseBody self = new ListSpaceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpaceModelsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSpaceModelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSpaceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpaceModelsResponseBody setSpaceModel(java.util.List<ListSpaceModelsResponseBodySpaceModel> spaceModel) {
        this.spaceModel = spaceModel;
        return this;
    }
    public java.util.List<ListSpaceModelsResponseBodySpaceModel> getSpaceModel() {
        return this.spaceModel;
    }

    public ListSpaceModelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSpaceModelsResponseBodySpaceModelSort extends TeaModel {
        // 层级
        @NameInMap("Level")
        public Long level;

        // 层级名称
        @NameInMap("LevelName")
        public String levelName;

        public static ListSpaceModelsResponseBodySpaceModelSort build(java.util.Map<String, ?> map) throws Exception {
            ListSpaceModelsResponseBodySpaceModelSort self = new ListSpaceModelsResponseBodySpaceModelSort();
            return TeaModel.build(map, self);
        }

        public ListSpaceModelsResponseBodySpaceModelSort setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public ListSpaceModelsResponseBodySpaceModelSort setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

    public static class ListSpaceModelsResponseBodySpaceModel extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 层级
        @NameInMap("Sort")
        public java.util.List<ListSpaceModelsResponseBodySpaceModelSort> sort;

        // 资源一级ID
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

        public static ListSpaceModelsResponseBodySpaceModel build(java.util.Map<String, ?> map) throws Exception {
            ListSpaceModelsResponseBodySpaceModel self = new ListSpaceModelsResponseBodySpaceModel();
            return TeaModel.build(map, self);
        }

        public ListSpaceModelsResponseBodySpaceModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSpaceModelsResponseBodySpaceModel setSort(java.util.List<ListSpaceModelsResponseBodySpaceModelSort> sort) {
            this.sort = sort;
            return this;
        }
        public java.util.List<ListSpaceModelsResponseBodySpaceModelSort> getSort() {
            return this.sort;
        }

        public ListSpaceModelsResponseBodySpaceModel setSpaceModelId(String spaceModelId) {
            this.spaceModelId = spaceModelId;
            return this;
        }
        public String getSpaceModelId() {
            return this.spaceModelId;
        }

        public ListSpaceModelsResponseBodySpaceModel setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public ListSpaceModelsResponseBodySpaceModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSpaceModelsResponseBodySpaceModel setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
