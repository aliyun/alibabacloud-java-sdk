// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListInstanceServiceConfigurationsResponseBody extends TeaModel {
    @NameInMap("ConfigureList")
    public ListInstanceServiceConfigurationsResponseBodyConfigureList configureList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>5B381E36-BCA3-4377-8638-B65C236617D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>hbase#hbase-site.xml#hbase.client.keyvalue.maxsize</p>
         */
        @NameInMap("ConfigureName")
        public String configureName;

        /**
         * <strong>example:</strong>
         * <p>INT</p>
         */
        @NameInMap("ConfigureUnit")
        public String configureUnit;

        /**
         * <strong>example:</strong>
         * <p>10485760</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>hbase client keyvalue maxsize</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedRestart")
        public String needRestart;

        /**
         * <strong>example:</strong>
         * <p>10485760</p>
         */
        @NameInMap("RunningValue")
        public String runningValue;

        /**
         * <strong>example:</strong>
         * <p>R[10485760,52428800]</p>
         */
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
