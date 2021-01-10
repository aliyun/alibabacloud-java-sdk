// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateFpShotDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FpShotDB")
    public CreateFpShotDBResponseBodyFpShotDB fpShotDB;

    public static CreateFpShotDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFpShotDBResponseBody self = new CreateFpShotDBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFpShotDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFpShotDBResponseBody setFpShotDB(CreateFpShotDBResponseBodyFpShotDB fpShotDB) {
        this.fpShotDB = fpShotDB;
        return this;
    }
    public CreateFpShotDBResponseBodyFpShotDB getFpShotDB() {
        return this.fpShotDB;
    }

    public static class CreateFpShotDBResponseBodyFpShotDB extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("State")
        public String state;

        @NameInMap("Name")
        public String name;

        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("ModelId")
        public Integer modelId;

        @NameInMap("Config")
        public String config;

        public static CreateFpShotDBResponseBodyFpShotDB build(java.util.Map<String, ?> map) throws Exception {
            CreateFpShotDBResponseBodyFpShotDB self = new CreateFpShotDBResponseBodyFpShotDB();
            return TeaModel.build(map, self);
        }

        public CreateFpShotDBResponseBodyFpShotDB setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateFpShotDBResponseBodyFpShotDB setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateFpShotDBResponseBodyFpShotDB setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFpShotDBResponseBodyFpShotDB setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public CreateFpShotDBResponseBodyFpShotDB setModelId(Integer modelId) {
            this.modelId = modelId;
            return this;
        }
        public Integer getModelId() {
            return this.modelId;
        }

        public CreateFpShotDBResponseBodyFpShotDB setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
