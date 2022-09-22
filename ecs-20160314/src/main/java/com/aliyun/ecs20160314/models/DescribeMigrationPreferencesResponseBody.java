// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationPreferencesResponseBody extends TeaModel {
    @NameInMap("MigrationNetworkType")
    public String migrationNetworkType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TargetZoneIdSet")
    public TargetZoneIdSet targetZoneIdSet;

    public static DescribeMigrationPreferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationPreferencesResponseBody self = new DescribeMigrationPreferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationPreferencesResponseBody setMigrationNetworkType(String migrationNetworkType) {
        this.migrationNetworkType = migrationNetworkType;
        return this;
    }
    public String getMigrationNetworkType() {
        return this.migrationNetworkType;
    }

    public DescribeMigrationPreferencesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMigrationPreferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationPreferencesResponseBody setTargetZoneIdSet(TargetZoneIdSet targetZoneIdSet) {
        this.targetZoneIdSet = targetZoneIdSet;
        return this;
    }
    public TargetZoneIdSet getTargetZoneIdSet() {
        return this.targetZoneIdSet;
    }

    public static class TargetZoneIdSet extends TeaModel {
        @NameInMap("TargetZoneId")
        public java.util.List<String> targetZoneId;

        public static TargetZoneIdSet build(java.util.Map<String, ?> map) throws Exception {
            TargetZoneIdSet self = new TargetZoneIdSet();
            return TeaModel.build(map, self);
        }

        public TargetZoneIdSet setTargetZoneId(java.util.List<String> targetZoneId) {
            this.targetZoneId = targetZoneId;
            return this;
        }
        public java.util.List<String> getTargetZoneId() {
            return this.targetZoneId;
        }

    }

}
