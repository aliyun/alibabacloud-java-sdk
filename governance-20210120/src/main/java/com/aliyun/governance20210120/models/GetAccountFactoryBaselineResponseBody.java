// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetAccountFactoryBaselineResponseBody extends TeaModel {
    /**
     * <p>The baseline ID.</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>The baseline items.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<GetAccountFactoryBaselineResponseBodyBaselineItems> baselineItems;

    /**
     * <p>The name of the baseline.</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>The time when the baseline was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the baseline.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the baseline. Valid values:</p>
     * <br>
     * <p>*   System: default baseline.</p>
     * <p>*   Custom: custom baseline.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The time when the baseline was updated.</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetAccountFactoryBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountFactoryBaselineResponseBody self = new GetAccountFactoryBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountFactoryBaselineResponseBody setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public GetAccountFactoryBaselineResponseBody setBaselineItems(java.util.List<GetAccountFactoryBaselineResponseBodyBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<GetAccountFactoryBaselineResponseBodyBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public GetAccountFactoryBaselineResponseBody setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public GetAccountFactoryBaselineResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetAccountFactoryBaselineResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetAccountFactoryBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountFactoryBaselineResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetAccountFactoryBaselineResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetAccountFactoryBaselineResponseBodyBaselineItems extends TeaModel {
        /**
         * <p>The configuration of the baseline item.</p>
         * <br>
         * <p>The value is a JSON string.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the baseline item.</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAccountFactoryBaselineResponseBodyBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            GetAccountFactoryBaselineResponseBodyBaselineItems self = new GetAccountFactoryBaselineResponseBodyBaselineItems();
            return TeaModel.build(map, self);
        }

        public GetAccountFactoryBaselineResponseBodyBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetAccountFactoryBaselineResponseBodyBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAccountFactoryBaselineResponseBodyBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
