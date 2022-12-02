// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelSortResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpaceModel")
    public java.util.List<GetSpaceModelSortResponseBodySpaceModel> spaceModel;

    public static GetSpaceModelSortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelSortResponseBody self = new GetSpaceModelSortResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelSortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpaceModelSortResponseBody setSpaceModel(java.util.List<GetSpaceModelSortResponseBodySpaceModel> spaceModel) {
        this.spaceModel = spaceModel;
        return this;
    }
    public java.util.List<GetSpaceModelSortResponseBodySpaceModel> getSpaceModel() {
        return this.spaceModel;
    }

    public static class GetSpaceModelSortResponseBodySpaceModel extends TeaModel {
        @NameInMap("Level")
        public Long level;

        @NameInMap("LevelName")
        public String levelName;

        public static GetSpaceModelSortResponseBodySpaceModel build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceModelSortResponseBodySpaceModel self = new GetSpaceModelSortResponseBodySpaceModel();
            return TeaModel.build(map, self);
        }

        public GetSpaceModelSortResponseBodySpaceModel setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetSpaceModelSortResponseBodySpaceModel setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

}
