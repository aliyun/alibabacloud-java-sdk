// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListApplicationRequest extends TeaModel {
    /**
     * <p>Keywords in the app name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The pagination size of the resulting value cannot be less than the minimum value of 1 and cannot be greater than the maximum value of 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination page number of the resulting value cannot be less than the minimum value of 1 and cannot be greater than the maximum value of 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>1 update time,<br>2 creation time</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public Long orderType;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource Id</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxxxxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ShowHide")
    public Boolean showHide;

    /**
     * <p>The status of the applications to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The following values are &quot;success&quot; and &quot;release&quot;.
     * If the input value is &quot;success&quot;, the returned application list includes all applications in the Deployed_Success state of successful deployment.
     * If the input value is release, the returned application list includes all applications in the release success (Destroyed_Success) and release failure (Destroyed_Failure) status.
     * If this parameter is left blank, the returned app list includes apps in all states.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Template Id</p>
     * 
     * <strong>example:</strong>
     * <p>0KSXXX6SJU03TXXX</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static ListApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRequest self = new ListApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListApplicationRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListApplicationRequest setOrderType(Long orderType) {
        this.orderType = orderType;
        return this;
    }
    public Long getOrderType() {
        return this.orderType;
    }

    public ListApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListApplicationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListApplicationRequest setShowHide(Boolean showHide) {
        this.showHide = showHide;
        return this;
    }
    public Boolean getShowHide() {
        return this.showHide;
    }

    public ListApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListApplicationRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
