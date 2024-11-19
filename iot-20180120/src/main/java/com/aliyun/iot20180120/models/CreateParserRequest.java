// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateParserRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>iot-n8t***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataParser</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateParserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParserRequest self = new CreateParserRequest();
        return TeaModel.build(map, self);
    }

    public CreateParserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParserRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateParserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
