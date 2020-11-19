// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatCustomImportPreCheckShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskName")
    @Validation(required = true)
    public String taskName;

    @NameInMap("SchemaUrl")
    @Validation(required = true)
    public String schemaUrl;

    @NameInMap("RuleUrl")
    @Validation(required = true)
    public String ruleUrl;

    @NameInMap("ImportDb")
    @Validation(required = true)
    public String importDb;

    @NameInMap("DstDrdsInstanceId")
    @Validation(required = true)
    public String dstDrdsInstanceId;

    @NameInMap("DstDbNme")
    @Validation(required = true)
    public String dstDbNme;

    @NameInMap("DstPort")
    @Validation(required = true)
    public Integer dstPort;

    @NameInMap("DstUser")
    @Validation(required = true)
    public String dstUser;

    @NameInMap("DstPwd")
    @Validation(required = true)
    public String dstPwd;

    @NameInMap("TableMap")
    public String tableMapShrink;

    public static MyCatCustomImportPreCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MyCatCustomImportPreCheckShrinkRequest self = new MyCatCustomImportPreCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MyCatCustomImportPreCheckShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MyCatCustomImportPreCheckShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public MyCatCustomImportPreCheckShrinkRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public MyCatCustomImportPreCheckShrinkRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public MyCatCustomImportPreCheckShrinkRequest setImportDb(String importDb) {
        this.importDb = importDb;
        return this;
    }
    public String getImportDb() {
        return this.importDb;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstDrdsInstanceId(String dstDrdsInstanceId) {
        this.dstDrdsInstanceId = dstDrdsInstanceId;
        return this;
    }
    public String getDstDrdsInstanceId() {
        return this.dstDrdsInstanceId;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstDbNme(String dstDbNme) {
        this.dstDbNme = dstDbNme;
        return this;
    }
    public String getDstDbNme() {
        return this.dstDbNme;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstUser(String dstUser) {
        this.dstUser = dstUser;
        return this;
    }
    public String getDstUser() {
        return this.dstUser;
    }

    public MyCatCustomImportPreCheckShrinkRequest setDstPwd(String dstPwd) {
        this.dstPwd = dstPwd;
        return this;
    }
    public String getDstPwd() {
        return this.dstPwd;
    }

    public MyCatCustomImportPreCheckShrinkRequest setTableMapShrink(String tableMapShrink) {
        this.tableMapShrink = tableMapShrink;
        return this;
    }
    public String getTableMapShrink() {
        return this.tableMapShrink;
    }

}
