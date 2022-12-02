// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSpaceModelRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Sort")
    public java.util.List<CreateSpaceModelRequestSort> sort;

    @NameInMap("SpaceType")
    public String spaceType;

    public static CreateSpaceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceModelRequest self = new CreateSpaceModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpaceModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSpaceModelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSpaceModelRequest setSort(java.util.List<CreateSpaceModelRequestSort> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.List<CreateSpaceModelRequestSort> getSort() {
        return this.sort;
    }

    public CreateSpaceModelRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public static class CreateSpaceModelRequestSort extends TeaModel {
        @NameInMap("Level")
        public Long level;

        @NameInMap("LevelName")
        public String levelName;

        public static CreateSpaceModelRequestSort build(java.util.Map<String, ?> map) throws Exception {
            CreateSpaceModelRequestSort self = new CreateSpaceModelRequestSort();
            return TeaModel.build(map, self);
        }

        public CreateSpaceModelRequestSort setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public CreateSpaceModelRequestSort setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

}
