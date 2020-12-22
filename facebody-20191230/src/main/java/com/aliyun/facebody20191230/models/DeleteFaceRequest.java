// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("FaceId")
    public String faceId;

    public static DeleteFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRequest self = new DeleteFaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DeleteFaceRequest setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

}
