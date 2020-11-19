// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateMyCatCustomImportRequest extends TeaModel {
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
    public java.util.Map<String, ?> tableMap;

    public static CreateMyCatCustomImportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMyCatCustomImportRequest self = new CreateMyCatCustomImportRequest();
        return TeaModel.build(map, self);
    }

    public CreateMyCatCustomImportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMyCatCustomImportRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateMyCatCustomImportRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public CreateMyCatCustomImportRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public CreateMyCatCustomImportRequest setImportDb(String importDb) {
        this.importDb = importDb;
        return this;
    }
    public String getImportDb() {
        return this.importDb;
    }

    public CreateMyCatCustomImportRequest setDstDrdsInstanceId(String dstDrdsInstanceId) {
        this.dstDrdsInstanceId = dstDrdsInstanceId;
        return this;
    }
    public String getDstDrdsInstanceId() {
        return this.dstDrdsInstanceId;
    }

    public CreateMyCatCustomImportRequest setDstDbNme(String dstDbNme) {
        this.dstDbNme = dstDbNme;
        return this;
    }
    public String getDstDbNme() {
        return this.dstDbNme;
    }

    public CreateMyCatCustomImportRequest setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public CreateMyCatCustomImportRequest setDstUser(String dstUser) {
        this.dstUser = dstUser;
        return this;
    }
    public String getDstUser() {
        return this.dstUser;
    }

    public CreateMyCatCustomImportRequest setDstPwd(String dstPwd) {
        this.dstPwd = dstPwd;
        return this;
    }
    public String getDstPwd() {
        return this.dstPwd;
    }

    public CreateMyCatCustomImportRequest setTableMap(java.util.Map<String, ?> tableMap) {
        this.tableMap = tableMap;
        return this;
    }
    public java.util.Map<String, ?> getTableMap() {
        return this.tableMap;
    }

}
