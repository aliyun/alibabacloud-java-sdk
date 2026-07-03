// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDeliveryResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListDeliveryResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-58D4-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryResponseBody self = new ListDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeliveryResponseBody setData(ListDeliveryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeliveryResponseBodyData getData() {
        return this.data;
    }

    public ListDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeliveryResponseBodyDataProductListLogListExtraParameters extends TeaModel {
        /**
         * <p>The key of the additional parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>flag</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the additional parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDeliveryResponseBodyDataProductListLogListExtraParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyDataProductListLogListExtraParameters self = new ListDeliveryResponseBodyDataProductListLogListExtraParameters();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyDataProductListLogListExtraParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDeliveryResponseBodyDataProductListLogListExtraParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDeliveryResponseBodyDataProductListLogList extends TeaModel {
        /**
         * <p>Indicates whether the log delivery switch can be operated. Only the delegated administrator for threat analysis can operate the switch. Valid values:</p>
         * <ul>
         * <li><p>true: The switch can be operated.</p>
         * </li>
         * <li><p>false: The switch cannot be operated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanOperateOrNot")
        public Boolean canOperateOrNot;

        /**
         * <p>Additional parameters.</p>
         */
        @NameInMap("ExtraParameters")
        public java.util.List<ListDeliveryResponseBodyDataProductListLogListExtraParameters> extraParameters;

        /**
         * <p>The log code.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_config_log</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>This parameter is deprecated. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>audit log</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>This parameter is deprecated. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>audit log</p>
         */
        @NameInMap("LogNameEn")
        public String logNameEn;

        /**
         * <p>The language key of the log name. This key is used to display the log name in different languages.</p>
         * 
         * <strong>example:</strong>
         * <p>${sas.cloudsiem.prod.cloud_siem_aegis_crack_from_beaver}</p>
         */
        @NameInMap("LogNameKey")
        public String logNameKey;

        /**
         * <p>The log delivery status. Valid values:</p>
         * <ul>
         * <li><p>true: Delivery is in progress.</p>
         * </li>
         * <li><p>false: Delivery is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <p>The topic of the log in the LogStore. This parameter is an index field in the LogStore and is used to differentiate logs.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_login_event</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static ListDeliveryResponseBodyDataProductListLogList build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyDataProductListLogList self = new ListDeliveryResponseBodyDataProductListLogList();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyDataProductListLogList setCanOperateOrNot(Boolean canOperateOrNot) {
            this.canOperateOrNot = canOperateOrNot;
            return this;
        }
        public Boolean getCanOperateOrNot() {
            return this.canOperateOrNot;
        }

        public ListDeliveryResponseBodyDataProductListLogList setExtraParameters(java.util.List<ListDeliveryResponseBodyDataProductListLogListExtraParameters> extraParameters) {
            this.extraParameters = extraParameters;
            return this;
        }
        public java.util.List<ListDeliveryResponseBodyDataProductListLogListExtraParameters> getExtraParameters() {
            return this.extraParameters;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogNameEn(String logNameEn) {
            this.logNameEn = logNameEn;
            return this;
        }
        public String getLogNameEn() {
            return this.logNameEn;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogNameKey(String logNameKey) {
            this.logNameKey = logNameKey;
            return this;
        }
        public String getLogNameKey() {
            return this.logNameKey;
        }

        public ListDeliveryResponseBodyDataProductListLogList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ListDeliveryResponseBodyDataProductListLogList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListDeliveryResponseBodyDataProductList extends TeaModel {
        /**
         * <p>A list of logs for cloud products that do not have subcategories.</p>
         */
        @NameInMap("LogList")
        public java.util.List<ListDeliveryResponseBodyDataProductListLogList> logList;

        /**
         * <p>A list of logs that are categorized. For example, Security Center logs are categorized into groups such as Host and Network. The group is the key, and the logs in the group are the value.</p>
         */
        @NameInMap("LogMap")
        public java.util.Map<String, java.util.List<DataProductListLogMapValue>> logMap;

        /**
         * <p>The code of the cloud product. Valid values:</p>
         * <ul>
         * <li><p>qcloud_waf</p>
         * </li>
         * <li><p>qcloud_cfw</p>
         * </li>
         * <li><p>hcloud_waf</p>
         * </li>
         * <li><p>hcloud_cfw</p>
         * </li>
         * <li><p>ddos</p>
         * </li>
         * <li><p>sas</p>
         * </li>
         * <li><p>cfw</p>
         * </li>
         * <li><p>config</p>
         * </li>
         * <li><p>csk</p>
         * </li>
         * <li><p>fc</p>
         * </li>
         * <li><p>rds</p>
         * </li>
         * <li><p>nas</p>
         * </li>
         * <li><p>apigateway</p>
         * </li>
         * <li><p>cdn</p>
         * </li>
         * <li><p>mongodb</p>
         * </li>
         * <li><p>eip</p>
         * </li>
         * <li><p>slb</p>
         * </li>
         * <li><p>vpc</p>
         * </li>
         * <li><p>actiontrail</p>
         * </li>
         * <li><p>waf</p>
         * </li>
         * <li><p>bastionhost</p>
         * </li>
         * <li><p>oss</p>
         * </li>
         * <li><p>polardb</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>This parameter is deprecated. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>Security Center</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static ListDeliveryResponseBodyDataProductList build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyDataProductList self = new ListDeliveryResponseBodyDataProductList();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyDataProductList setLogList(java.util.List<ListDeliveryResponseBodyDataProductListLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<ListDeliveryResponseBodyDataProductListLogList> getLogList() {
            return this.logList;
        }

        public ListDeliveryResponseBodyDataProductList setLogMap(java.util.Map<String, java.util.List<DataProductListLogMapValue>> logMap) {
            this.logMap = logMap;
            return this;
        }
        public java.util.Map<String, java.util.List<DataProductListLogMapValue>> getLogMap() {
            return this.logMap;
        }

        public ListDeliveryResponseBodyDataProductList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListDeliveryResponseBodyDataProductList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListDeliveryResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the dashboard on the log analysis page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai">https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai</a>
         * /dashboard/cloud-siem?isShare=true&amp;hideTopbar=true&amp;hideSidebar=true&amp;ignoreTabLocalStorage=true</p>
         */
        @NameInMap("DashboardUrl")
        public String dashboardUrl;

        /**
         * <p>Indicates whether to display the delivery switch. The default value is true. Valid values:</p>
         * <ul>
         * <li><p>true: The delivery switch is displayed.</p>
         * </li>
         * <li><p>false: The delivery switch is hidden.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisplaySwitchOrNot")
        public Boolean displaySwitchOrNot;

        /**
         * <p>The name of your LogStore for threat analysis. The format is \<code>cloud_siem\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-siem</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>A list of products.</p>
         */
        @NameInMap("ProductList")
        public java.util.List<ListDeliveryResponseBodyDataProductList> productList;

        /**
         * <p>The name of your Simple Log Service (SLS) project for threat analysis. The format is \<code>aliyun-cloudsiem-data-${aliUid}-${region}\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-127608589417****-cn-shanghai</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The URL of the Search &amp; Analysis page in the SLS console.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai">https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai</a>
         * /logsearch/cloud-siem?isShare=true&amp;hideTopbar=true&amp;hideSidebar=true&amp;ignoreTabLocalStorage=true</p>
         */
        @NameInMap("SearchUrl")
        public String searchUrl;

        public static ListDeliveryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyData self = new ListDeliveryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyData setDashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        public ListDeliveryResponseBodyData setDisplaySwitchOrNot(Boolean displaySwitchOrNot) {
            this.displaySwitchOrNot = displaySwitchOrNot;
            return this;
        }
        public Boolean getDisplaySwitchOrNot() {
            return this.displaySwitchOrNot;
        }

        public ListDeliveryResponseBodyData setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public ListDeliveryResponseBodyData setProductList(java.util.List<ListDeliveryResponseBodyDataProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<ListDeliveryResponseBodyDataProductList> getProductList() {
            return this.productList;
        }

        public ListDeliveryResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDeliveryResponseBodyData setSearchUrl(String searchUrl) {
            this.searchUrl = searchUrl;
            return this;
        }
        public String getSearchUrl() {
            return this.searchUrl;
        }

    }

}
