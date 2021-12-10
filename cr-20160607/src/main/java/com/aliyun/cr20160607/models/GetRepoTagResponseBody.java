// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoTagResponseBody extends TeaModel {
    @NameInMap("digest")
    public String digest;

    @NameInMap("imageCreate")
    public Long imageCreate;

    @NameInMap("imageId")
    public String imageId;

    @NameInMap("imageSize")
    public Long imageSize;

    @NameInMap("imageUpdate")
    public Long imageUpdate;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    @NameInMap("tag")
    public String tag;

    public static GetRepoTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagResponseBody self = new GetRepoTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoTagResponseBody setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public GetRepoTagResponseBody setImageCreate(Long imageCreate) {
        this.imageCreate = imageCreate;
        return this;
    }
    public Long getImageCreate() {
        return this.imageCreate;
    }

    public GetRepoTagResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetRepoTagResponseBody setImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }
    public Long getImageSize() {
        return this.imageSize;
    }

    public GetRepoTagResponseBody setImageUpdate(Long imageUpdate) {
        this.imageUpdate = imageUpdate;
        return this;
    }
    public Long getImageUpdate() {
        return this.imageUpdate;
    }

    public GetRepoTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoTagResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRepoTagResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
