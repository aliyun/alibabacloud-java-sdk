// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListInstanceServiceConfigurationsResponseBody extends TeaModel {
    @NameInMap("ConfigureList")
    public ListInstanceServiceConfigurationsResponseBodyConfigureList configureList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static ListInstanceServiceConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceServiceConfigurationsResponseBody self = new ListInstanceServiceConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceServiceConfigurationsResponseBody setConfigureList(ListInstanceServiceConfigurationsResponseBodyConfigureList configureList) {
        this.configureList = configureList;
        return this;
    }
    public ListInstanceServiceConfigurationsResponseBodyConfigureList getConfigureList() {
        return this.configureList;
    }

    public ListInstanceServiceConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceServiceConfigurationsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListInstanceServiceConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceServiceConfigurationsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListInstanceServiceConfigurationsResponseBodyConfigureListConfig extends TeaModel {
        @NameInMap("ConfigureName")
        public String configureName;

        @NameInMap("ConfigureUnit")
        public String configureUnit;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("NeedRestart")
        public String needRestart;

        @NameInMap("RunningValue")
        public String runningValue;

        @NameInMap("ValueRange")
        public String valueRange;

        public static ListInstanceServiceConfigurationsResponseBodyConfigureListConfig build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceServiceConfigurationsResponseBodyConfigureListConfig self = new ListInstanceServiceConfigurationsResponseBodyConfigureListConfig();
            return TeaModel.build(map, self);
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureListConfig setConfigureName(String configureName) {
            this.configureName = configureName;
            return this;
        }
        public String getConfigureName() {
            return this.configureName;
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureListConfig setConfigureUnit(String configureUnit) {
            this.configureUnit = configureUnit;
            return this;
        }
        public String getConfigureUnit() {
            return this.configureUnit;
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureListConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureListConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureListConfig setNeedRestart(String needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public String getNeedRestart() {
            return this.needRestart;
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureListConfig setRunningValue(String runningValue) {
            this.runningValue = runningValue;
            return this;
        }
        public String getRunningValue() {
            return this.runningValue;
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureListConfig setValueRange(String valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public String getValueRange() {
            return this.valueRange;
        }

    }

    public static class ListInstanceServiceConfigurationsResponseBodyConfigureList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<ListInstanceServiceConfigurationsResponseBodyConfigureListConfig> config;

        public static ListInstanceServiceConfigurationsResponseBodyConfigureList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceServiceConfigurationsResponseBodyConfigureList self = new ListInstanceServiceConfigurationsResponseBodyConfigureList();
            return TeaModel.build(map, self);
        }

        public ListInstanceServiceConfigurationsResponseBodyConfigureList setConfig(java.util.List<ListInstanceServiceConfigurationsResponseBodyConfigureListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<ListInstanceServiceConfigurationsResponseBodyConfigureListConfig> getConfig() {
            return this.config;
        }

    }

}
