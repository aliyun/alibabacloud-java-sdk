// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBExportTaskRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("SpaceId")
    public String spaceId;

    public static CreateDBExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBExportTaskRequest self = new CreateDBExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBExportTaskRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateDBExportTaskRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public CreateDBExportTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateDBExportTaskRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
