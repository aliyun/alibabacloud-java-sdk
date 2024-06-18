// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessTagsRequest extends TeaModel {
    /**
     * <p>The ID of the internal access application. You can obtain the application ID by calling the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: queries all internal access applications.</li>
     * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an internal access application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The page number. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the internal access tag. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>tag_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the internal access policy. You can obtain the policy ID by calling the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: queries all internal access policies.</li>
     * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: creates an internal access policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-54a7838a48bf****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>Specifies whether to enable the simple query mode. A value of true specifies that policy IDs are not queried.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SimpleMode")
    public Boolean simpleMode;

    /**
     * <p>The IDs of internal access tags. You can specify up to 100 tag IDs.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static ListPrivateAccessTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessTagsRequest self = new ListPrivateAccessTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessTagsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListPrivateAccessTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPrivateAccessTagsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPrivateAccessTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPrivateAccessTagsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListPrivateAccessTagsRequest setSimpleMode(Boolean simpleMode) {
        this.simpleMode = simpleMode;
        return this;
    }
    public Boolean getSimpleMode() {
        return this.simpleMode;
    }

    public ListPrivateAccessTagsRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}
