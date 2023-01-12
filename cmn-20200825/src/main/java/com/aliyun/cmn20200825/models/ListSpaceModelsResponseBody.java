// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListSpaceModelsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpaceModel")
    public java.util.List<ListSpaceModelsResponseBodySpaceModel> spaceModel;

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
        @NameInMap("Level")
        public Long level;

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
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>层级</p>
         */
        @NameInMap("Sort")
        public java.util.List<ListSpaceModelsResponseBodySpaceModelSort> sort;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("SpaceModelId")
        public String spaceModelId;

        /**
         * <p>物理空间类型</p>
         */
        @NameInMap("SpaceType")
        public String spaceType;

        @NameInMap("Status")
        public String status;

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
