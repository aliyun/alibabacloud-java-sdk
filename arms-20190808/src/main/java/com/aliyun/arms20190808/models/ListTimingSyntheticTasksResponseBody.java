// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTimingSyntheticTasksResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public ListTimingSyntheticTasksResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>730E90FE-996A-5638-99F3-4F0F9038CC6C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTimingSyntheticTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTimingSyntheticTasksResponseBody self = new ListTimingSyntheticTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTimingSyntheticTasksResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListTimingSyntheticTasksResponseBody setData(ListTimingSyntheticTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTimingSyntheticTasksResponseBodyData getData() {
        return this.data;
    }

    public ListTimingSyntheticTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTimingSyntheticTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("IpType")
        public Integer ipType;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts self = new ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost extends TeaModel {
        @NameInMap("Hosts")
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts> hosts;

        @NameInMap("SelectType")
        public Integer selectType;

        public static ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost self = new ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost setHosts(java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHostHosts> getHosts() {
            return this.hosts;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost setSelectType(Integer selectType) {
            this.selectType = selectType;
            return this;
        }
        public Integer getSelectType() {
            return this.selectType;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting extends TeaModel {
        @NameInMap("PrometheusClusterId")
        public String prometheusClusterId;

        @NameInMap("PrometheusClusterRegion")
        public String prometheusClusterRegion;

        @NameInMap("PrometheusLabels")
        public java.util.Map<String, String> prometheusLabels;

        public static ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting self = new ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting setPrometheusClusterId(String prometheusClusterId) {
            this.prometheusClusterId = prometheusClusterId;
            return this;
        }
        public String getPrometheusClusterId() {
            return this.prometheusClusterId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting setPrometheusClusterRegion(String prometheusClusterRegion) {
            this.prometheusClusterRegion = prometheusClusterRegion;
            return this;
        }
        public String getPrometheusClusterRegion() {
            return this.prometheusClusterRegion;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting setPrometheusLabels(java.util.Map<String, String> prometheusLabels) {
            this.prometheusLabels = prometheusLabels;
            return this;
        }
        public java.util.Map<String, String> getPrometheusLabels() {
            return this.prometheusLabels;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecureGroupId")
        public String secureGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting self = new ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting setSecureGroupId(String secureGroupId) {
            this.secureGroupId = secureGroupId;
            return this;
        }
        public String getSecureGroupId() {
            return this.secureGroupId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting extends TeaModel {
        @NameInMap("CustomHost")
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost customHost;

        @NameInMap("CustomPrometheusSetting")
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting customPrometheusSetting;

        @NameInMap("CustomVPCSetting")
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting customVPCSetting;

        @NameInMap("IpType")
        public Integer ipType;

        @NameInMap("IsOpenTrace")
        public Boolean isOpenTrace;

        @NameInMap("MonitorSamples")
        public Integer monitorSamples;

        @NameInMap("TraceClientType")
        public Integer traceClientType;

        @NameInMap("XtraceRegion")
        public String xtraceRegion;

        public static ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting self = new ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setCustomHost(ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost customHost) {
            this.customHost = customHost;
            return this;
        }
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomHost getCustomHost() {
            return this.customHost;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setCustomPrometheusSetting(ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting customPrometheusSetting) {
            this.customPrometheusSetting = customPrometheusSetting;
            return this;
        }
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomPrometheusSetting getCustomPrometheusSetting() {
            return this.customPrometheusSetting;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setCustomVPCSetting(ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting customVPCSetting) {
            this.customVPCSetting = customVPCSetting;
            return this;
        }
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSettingCustomVPCSetting getCustomVPCSetting() {
            return this.customVPCSetting;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setIsOpenTrace(Boolean isOpenTrace) {
            this.isOpenTrace = isOpenTrace;
            return this;
        }
        public Boolean getIsOpenTrace() {
            return this.isOpenTrace;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setMonitorSamples(Integer monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public Integer getMonitorSamples() {
            return this.monitorSamples;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setTraceClientType(Integer traceClientType) {
            this.traceClientType = traceClientType;
            return this;
        }
        public Integer getTraceClientType() {
            return this.traceClientType;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting setXtraceRegion(String xtraceRegion) {
            this.xtraceRegion = xtraceRegion;
            return this;
        }
        public String getXtraceRegion() {
            return this.xtraceRegion;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyDataItemsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTimingSyntheticTasksResponseBodyDataItemsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItemsTags self = new ListTimingSyntheticTasksResponseBodyDataItemsTags();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyDataItems extends TeaModel {
        @NameInMap("CommonSetting")
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting commonSetting;

        /**
         * <p>The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.</p>
         * 
         * <strong>example:</strong>
         * <p>1m</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1671454758000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1673085633000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The detection point type. 1: PC. 2: mobile device.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorCategory")
        public Integer monitorCategory;

        /**
         * <p>The number of detection points.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MonitorNum")
        public String monitorNum;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaCloud DNS Task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzgwtq5vxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The task status. CREATING: The task is being created. RUNNING: The task is running. PARTIAL_RUNNING: The task is partially running. STOP: The task is stopped. LIMIT_STOP: The task is stopped due to quota limit. EXCEPTION: The task is abnormal. DELETE: The task is deleted. DELETE_EXCEPTION: An exception occurs while deleting the task.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsTags> tags;

        /**
         * <p>The ID of the synthetic monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>5308a2691f59422c8c3b7aeccec9cd3b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task. Valid values:</p>
         * <p>1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed. 6: file download.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        /**
         * <p>The URL for synthetic monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListTimingSyntheticTasksResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItems self = new ListTimingSyntheticTasksResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setCommonSetting(ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting commonSetting) {
            this.commonSetting = commonSetting;
            return this;
        }
        public ListTimingSyntheticTasksResponseBodyDataItemsCommonSetting getCommonSetting() {
            return this.commonSetting;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setMonitorCategory(Integer monitorCategory) {
            this.monitorCategory = monitorCategory;
            return this;
        }
        public Integer getMonitorCategory() {
            return this.monitorCategory;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setMonitorNum(String monitorNum) {
            this.monitorNum = monitorNum;
            return this;
        }
        public String getMonitorNum() {
            return this.monitorNum;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setTags(java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsTags> getTags() {
            return this.tags;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyData extends TeaModel {
        /**
         * <p>The queried tasks.</p>
         */
        @NameInMap("Items")
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListTimingSyntheticTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyData self = new ListTimingSyntheticTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyData setItems(java.util.List<ListTimingSyntheticTasksResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListTimingSyntheticTasksResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListTimingSyntheticTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTimingSyntheticTasksResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
