// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticSecurityPoliciesRequest extends TeaModel {
    /**
     * <p>Specifies whether to include archived policies in the query scope of user policies. Valid values:</p>
     * <ul>
     * <li>true: Includes archived policies.</li>
     * <li>false: Does not include archived policies.
     * Default value: false. When querying archived policies, do not specify PolicyStatus. If ON or OFF is specified, only user policies in the corresponding state are returned. This parameter does not affect system default policies.</li>
     * </ul>
     */
    @NameInMap("IncludeArchived")
    public Boolean includeArchived;

    /**
     * <p>The page number of the user policies to query. Pages start from 1. Default value: 1. Only user policies are paginated. System default policies are returned separately in each call.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The filter condition for the user policy status. Valid values: ON (enabled) and OFF (disabled). If this parameter is not specified or contains only whitespace characters, policies are not filtered by status. You cannot specify ARCHIVED. To query archived user policies, do not specify this parameter and set IncludeArchived to true. This parameter does not affect system default policies.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("PolicyStatus")
    public String policyStatus;

    /**
     * <p>The number of user policies to query on each page. Valid values: 1 to 100. Default value: 20. In addition, each call returns up to Size enabled system default policies. Therefore, the number of items in the returned Data may be greater than Size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static ListAgenticSecurityPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticSecurityPoliciesRequest self = new ListAgenticSecurityPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgenticSecurityPoliciesRequest setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
        return this;
    }
    public Boolean getIncludeArchived() {
        return this.includeArchived;
    }

    public ListAgenticSecurityPoliciesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListAgenticSecurityPoliciesRequest setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public ListAgenticSecurityPoliciesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
