// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetFileBlobsRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("From")
    public Long from;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("SubUserId")
    public String subUserId;

    @NameInMap("To")
    public Long to;

    public static GetFileBlobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileBlobsRequest self = new GetFileBlobsRequest();
        return TeaModel.build(map, self);
    }

    public GetFileBlobsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetFileBlobsRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public GetFileBlobsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetFileBlobsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetFileBlobsRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public GetFileBlobsRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

    public GetFileBlobsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
