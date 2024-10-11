// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListVirtualWareHouseConfigsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListVirtualWareHouseConfigsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>87B839E3-7384-52D5-9CAB-756DD3BF7B9B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVirtualWareHouseConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualWareHouseConfigsResponseBody self = new ListVirtualWareHouseConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualWareHouseConfigsResponseBody setData(java.util.List<ListVirtualWareHouseConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVirtualWareHouseConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListVirtualWareHouseConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirtualWareHouseConfigsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>keep_alive_timeout</p>
         */
        @NameInMap("ConfigFullPath")
        public String configFullPath;

        /**
         * <strong>example:</strong>
         * <p>config.xml</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>The number of seconds that ClickHouse HTTP server waits for incoming requests before closing the connection</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedRestart")
        public Boolean needRestart;

        /**
         * <strong>example:</strong>
         * <blockquote>
         * <p>=10</p>
         * </blockquote>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVirtualWareHouseConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualWareHouseConfigsResponseBodyData self = new ListVirtualWareHouseConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVirtualWareHouseConfigsResponseBodyData setConfigFullPath(String configFullPath) {
            this.configFullPath = configFullPath;
            return this;
        }
        public String getConfigFullPath() {
            return this.configFullPath;
        }

        public ListVirtualWareHouseConfigsResponseBodyData setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListVirtualWareHouseConfigsResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListVirtualWareHouseConfigsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVirtualWareHouseConfigsResponseBodyData setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public ListVirtualWareHouseConfigsResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListVirtualWareHouseConfigsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
