// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class UpdateDataCheckTaskRequest extends TeaModel {
    /**
     * <p>The ID of the validation template. If this field is not specified, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("checkTemplateId")
    public String checkTemplateId;

    /**
     * <p>The ID of the destination data source.</p>
     * 
     * <strong>example:</strong>
     * <p>2001</p>
     */
    @NameInMap("dstDsId")
    public String dstDsId;

    /**
     * <p>The name of the destination data source.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_demo</p>
     */
    @NameInMap("dstDsName")
    public String dstDsName;

    /**
     * <p>The type of the destination data source.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("dstDsType")
    public String dstDsType;

    /**
     * <p>The ID of the destination validation engine.</p>
     * 
     * <strong>example:</strong>
     * <p>2001</p>
     */
    @NameInMap("dstEngineId")
    public String dstEngineId;

    /**
     * <p>The name of the destination validation engine.</p>
     * 
     * <strong>example:</strong>
     * <p>engine_demo</p>
     */
    @NameInMap("dstEngineName")
    public String dstEngineName;

    /**
     * <p>The type of the destination validation engine.</p>
     * 
     * <strong>example:</strong>
     * <p>Tez</p>
     */
    @NameInMap("dstEngineType")
    public String dstEngineType;

    /**
     * <p>The ID of the task to modify. This field is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The ID of the source data source.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("srcDsId")
    public String srcDsId;

    /**
     * <p>The name of the source data source.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_demo</p>
     */
    @NameInMap("srcDsName")
    public String srcDsName;

    /**
     * <p>The type of the source data source.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("srcDsType")
    public String srcDsType;

    /**
     * <p>The ID of the source validation engine.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("srcEngineId")
    public String srcEngineId;

    /**
     * <p>The name of the source validation engine.</p>
     * 
     * <strong>example:</strong>
     * <p>engine_demo</p>
     */
    @NameInMap("srcEngineName")
    public String srcEngineName;

    /**
     * <p>The type of the source validation engine.</p>
     * 
     * <strong>example:</strong>
     * <p>Tez</p>
     */
    @NameInMap("srcEngineType")
    public String srcEngineType;

    /**
     * <p>The description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Data validation task description</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    /**
     * <p>The name of the task. Only Chinese characters, English letters, and digits are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>data_check_task_demo</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static UpdateDataCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCheckTaskRequest self = new UpdateDataCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataCheckTaskRequest setCheckTemplateId(String checkTemplateId) {
        this.checkTemplateId = checkTemplateId;
        return this;
    }
    public String getCheckTemplateId() {
        return this.checkTemplateId;
    }

    public UpdateDataCheckTaskRequest setDstDsId(String dstDsId) {
        this.dstDsId = dstDsId;
        return this;
    }
    public String getDstDsId() {
        return this.dstDsId;
    }

    public UpdateDataCheckTaskRequest setDstDsName(String dstDsName) {
        this.dstDsName = dstDsName;
        return this;
    }
    public String getDstDsName() {
        return this.dstDsName;
    }

    public UpdateDataCheckTaskRequest setDstDsType(String dstDsType) {
        this.dstDsType = dstDsType;
        return this;
    }
    public String getDstDsType() {
        return this.dstDsType;
    }

    public UpdateDataCheckTaskRequest setDstEngineId(String dstEngineId) {
        this.dstEngineId = dstEngineId;
        return this;
    }
    public String getDstEngineId() {
        return this.dstEngineId;
    }

    public UpdateDataCheckTaskRequest setDstEngineName(String dstEngineName) {
        this.dstEngineName = dstEngineName;
        return this;
    }
    public String getDstEngineName() {
        return this.dstEngineName;
    }

    public UpdateDataCheckTaskRequest setDstEngineType(String dstEngineType) {
        this.dstEngineType = dstEngineType;
        return this;
    }
    public String getDstEngineType() {
        return this.dstEngineType;
    }

    public UpdateDataCheckTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataCheckTaskRequest setSrcDsId(String srcDsId) {
        this.srcDsId = srcDsId;
        return this;
    }
    public String getSrcDsId() {
        return this.srcDsId;
    }

    public UpdateDataCheckTaskRequest setSrcDsName(String srcDsName) {
        this.srcDsName = srcDsName;
        return this;
    }
    public String getSrcDsName() {
        return this.srcDsName;
    }

    public UpdateDataCheckTaskRequest setSrcDsType(String srcDsType) {
        this.srcDsType = srcDsType;
        return this;
    }
    public String getSrcDsType() {
        return this.srcDsType;
    }

    public UpdateDataCheckTaskRequest setSrcEngineId(String srcEngineId) {
        this.srcEngineId = srcEngineId;
        return this;
    }
    public String getSrcEngineId() {
        return this.srcEngineId;
    }

    public UpdateDataCheckTaskRequest setSrcEngineName(String srcEngineName) {
        this.srcEngineName = srcEngineName;
        return this;
    }
    public String getSrcEngineName() {
        return this.srcEngineName;
    }

    public UpdateDataCheckTaskRequest setSrcEngineType(String srcEngineType) {
        this.srcEngineType = srcEngineType;
        return this;
    }
    public String getSrcEngineType() {
        return this.srcEngineType;
    }

    public UpdateDataCheckTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public UpdateDataCheckTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
