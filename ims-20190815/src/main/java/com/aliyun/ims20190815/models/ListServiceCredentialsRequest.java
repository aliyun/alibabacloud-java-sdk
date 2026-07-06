// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListServiceCredentialsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query service credentials for all Resource Access Management (RAM) users under the Alibaba Cloud account.</p>
     * <p>If this parameter is set to true, you cannot specify UserPrincipalName at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AllUsers")
    public Boolean allUsers;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. You do not need to specify this parameter for the first API call.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE*******</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The service name of the Alibaba Cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.aliyuncs.com</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The logon name of the Resource Access Management (RAM) user.</p>
     * <p>Queries the service credentials of the specified RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static ListServiceCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceCredentialsRequest self = new ListServiceCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceCredentialsRequest setAllUsers(Boolean allUsers) {
        this.allUsers = allUsers;
        return this;
    }
    public Boolean getAllUsers() {
        return this.allUsers;
    }

    public ListServiceCredentialsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceCredentialsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceCredentialsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListServiceCredentialsRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
