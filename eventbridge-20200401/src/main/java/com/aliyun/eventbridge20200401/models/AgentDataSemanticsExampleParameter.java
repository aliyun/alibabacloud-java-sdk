// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AgentDataSemanticsExampleParameter extends TeaModel {
    /**
     * <p>The data type of the parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>date</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The parameter description.</p>
     * 
     * <strong>example:</strong>
     * <p>The lower bound of the transaction date</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameter name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>start_date</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The example value of the parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01</p>
     */
    @NameInMap("Value")
    public String value;

    public static AgentDataSemanticsExampleParameter build(java.util.Map<String, ?> map) throws Exception {
        AgentDataSemanticsExampleParameter self = new AgentDataSemanticsExampleParameter();
        return TeaModel.build(map, self);
    }

    public AgentDataSemanticsExampleParameter setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public AgentDataSemanticsExampleParameter setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentDataSemanticsExampleParameter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentDataSemanticsExampleParameter setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
