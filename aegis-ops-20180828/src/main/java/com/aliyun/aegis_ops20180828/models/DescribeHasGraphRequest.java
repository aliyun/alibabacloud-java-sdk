// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeHasGraphRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("SecurityAlarmList")
    public java.util.List<DescribeHasGraphRequestSecurityAlarmList> securityAlarmList;

    public static DescribeHasGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHasGraphRequest self = new DescribeHasGraphRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHasGraphRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeHasGraphRequest setSecurityAlarmList(java.util.List<DescribeHasGraphRequestSecurityAlarmList> securityAlarmList) {
        this.securityAlarmList = securityAlarmList;
        return this;
    }
    public java.util.List<DescribeHasGraphRequestSecurityAlarmList> getSecurityAlarmList() {
        return this.securityAlarmList;
    }

    public static class DescribeHasGraphRequestSecurityAlarmListSecurityEventList extends TeaModel {
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        public static DescribeHasGraphRequestSecurityAlarmListSecurityEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHasGraphRequestSecurityAlarmListSecurityEventList self = new DescribeHasGraphRequestSecurityAlarmListSecurityEventList();
            return TeaModel.build(map, self);
        }

        public DescribeHasGraphRequestSecurityAlarmListSecurityEventList setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeHasGraphRequestSecurityAlarmListSecurityEventList setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

    }

    public static class DescribeHasGraphRequestSecurityAlarmList extends TeaModel {
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        @NameInMap("SecurityEventList")
        public java.util.List<DescribeHasGraphRequestSecurityAlarmListSecurityEventList> securityEventList;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeHasGraphRequestSecurityAlarmList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHasGraphRequestSecurityAlarmList self = new DescribeHasGraphRequestSecurityAlarmList();
            return TeaModel.build(map, self);
        }

        public DescribeHasGraphRequestSecurityAlarmList setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeHasGraphRequestSecurityAlarmList setSecurityEventList(java.util.List<DescribeHasGraphRequestSecurityAlarmListSecurityEventList> securityEventList) {
            this.securityEventList = securityEventList;
            return this;
        }
        public java.util.List<DescribeHasGraphRequestSecurityAlarmListSecurityEventList> getSecurityEventList() {
            return this.securityEventList;
        }

        public DescribeHasGraphRequestSecurityAlarmList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
