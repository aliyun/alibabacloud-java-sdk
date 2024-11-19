// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateParserRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>iot-8t***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>DataParserTwo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ParserId")
    public Long parserId;

    public static UpdateParserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParserRequest self = new UpdateParserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateParserRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateParserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateParserRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}
