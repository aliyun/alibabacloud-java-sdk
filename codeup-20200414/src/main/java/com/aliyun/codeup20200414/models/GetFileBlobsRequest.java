// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetFileBlobsRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("From")
    public Long from;

    @NameInMap("To")
    public Long to;

    @NameInMap("SubUserId")
    public String subUserId;

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

    public GetFileBlobsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetFileBlobsRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public GetFileBlobsRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public GetFileBlobsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetFileBlobsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public GetFileBlobsRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
