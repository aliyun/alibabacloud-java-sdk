// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceBySQLResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device information returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryDeviceBySQLResponseBodyData> data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>If you specify <code>SELECT count(*) FROM device</code> in the SQL-like statement, the number of rows that match the specified conditions is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryDeviceBySQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceBySQLResponseBody self = new QueryDeviceBySQLResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceBySQLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceBySQLResponseBody setData(java.util.List<QueryDeviceBySQLResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceBySQLResponseBodyData> getData() {
        return this.data;
    }

    public QueryDeviceBySQLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceBySQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceBySQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceBySQLResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryDeviceBySQLResponseBodyDataGroups extends TeaModel {
        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>a1d21d2fas</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        public static QueryDeviceBySQLResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyDataGroups self = new QueryDeviceBySQLResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyDataGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class QueryDeviceBySQLResponseBodyDataOTAModules extends TeaModel {
        /**
         * <p>The version number of each OTA module.</p>
         * 
         * <strong>example:</strong>
         * <p>a1-dads2-dad2</p>
         */
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        /**
         * <p>The name of the OTA module.</p>
         * 
         * <strong>example:</strong>
         * <p>SomeSampleModule</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        public static QueryDeviceBySQLResponseBodyDataOTAModules build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyDataOTAModules self = new QueryDeviceBySQLResponseBodyDataOTAModules();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyDataOTAModules setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public QueryDeviceBySQLResponseBodyDataOTAModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class QueryDeviceBySQLResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Color</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Red</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDeviceBySQLResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyDataTags self = new QueryDeviceBySQLResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyDataTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryDeviceBySQLResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDeviceBySQLResponseBodyData extends TeaModel {
        /**
         * <p>The time when the device was activated. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-04 16:38:18.607</p>
         */
        @NameInMap("ActiveTime")
        public String activeTime;

        /**
         * <p>The name of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The time when the device was created. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-04 16:38:17.000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the device information was last updated. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-04 16:38:19.000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The information about the groups to which the device belongs.</p>
         */
        @NameInMap("Groups")
        public java.util.List<QueryDeviceBySQLResponseBodyDataGroups> groups;

        /**
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The alias of the device.</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The information about the firmware of each device module.</p>
         */
        @NameInMap("OTAModules")
        public java.util.List<QueryDeviceBySQLResponseBodyDataOTAModules> OTAModules;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The status of the device. Valid values:</p>
         * <ul>
         * <li><strong>ONLINE</strong>: The device is online.</li>
         * <li><strong>OFFLINE</strong>: The device is offline.</li>
         * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
         * <li><strong>DISABLE</strong>: The device is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The information about device tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<QueryDeviceBySQLResponseBodyDataTags> tags;

        public static QueryDeviceBySQLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyData self = new QueryDeviceBySQLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyData setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryDeviceBySQLResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceBySQLResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceBySQLResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDeviceBySQLResponseBodyData setGroups(java.util.List<QueryDeviceBySQLResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public QueryDeviceBySQLResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceBySQLResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceBySQLResponseBodyData setOTAModules(java.util.List<QueryDeviceBySQLResponseBodyDataOTAModules> OTAModules) {
            this.OTAModules = OTAModules;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseBodyDataOTAModules> getOTAModules() {
            return this.OTAModules;
        }

        public QueryDeviceBySQLResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceBySQLResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDeviceBySQLResponseBodyData setTags(java.util.List<QueryDeviceBySQLResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseBodyDataTags> getTags() {
            return this.tags;
        }

    }

}
