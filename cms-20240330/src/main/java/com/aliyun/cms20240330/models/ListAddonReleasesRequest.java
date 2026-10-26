// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAddonReleasesRequest extends TeaModel {
    /**
     * <p>The add-on name.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-gpu</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public String maxResults;

    /**
     * <p>The next token for pagination.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The parent add-on release ID.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-xxxxxxxxxxxxx</p>
     */
    @NameInMap("parentAddonReleaseId")
    public String parentAddonReleaseId;

    public static ListAddonReleasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddonReleasesRequest self = new ListAddonReleasesRequest();
        return TeaModel.build(map, self);
    }

    public ListAddonReleasesRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListAddonReleasesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListAddonReleasesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAddonReleasesRequest setParentAddonReleaseId(String parentAddonReleaseId) {
        this.parentAddonReleaseId = parentAddonReleaseId;
        return this;
    }
    public String getParentAddonReleaseId() {
        return this.parentAddonReleaseId;
    }

}
