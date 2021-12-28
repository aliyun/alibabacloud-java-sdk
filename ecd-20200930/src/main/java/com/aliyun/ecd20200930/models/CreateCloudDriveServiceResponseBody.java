// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceResponseBody extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("CdsName")
    public String cdsName;

    @NameInMap("MaxSize")
    public String maxSize;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudDriveServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveServiceResponseBody self = new CreateCloudDriveServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveServiceResponseBody setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCloudDriveServiceResponseBody setCdsName(String cdsName) {
        this.cdsName = cdsName;
        return this;
    }
    public String getCdsName() {
        return this.cdsName;
    }

    public CreateCloudDriveServiceResponseBody setMaxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public String getMaxSize() {
        return this.maxSize;
    }

    public CreateCloudDriveServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
