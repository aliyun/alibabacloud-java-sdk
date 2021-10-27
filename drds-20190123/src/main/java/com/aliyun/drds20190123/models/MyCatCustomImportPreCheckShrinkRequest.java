// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatCustomImportPreCheckShrinkRequest extends TeaModel {
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
    public String tableMapShrink;

    @NameInMap("TaskName")
    public String taskName;

    public static MyCatCustomImportPreCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MyCatCustomImportPreCheckShrinkRequest self = new MyCatCustomImportPreCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstDbNme(String dstDbNme) {
        this.dstDbNme = dstDbNme;
        return this;
    }
    public String getDstDbNme() {
        return this.dstDbNme;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstDrdsInstanceId(String dstDrdsInstanceId) {
        this.dstDrdsInstanceId = dstDrdsInstanceId;
        return this;
    }
    public String getDstDrdsInstanceId() {
        return this.dstDrdsInstanceId;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstPwd(String dstPwd) {
        this.dstPwd = dstPwd;
        return this;
    }
    public String getDstPwd() {
        return this.dstPwd;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstUser(String dstUser) {
        this.dstUser = dstUser;
        return this;
    }
    public String getDstUser() {
        return this.dstUser;
    }

    public MyCatCustomImportPreCheckShrinkRequest setImportDb(String importDb) {
        this.importDb = importDb;
        return this;
    }
    public String getImportDb() {
        return this.importDb;
    }

    public MyCatCustomImportPreCheckShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MyCatCustomImportPreCheckShrinkRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public MyCatCustomImportPreCheckShrinkRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public MyCatCustomImportPreCheckShrinkRequest setTableMapShrink(String tableMapShrink) {
        this.tableMapShrink = tableMapShrink;
        return this;
    }
    public String getTableMapShrink() {
        return this.tableMapShrink;
    }

    public MyCatCustomImportPreCheckShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
