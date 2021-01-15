// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class MonitorItem extends TeaModel {
    // 解析代码
    @NameInMap("AnalysisCode")
    public String analysisCode;

    // 采集类型
    @NameInMap("CollectionType")
    public String collectionType;

    // 采集配置
    @NameInMap("Config")
    public String config;

    // 描述
    @NameInMap("MonitorItemDescription")
    public String monitorItemDescription;

    // 是否启用
    @NameInMap("Enable")
    public Integer enable;

    // 采集间隔
    @NameInMap("ExecInterval")
    public String execInterval;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 更新时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 监控项名称
    @NameInMap("MonitorItemName")
    public String monitorItemName;

    // 安全域
    @NameInMap("SecurityDomain")
    public String securityDomain;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

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

    public MonitorItem setMonitorItemDescription(String monitorItemDescription) {
        this.monitorItemDescription = monitorItemDescription;
        return this;
    }
    public String getMonitorItemDescription() {
        return this.monitorItemDescription;
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

    public MonitorItem setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

}
