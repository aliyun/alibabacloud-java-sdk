// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDeviceDistributeJobRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * <p>The <strong>NextToken</strong> or <strong>CurrentPage</strong> parameter specifies a condition for displaying the results. You can specify one of the two parameters. If you specify both parameters at the same time, the <strong>NextToken parameter</strong> is used.</p>
     * <p>For information about the <strong>NextToken</strong> parameter, see the description of the <strong>NextToken</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the distribution task. The ID is globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>UbmsMHmkqv0PiAG****010001</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The token that is used to retrieve subsequent pages of the query results. The first time you perform a query operation, you do not need to specify this parameter.</p>
     * <p>The <strong>NextToken</strong> or <strong>CurrentPage</strong> parameter specifies a condition for displaying the results. You can specify one of the two parameters. If you specify both parameters at the same time, the <strong>NextToken</strong> parameter is used.</p>
     * <p><strong>Important</strong></p>
     * <p>The offset in the number of results is obtained by using the following formula: <strong>PageSize</strong> × (<strong>CurrentPage</strong> - 1).</p>
     * <p>If the offset is greater than 10,000, you must use the token that is returned in the previous query as the value of the <strong>NextToken</strong> parameter to obtain the value of the <strong>Data</strong> parameter. Otherwise, the current request is terminated and the value of the <strong>Data</strong> parameter cannot be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 200.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>a1T27vz****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The status of the device distribution task.</p>
     * <ul>
     * <li><strong>0</strong>: The task is being initialized.</li>
     * <li><strong>1</strong>: The task is running.</li>
     * <li><strong>2</strong>: The task is completed. The status indicates that the distribution task is complete but does not indicate that all products and devices are distributed. To obtain distribution results, call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation.</li>
     * <li><strong>3</strong>: The task is unexpectedly interrupted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the Alibaba Cloud account to which the devices are distributed.</p>
     * 
     * <strong>example:</strong>
     * <p>198***</p>
     */
    @NameInMap("TargetUid")
    public String targetUid;

    public static ListDeviceDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceDistributeJobRequest self = new ListDeviceDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceDistributeJobRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeviceDistributeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListDeviceDistributeJobRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeviceDistributeJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeviceDistributeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListDeviceDistributeJobRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListDeviceDistributeJobRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

}
