// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateFpShotDBResponseBody extends TeaModel {
    /**
     * <p>The details of the media fingerprint library.</p>
     */
    @NameInMap("FpShotDB")
    public CreateFpShotDBResponseBodyFpShotDB fpShotDB;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFpShotDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFpShotDBResponseBody self = new CreateFpShotDBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFpShotDBResponseBody setFpShotDB(CreateFpShotDBResponseBodyFpShotDB fpShotDB) {
        this.fpShotDB = fpShotDB;
        return this;
    }
    public CreateFpShotDBResponseBodyFpShotDB getFpShotDB() {
        return this.fpShotDB;
    }

    public CreateFpShotDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateFpShotDBResponseBodyFpShotDB extends TeaModel {
        /**
         * <p>The configurations of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The description of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>The library is a text fingerprint library.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the media fingerprint library. We recommend that you keep this ID for subsequent operation calls.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("FpDBId")
        public String fpDBId;

        /**
         * <p>The model ID of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ModelId")
        public Integer modelId;

        /**
         * <p>The name of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>example-name-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the media fingerprint library. After the media fingerprint library is created, it enters the <strong>offline</strong> state. After the media fingerprint library is processed at the backend, it enters the <strong>active</strong> state.</p>
         * 
         * <strong>example:</strong>
         * <p>offline</p>
         */
        @NameInMap("State")
        public String state;

        public static CreateFpShotDBResponseBodyFpShotDB build(java.util.Map<String, ?> map) throws Exception {
            CreateFpShotDBResponseBodyFpShotDB self = new CreateFpShotDBResponseBodyFpShotDB();
            return TeaModel.build(map, self);
        }

        public CreateFpShotDBResponseBodyFpShotDB setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateFpShotDBResponseBodyFpShotDB setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public CreateFpShotDBResponseBodyFpShotDB setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFpShotDBResponseBodyFpShotDB setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
