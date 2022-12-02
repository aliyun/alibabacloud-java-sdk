// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class MonitorItem extends TeaModel {
    @NameInMap("AnalysisCode")
    public String analysisCode;

    @NameInMap("CollectionType")
    public String collectionType;

    @NameInMap("Config")
    public String config;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("ExecInterval")
    public String execInterval;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("MonitorItemDescription")
    public String monitorItemDescription;

    @NameInMap("MonitorItemId")
    public String monitorItemId;

    @NameInMap("MonitorItemName")
    public String monitorItemName;

    @NameInMap("SecurityDomain")
    public String securityDomain;

    public static MonitorItem build(java.util.Map<String, ?> map) throws Exception {
        MonitorItem self = new MonitorItem();
        return TeaModel.build(map, self);
    }

    public MonitorItem setAnalysisCode(String analysisCode) {
        this.analysisCode = analysisCode;
        return this;
    }
    public String getAnalysisCode() {
        return this.analysisCode;
    }

    public MonitorItem setCollectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }
    public String getCollectionType() {
        return this.collectionType;
    }

    public MonitorItem setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public MonitorItem setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public MonitorItem setExecInterval(String execInterval) {
        this.execInterval = execInterval;
        return this;
    }
    public String getExecInterval() {
        return this.execInterval;
    }

    public MonitorItem setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MonitorItem setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MonitorItem setMonitorItemDescription(String monitorItemDescription) {
        this.monitorItemDescription = monitorItemDescription;
        return this;
    }
    public String getMonitorItemDescription() {
        return this.monitorItemDescription;
    }

    public MonitorItem setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public MonitorItem setMonitorItemName(String monitorItemName) {
        this.monitorItemName = monitorItemName;
        return this;
    }
    public String getMonitorItemName() {
        return this.monitorItemName;
    }

    public MonitorItem setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

}
