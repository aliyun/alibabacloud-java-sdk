// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("actualTime")
    public String actualTime;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtEnd")
    public String gmtEnd;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtStart")
    public String gmtStart;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("recordUserIdentifier")
    public String recordUserIdentifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workitemIdentifier")
    public String workitemIdentifier;

    public static CreateWorkitemRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemRecordRequest self = new CreateWorkitemRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemRecordRequest setActualTime(String actualTime) {
        this.actualTime = actualTime;
        return this;
    }
    public String getActualTime() {
        return this.actualTime;
    }

    public CreateWorkitemRecordRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkitemRecordRequest setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    public CreateWorkitemRecordRequest setGmtStart(String gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public String getGmtStart() {
        return this.gmtStart;
    }

    public CreateWorkitemRecordRequest setRecordUserIdentifier(String recordUserIdentifier) {
        this.recordUserIdentifier = recordUserIdentifier;
        return this;
    }
    public String getRecordUserIdentifier() {
        return this.recordUserIdentifier;
    }

    public CreateWorkitemRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateWorkitemRecordRequest setWorkitemIdentifier(String workitemIdentifier) {
        this.workitemIdentifier = workitemIdentifier;
        return this;
    }
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

}
