// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatCustomImportPreCheckRequest extends TeaModel {
    @NameInMap("DstDbNme")
    public String dstDbNme;

    @NameInMap("DstDrdsInstanceId")
    public String dstDrdsInstanceId;

    @NameInMap("DstPort")
    public Integer dstPort;

    @NameInMap("DstPwd")
    public String dstPwd;

    @NameInMap("DstUser")
    public String dstUser;

    @NameInMap("ImportDb")
    public String importDb;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleUrl")
    public String ruleUrl;

    @NameInMap("SchemaUrl")
    public String schemaUrl;

    @NameInMap("TableMap")
    public java.util.Map<String, ?> tableMap;

    @NameInMap("TaskName")
    public String taskName;

    public static MyCatCustomImportPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        MyCatCustomImportPreCheckRequest self = new MyCatCustomImportPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public MyCatCustomImportPreCheckRequest setDstDbNme(String dstDbNme) {
        this.dstDbNme = dstDbNme;
        return this;
    }
    public String getDstDbNme() {
        return this.dstDbNme;
    }

    public MyCatCustomImportPreCheckRequest setDstDrdsInstanceId(String dstDrdsInstanceId) {
        this.dstDrdsInstanceId = dstDrdsInstanceId;
        return this;
    }
    public String getDstDrdsInstanceId() {
        return this.dstDrdsInstanceId;
    }

    public MyCatCustomImportPreCheckRequest setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public MyCatCustomImportPreCheckRequest setDstPwd(String dstPwd) {
        this.dstPwd = dstPwd;
        return this;
    }
    public String getDstPwd() {
        return this.dstPwd;
    }

    public MyCatCustomImportPreCheckRequest setDstUser(String dstUser) {
        this.dstUser = dstUser;
        return this;
    }
    public String getDstUser() {
        return this.dstUser;
    }

    public MyCatCustomImportPreCheckRequest setImportDb(String importDb) {
        this.importDb = importDb;
        return this;
    }
    public String getImportDb() {
        return this.importDb;
    }

    public MyCatCustomImportPreCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MyCatCustomImportPreCheckRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public MyCatCustomImportPreCheckRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public MyCatCustomImportPreCheckRequest setTableMap(java.util.Map<String, ?> tableMap) {
        this.tableMap = tableMap;
        return this;
    }
    public java.util.Map<String, ?> getTableMap() {
        return this.tableMap;
    }

    public MyCatCustomImportPreCheckRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
