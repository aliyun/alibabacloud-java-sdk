// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListVirtualWareHouseConfigsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListVirtualWareHouseConfigsResponseBodyData> data;

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
        // 参数路径
        @NameInMap("ConfigFullPath")
        public String configFullPath;

        // 参数类型 config.xml | users.xml
        @NameInMap("ConfigType")
        public String configType;

        // 参数默认值 为空代表未设置
        @NameInMap("DefaultValue")
        public String defaultValue;

        // 参数描述
        @NameInMap("Description")
        public String description;

        // 修改后是否需要重启
        @NameInMap("NeedRestart")
        public Boolean needRestart;

        // 修改规范
        @NameInMap("Spec")
        public String spec;

        // 参数设定值
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
