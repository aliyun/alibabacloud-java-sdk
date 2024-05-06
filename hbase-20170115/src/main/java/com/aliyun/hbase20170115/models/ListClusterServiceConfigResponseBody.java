// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ListClusterServiceConfigResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ConfigList")
    public ListClusterServiceConfigResponseBodyConfigList configList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListClusterServiceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceConfigResponseBody self = new ListClusterServiceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceConfigResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterServiceConfigResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListClusterServiceConfigResponseBody setConfigList(ListClusterServiceConfigResponseBodyConfigList configList) {
        this.configList = configList;
        return this;
    }
    public ListClusterServiceConfigResponseBodyConfigList getConfigList() {
        return this.configList;
    }

    public ListClusterServiceConfigResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterServiceConfigResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListClusterServiceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterServiceConfigResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListClusterServiceConfigResponseBodyConfigListConfig extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedRestart")
        public String needRestart;

        @NameInMap("RunningValue")
        public String runningValue;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("ValueRange")
        public String valueRange;

        public static ListClusterServiceConfigResponseBodyConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceConfigResponseBodyConfigListConfig self = new ListClusterServiceConfigResponseBodyConfigListConfig();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceConfigResponseBodyConfigListConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListClusterServiceConfigResponseBodyConfigListConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClusterServiceConfigResponseBodyConfigListConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterServiceConfigResponseBodyConfigListConfig setNeedRestart(String needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public String getNeedRestart() {
            return this.needRestart;
        }

        public ListClusterServiceConfigResponseBodyConfigListConfig setRunningValue(String runningValue) {
            this.runningValue = runningValue;
            return this;
        }
        public String getRunningValue() {
            return this.runningValue;
        }

        public ListClusterServiceConfigResponseBodyConfigListConfig setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListClusterServiceConfigResponseBodyConfigListConfig setValueRange(String valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public String getValueRange() {
            return this.valueRange;
        }

    }

    public static class ListClusterServiceConfigResponseBodyConfigList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<ListClusterServiceConfigResponseBodyConfigListConfig> config;

        public static ListClusterServiceConfigResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceConfigResponseBodyConfigList self = new ListClusterServiceConfigResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceConfigResponseBodyConfigList setConfig(java.util.List<ListClusterServiceConfigResponseBodyConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<ListClusterServiceConfigResponseBodyConfigListConfig> getConfig() {
            return this.config;
        }

    }

}
