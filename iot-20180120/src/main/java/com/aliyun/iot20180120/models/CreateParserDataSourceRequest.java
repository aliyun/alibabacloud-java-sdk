// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateParserDataSourceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>iot-w2****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataSource</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateParserDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParserDataSourceRequest self = new CreateParserDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateParserDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParserDataSourceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateParserDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
