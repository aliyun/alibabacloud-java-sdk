// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceConfigHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Config")
    public DescribeClusterServiceConfigHistoryResponseBodyConfig config;

    public static DescribeClusterServiceConfigHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceConfigHistoryResponseBody self = new DescribeClusterServiceConfigHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceConfigHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterServiceConfigHistoryResponseBody setConfig(DescribeClusterServiceConfigHistoryResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeClusterServiceConfigHistoryResponseBodyConfig getConfig() {
        return this.config;
    }

    public static class DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ChangeType")
        public String changeType;

        public static DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue self = new DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

    }

    public static class DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList extends TeaModel {
        @NameInMap("ConfigItemValue")
        public java.util.List<DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue> configItemValue;

        public static DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList self = new DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList setConfigItemValue(java.util.List<DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue> configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue> getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("ConfigItemValueList")
        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList configItemValueList;

        public static DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue self = new DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue setConfigItemValueList(DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList configItemValueList) {
            this.configItemValueList = configItemValueList;
            return this;
        }
        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValueConfigItemValueList getConfigItemValueList() {
            return this.configItemValueList;
        }

    }

    public static class DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList extends TeaModel {
        @NameInMap("ConfigValue")
        public java.util.List<DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue> configValue;

        public static DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList self = new DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList setConfigValue(java.util.List<DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue> configValue) {
            this.configValue = configValue;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueListConfigValue> getConfigValue() {
            return this.configValue;
        }

    }

    public static class DescribeClusterServiceConfigHistoryResponseBodyConfig extends TeaModel {
        @NameInMap("Applied")
        public Boolean applied;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ConfigVersion")
        public String configVersion;

        @NameInMap("ConfigValueList")
        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList configValueList;

        @NameInMap("Author")
        public String author;

        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeClusterServiceConfigHistoryResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigHistoryResponseBodyConfig self = new DescribeClusterServiceConfigHistoryResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfig setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfig setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfig setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfig setConfigValueList(DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList configValueList) {
            this.configValueList = configValueList;
            return this;
        }
        public DescribeClusterServiceConfigHistoryResponseBodyConfigConfigValueList getConfigValueList() {
            return this.configValueList;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfig setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public DescribeClusterServiceConfigHistoryResponseBodyConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
