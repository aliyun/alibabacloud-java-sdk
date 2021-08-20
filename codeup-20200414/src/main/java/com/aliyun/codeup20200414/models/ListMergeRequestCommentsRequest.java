// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListMergeRequestCommentsRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("FromCommit")
    public String fromCommit;

    @NameInMap("ToCommit")
    public String toCommit;

    public static ListMergeRequestCommentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestCommentsRequest self = new ListMergeRequestCommentsRequest();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestCommentsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListMergeRequestCommentsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListMergeRequestCommentsRequest setFromCommit(String fromCommit) {
        this.fromCommit = fromCommit;
        return this;
    }
    public String getFromCommit() {
        return this.fromCommit;
    }

    public ListMergeRequestCommentsRequest setToCommit(String toCommit) {
        this.toCommit = toCommit;
        return this;
    }
    public String getToCommit() {
        return this.toCommit;
    }

}
