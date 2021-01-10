// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBImportTaskRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Collection")
    public String collection;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("Mode")
    public String mode;

    public static CreateDBImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBImportTaskRequest self = new CreateDBImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBImportTaskRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CreateDBImportTaskRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateDBImportTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateDBImportTaskRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
