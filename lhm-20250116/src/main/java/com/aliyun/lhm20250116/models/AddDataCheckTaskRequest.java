// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddDataCheckTaskRequest extends TeaModel {
    /**
     * <p>The validation template ID. If not specified, the built-in default template is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("checkTemplateId")
    public String checkTemplateId;

    /**
     * <p>The validation type. Valid values:</p>
     * <ul>
     * <li>0: data volume comparison.</li>
     * <li>1: metric comparison.</li>
     * <li>2: weak content comparison.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkType")
    public Integer checkType;

    /**
     * <p>The ID of the destination data source.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("dstDsType")
    public String dstDsType;

    /**
     * <p>The ID of the source data source.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("srcDsType")
    public String srcDsType;

    /**
     * <p>The table detail creation mode. Valid values:</p>
     * <ul>
     * <li>0: table-by-table fine-grained creation.</li>
     * <li>1: batch creation with the same schema.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("taskMode")
    public Integer taskMode;

    /**
     * <p>The task name. Only Chinese characters, English characters, and digits are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>data_check_task_demo</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static AddDataCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataCheckTaskRequest self = new AddDataCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddDataCheckTaskRequest setCheckTemplateId(String checkTemplateId) {
        this.checkTemplateId = checkTemplateId;
        return this;
    }
    public String getCheckTemplateId() {
        return this.checkTemplateId;
    }

    public AddDataCheckTaskRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public AddDataCheckTaskRequest setDstDsId(String dstDsId) {
        this.dstDsId = dstDsId;
        return this;
    }
    public String getDstDsId() {
        return this.dstDsId;
    }

    public AddDataCheckTaskRequest setDstDsName(String dstDsName) {
        this.dstDsName = dstDsName;
        return this;
    }
    public String getDstDsName() {
        return this.dstDsName;
    }

    public AddDataCheckTaskRequest setDstDsType(String dstDsType) {
        this.dstDsType = dstDsType;
        return this;
    }
    public String getDstDsType() {
        return this.dstDsType;
    }

    public AddDataCheckTaskRequest setSrcDsId(String srcDsId) {
        this.srcDsId = srcDsId;
        return this;
    }
    public String getSrcDsId() {
        return this.srcDsId;
    }

    public AddDataCheckTaskRequest setSrcDsName(String srcDsName) {
        this.srcDsName = srcDsName;
        return this;
    }
    public String getSrcDsName() {
        return this.srcDsName;
    }

    public AddDataCheckTaskRequest setSrcDsType(String srcDsType) {
        this.srcDsType = srcDsType;
        return this;
    }
    public String getSrcDsType() {
        return this.srcDsType;
    }

    public AddDataCheckTaskRequest setTaskMode(Integer taskMode) {
        this.taskMode = taskMode;
        return this;
    }
    public Integer getTaskMode() {
        return this.taskMode;
    }

    public AddDataCheckTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
