// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventMarkMissListRequest extends TeaModel {
    /**
     * <p>Specifies the page number of the returned page. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The disposal method of the rule. The current query does not filter by this field, and you do not need to set it. Valid values:</p>
     * <ul>
     * <li><strong>auto_add_white</strong>: Automatic whitelisting.</li>
     * <li><strong>defense_not_notification</strong>: Defense only without notification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>auto_add_white</p>
     */
    @NameInMap("DisposalWay")
    public String disposalWay;

    /**
     * <p>The name of the alert event (subtype).</p>
     * 
     * <strong>example:</strong>
     * <p>Untrusted process startup</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The maximum number of records to return in a single query. This field is reserved for compatibility. The backend currently uses CurrentPage and PageSize for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>****==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of whitelist rules to return on each page in a paging query. Default value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static DescribeSecurityEventMarkMissListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventMarkMissListRequest self = new DescribeSecurityEventMarkMissListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventMarkMissListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSecurityEventMarkMissListRequest setDisposalWay(String disposalWay) {
        this.disposalWay = disposalWay;
        return this;
    }
    public String getDisposalWay() {
        return this.disposalWay;
    }

    public DescribeSecurityEventMarkMissListRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeSecurityEventMarkMissListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSecurityEventMarkMissListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSecurityEventMarkMissListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityEventMarkMissListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
