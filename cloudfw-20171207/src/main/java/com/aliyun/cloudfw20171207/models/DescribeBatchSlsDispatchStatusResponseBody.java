// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeBatchSlsDispatchStatusResponseBody extends TeaModel {
    /**
     * <p>A list of detailed information about the Logstores.</p>
     */
    @NameInMap("InfoList")
    public java.util.List<DescribeBatchSlsDispatchStatusResponseBodyInfoList> infoList;

    /**
     * <p>A list of Simple Log Service projects.</p>
     */
    @NameInMap("ItemList")
    public java.util.List<DescribeBatchSlsDispatchStatusResponseBodyItemList> itemList;

    /**
     * <p>The log version. A value of 1 indicates that there is one Logstore. A value of 2 indicates that there are two Logstores.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogVersion")
    public String logVersion;

    /**
     * <p>The name of the Logstore in Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-stats</p>
     */
    @NameInMap("LogstoreName")
    public String logstoreName;

    /**
     * <p>The name of the project in Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudfirewallnew-project-199053910542****-cn-hangzhou</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7036EBAB-F85F-5AAE-976F-C75AEE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBatchSlsDispatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchSlsDispatchStatusResponseBody self = new DescribeBatchSlsDispatchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchSlsDispatchStatusResponseBody setInfoList(java.util.List<DescribeBatchSlsDispatchStatusResponseBodyInfoList> infoList) {
        this.infoList = infoList;
        return this;
    }
    public java.util.List<DescribeBatchSlsDispatchStatusResponseBodyInfoList> getInfoList() {
        return this.infoList;
    }

    public DescribeBatchSlsDispatchStatusResponseBody setItemList(java.util.List<DescribeBatchSlsDispatchStatusResponseBodyItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<DescribeBatchSlsDispatchStatusResponseBodyItemList> getItemList() {
        return this.itemList;
    }

    public DescribeBatchSlsDispatchStatusResponseBody setLogVersion(String logVersion) {
        this.logVersion = logVersion;
        return this;
    }
    public String getLogVersion() {
        return this.logVersion;
    }

    public DescribeBatchSlsDispatchStatusResponseBody setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public DescribeBatchSlsDispatchStatusResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeBatchSlsDispatchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList extends TeaModel {
        /**
         * <p>The configuration status.</p>
         * 
         * <strong>example:</strong>
         * <p>success_finished</p>
         */
        @NameInMap("ConfigStatus")
        public String configStatus;

        /**
         * <p>The name of the delivery type.</p>
         * 
         * <strong>example:</strong>
         * <p>internet-traffic-log</p>
         */
        @NameInMap("DispatchName")
        public String dispatchName;

        /**
         * <p>The key for the log categorization. Valid values:</p>
         * <p><strong>internet_log</strong></p>
         * <p><strong>vpc_firewall_log</strong></p>
         * <p><strong>nat_firewall_log</strong></p>
         * <p><strong>ipv6_firewall_log</strong></p>
         * <p><strong>dns_firewall_log</strong></p>
         * 
         * <strong>example:</strong>
         * <p>ipv6_firewall_log</p>
         */
        @NameInMap("DispatchValue")
        public String dispatchValue;

        /**
         * <p>Indicates whether this delivery type is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The detailed delivery configurations for the Internet and VPCs.</p>
         */
        @NameInMap("FilterKeys")
        public java.util.List<String> filterKeys;

        /**
         * <p>The value is fixed to log_type. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>log_type</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList self = new DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList();
            return TeaModel.build(map, self);
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList setDispatchName(String dispatchName) {
            this.dispatchName = dispatchName;
            return this;
        }
        public String getDispatchName() {
            return this.dispatchName;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList setDispatchValue(String dispatchValue) {
            this.dispatchValue = dispatchValue;
            return this;
        }
        public String getDispatchValue() {
            return this.dispatchValue;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList setFilterKeys(java.util.List<String> filterKeys) {
            this.filterKeys = filterKeys;
            return this;
        }
        public java.util.List<String> getFilterKeys() {
            return this.filterKeys;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class DescribeBatchSlsDispatchStatusResponseBodyInfoList extends TeaModel {
        /**
         * <p>The details of the log delivery configuration.</p>
         */
        @NameInMap("ItemList")
        public java.util.List<DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList> itemList;

        /**
         * <p>The name of the Logstore in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall-logstore</p>
         */
        @NameInMap("LogstoreName")
        public String logstoreName;

        /**
         * <p>The name of the project in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall-project-1204872307283650-cn-hangzhou</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>\<code>cn\\</code> indicates the Chinese mainland. \<code>intl\\</code> indicates regions outside the Chinese mainland. \<code>global\\</code> indicates global.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Site")
        public String site;

        public static DescribeBatchSlsDispatchStatusResponseBodyInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchSlsDispatchStatusResponseBodyInfoList self = new DescribeBatchSlsDispatchStatusResponseBodyInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoList setItemList(java.util.List<DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList> itemList) {
            this.itemList = itemList;
            return this;
        }
        public java.util.List<DescribeBatchSlsDispatchStatusResponseBodyInfoListItemList> getItemList() {
            return this.itemList;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoList setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyInfoList setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

    }

    public static class DescribeBatchSlsDispatchStatusResponseBodyItemList extends TeaModel {
        /**
         * <p>The status of the delivery configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>success_finished</p>
         */
        @NameInMap("ConfigStatus")
        public String configStatus;

        /**
         * <p>The name of the log delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>internet-traffic-log</p>
         */
        @NameInMap("DispatchName")
        public String dispatchName;

        /**
         * <p>The value of the log to be delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>internet_log</p>
         */
        @NameInMap("DispatchValue")
        public String dispatchValue;

        /**
         * <p>The delivery status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The supported filter conditions.</p>
         */
        @NameInMap("FilterKeys")
        public java.util.List<String> filterKeys;

        /**
         * <p>The name of the search type.</p>
         * 
         * <strong>example:</strong>
         * <p>log_type</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static DescribeBatchSlsDispatchStatusResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchSlsDispatchStatusResponseBodyItemList self = new DescribeBatchSlsDispatchStatusResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public DescribeBatchSlsDispatchStatusResponseBodyItemList setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyItemList setDispatchName(String dispatchName) {
            this.dispatchName = dispatchName;
            return this;
        }
        public String getDispatchName() {
            return this.dispatchName;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyItemList setDispatchValue(String dispatchValue) {
            this.dispatchValue = dispatchValue;
            return this;
        }
        public String getDispatchValue() {
            return this.dispatchValue;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyItemList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyItemList setFilterKeys(java.util.List<String> filterKeys) {
            this.filterKeys = filterKeys;
            return this;
        }
        public java.util.List<String> getFilterKeys() {
            return this.filterKeys;
        }

        public DescribeBatchSlsDispatchStatusResponseBodyItemList setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

}
