// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityWatchAlertRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpsertCommand")
    public UpsertQualityWatchAlertRequestUpsertCommand upsertCommand;

    public static UpsertQualityWatchAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityWatchAlertRequest self = new UpsertQualityWatchAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityWatchAlertRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityWatchAlertRequest setUpsertCommand(UpsertQualityWatchAlertRequestUpsertCommand upsertCommand) {
        this.upsertCommand = upsertCommand;
        return this;
    }
    public UpsertQualityWatchAlertRequestUpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static class UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList self = new UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList self = new UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo extends TeaModel {
        @NameInMap("AlertDutyChannelList")
        public java.util.List<String> alertDutyChannelList;

        @NameInMap("AlertDutyList")
        public java.util.List<UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList> alertDutyList;

        @NameInMap("AlertQualityOwnerChannelList")
        public java.util.List<String> alertQualityOwnerChannelList;

        @NameInMap("AlertUserChannelList")
        public java.util.List<String> alertUserChannelList;

        @NameInMap("AlertUserList")
        public java.util.List<UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList> alertUserList;

        @NameInMap("EnableAlertQualityOwner")
        public Boolean enableAlertQualityOwner;

        public static UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo self = new UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo setAlertDutyChannelList(java.util.List<String> alertDutyChannelList) {
            this.alertDutyChannelList = alertDutyChannelList;
            return this;
        }
        public java.util.List<String> getAlertDutyChannelList() {
            return this.alertDutyChannelList;
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo setAlertDutyList(java.util.List<UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList> alertDutyList) {
            this.alertDutyList = alertDutyList;
            return this;
        }
        public java.util.List<UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertDutyList> getAlertDutyList() {
            return this.alertDutyList;
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo setAlertQualityOwnerChannelList(java.util.List<String> alertQualityOwnerChannelList) {
            this.alertQualityOwnerChannelList = alertQualityOwnerChannelList;
            return this;
        }
        public java.util.List<String> getAlertQualityOwnerChannelList() {
            return this.alertQualityOwnerChannelList;
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo setAlertUserChannelList(java.util.List<String> alertUserChannelList) {
            this.alertUserChannelList = alertUserChannelList;
            return this;
        }
        public java.util.List<String> getAlertUserChannelList() {
            return this.alertUserChannelList;
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo setAlertUserList(java.util.List<UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList> alertUserList) {
            this.alertUserList = alertUserList;
            return this;
        }
        public java.util.List<UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfoAlertUserList> getAlertUserList() {
            return this.alertUserList;
        }

        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo setEnableAlertQualityOwner(Boolean enableAlertQualityOwner) {
            this.enableAlertQualityOwner = enableAlertQualityOwner;
            return this;
        }
        public Boolean getEnableAlertQualityOwner() {
            return this.enableAlertQualityOwner;
        }

    }

    public static class UpsertQualityWatchAlertRequestUpsertCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("QualityAlertInfo")
        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo qualityAlertInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static UpsertQualityWatchAlertRequestUpsertCommand build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityWatchAlertRequestUpsertCommand self = new UpsertQualityWatchAlertRequestUpsertCommand();
            return TeaModel.build(map, self);
        }

        public UpsertQualityWatchAlertRequestUpsertCommand setQualityAlertInfo(UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo qualityAlertInfo) {
            this.qualityAlertInfo = qualityAlertInfo;
            return this;
        }
        public UpsertQualityWatchAlertRequestUpsertCommandQualityAlertInfo getQualityAlertInfo() {
            return this.qualityAlertInfo;
        }

        public UpsertQualityWatchAlertRequestUpsertCommand setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
